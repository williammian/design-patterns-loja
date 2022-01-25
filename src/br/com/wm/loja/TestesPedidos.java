package br.com.wm.loja;

import java.math.BigDecimal;

import br.com.wm.loja.pedido.GeraPedido;
import br.com.wm.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
		handler.execute(dados);
	}

}
