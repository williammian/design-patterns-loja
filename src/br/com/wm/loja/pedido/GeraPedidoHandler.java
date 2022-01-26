package br.com.wm.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.wm.loja.orcamento.Orcamento;
import br.com.wm.loja.pedido.acao.AcaoAposGerarPedido;

//Command Handler
public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		//Observer
		acoes.forEach(a -> a.executarAcao(pedido));
	}

}
