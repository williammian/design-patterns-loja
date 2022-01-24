package br.com.wm.loja;

import java.math.BigDecimal;

import br.com.wm.loja.imposto.CalculadoraDeImpostos;
import br.com.wm.loja.imposto.TipoImposto;
import br.com.wm.loja.orcamento.Orcamento;

public class TestesImpostos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ICMS));
	}

}
