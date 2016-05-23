package com.br.uepb.business.relatorio;

public class RelatorioTeste {

	public static void main(String[] args) {
		RelatorioJogadorBusiness rel = new RelatorioJogadorBusiness();
		try {
			rel.estatisticaFase(1);
			
//			System.out.println(rel.getQtdRespostaCorreta());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
