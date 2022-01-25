package br.com.wm.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.wm.loja.orcamento.Orcamento;

public class GeraPedido {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	//Command
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
		
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no Banco de Dados");
		System.out.println("Enviar email com dados do novo pedido");
	}

}
