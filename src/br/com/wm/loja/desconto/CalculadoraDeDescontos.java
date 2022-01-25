package br.com.wm.loja.desconto;

import java.math.BigDecimal;

import br.com.wm.loja.orcamento.Orcamento;

//Chain of Responsibility
public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
				
		return cadeiaDeDescontos.efetuarCalculo(orcamento);
	}

}
