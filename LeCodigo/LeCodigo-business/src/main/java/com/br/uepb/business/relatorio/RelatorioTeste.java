package com.br.uepb.business.relatorio;


public class RelatorioTeste {

	public static void main(String[] args) {
		RelatorioJogadorBusiness rel = new RelatorioJogadorBusiness("lucas");
		try {
//			rel.estatisticaFase(1);
			rel.estatisticaIndividual(0, null);
			System.out.println(rel.getQtdRespostaCorreta());
			System.out.println(rel.getQtdRespostaErrada());
			System.out.println(rel.getQtdRespostaPulou());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
