package br.com.wm.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.wm.loja.orcamento.Orcamento;
import br.com.wm.loja.pedido.Pedido;

public class TestesPedidos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
		String cliente = "Ana da Silva";
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(cliente, data, orcamento);
		
		System.out.println("Salvar pedido no Banco de Dados");
		System.out.println("Enviar email com dados do novo pedido");
	}

}
