package br.com.wm.loja.pedido.acao;

import br.com.wm.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido!");
	}

}
