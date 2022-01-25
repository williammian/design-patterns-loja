package br.com.wm.loja.orcamento.situacao;

import br.com.wm.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
