package br.com.wm.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.wm.loja.pedido.GeraPedido;
import br.com.wm.loja.pedido.GeraPedidoHandler;
import br.com.wm.loja.pedido.acao.EnviarEmailPedido;
import br.com.wm.loja.pedido.acao.LogDePedido;
import br.com.wm.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = "João";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new SalvarPedidoNoBancoDeDados(),
				new EnviarEmailPedido(),
				new LogDePedido()));
		
		handler.executar(dados);
	}

}
