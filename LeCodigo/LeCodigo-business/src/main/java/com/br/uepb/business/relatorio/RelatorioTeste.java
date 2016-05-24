package com.br.uepb.business.relatorio;

import com.br.uepb.domain.TipoQuestao_Enum;

public class RelatorioTeste {

	public static void main(String[] args) {
		RelatorioJogadorBusiness rel = new RelatorioJogadorBusiness("lucas");
		try {
//			rel.estatisticaFase(1);
//			rel.estatisticaIndividual(0, null);
			rel.estatisticaIndividual(1, null);
			System.out.println("Corretas: "+rel.getQtdRespostaCorreta());
			System.out.println("Erradas: "+rel.getQtdRespostaErrada());
			System.out.println("Pulou: "+rel.getQtdRespostaPulou());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
