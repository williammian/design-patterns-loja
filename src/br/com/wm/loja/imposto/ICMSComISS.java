package br.com.wm.loja.imposto;

import java.math.BigDecimal;

import br.com.wm.loja.orcamento.Orcamento;

public class ICMSComISS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal icms = new ICMS().calcular(orcamento);
		BigDecimal iss = new ISS().calcular(orcamento);
		return icms.add(iss);
	}

}
