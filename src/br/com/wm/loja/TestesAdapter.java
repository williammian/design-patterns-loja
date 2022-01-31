package br.com.wm.loja;

import java.math.BigDecimal;

import br.com.wm.loja.http.JavaHttpClient;
import br.com.wm.loja.orcamento.ItemOrcamento;
import br.com.wm.loja.orcamento.Orcamento;
import br.com.wm.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		
		registro.registrar(orcamento);
	}

}
