package br.com.wm.loja.orcamento;

import java.math.BigDecimal;

import br.com.wm.loja.orcamento.situacao.EmAnalise;
import br.com.wm.loja.orcamento.situacao.Finalizado;
import br.com.wm.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao; //State
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}
	
	//State
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	//State
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	//State
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	//State
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}

}
