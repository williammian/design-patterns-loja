package br.com.wm.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.wm.loja.pedido.GeraPedido;
import br.com.wm.loja.pedido.GeraPedidoHandler;
import br.com.wm.loja.pedido.acao.EnviarEmailPedido;
import br.com.wm.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = "João";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido()));
		handler.execute(dados);
	}

}
