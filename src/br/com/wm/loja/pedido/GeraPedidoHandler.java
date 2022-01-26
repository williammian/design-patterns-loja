package br.com.wm.loja.pedido;

import java.time.LocalDateTime;

import br.com.wm.loja.orcamento.Orcamento;
import br.com.wm.loja.pedido.acao.EnviarEmailPedido;
import br.com.wm.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

//Command Handler
public class GeraPedidoHandler {
	
	//construtor com injecao de dependencias: repository, service, etc
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		EnviarEmailPedido email = new EnviarEmailPedido();
		SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
		
		email.executar(pedido);
		salvar.executar(pedido);
	}

}
