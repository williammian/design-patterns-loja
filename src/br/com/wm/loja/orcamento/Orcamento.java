package br.com.wm.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.wm.loja.orcamento.situacao.EmAnalise;
import br.com.wm.loja.orcamento.situacao.Finalizado;
import br.com.wm.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {
	
	private BigDecimal valor;
	private SituacaoOrcamento situacao; //State
	private List<Orcavel> itens;
 	
	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
		this.itens = new ArrayList<>();
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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return valor;
	}

	public int getQuantidadeItens() {
		return itens.size();
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
	
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}

}
