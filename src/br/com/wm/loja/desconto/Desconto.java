package br.com.wm.loja.desconto;

import java.math.BigDecimal;

import br.com.wm.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	//Template Method
	protected BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
}
