package com.br.uepb.dump;

import conexaoBD.HibernateUtil;

public class PopularQuestoes {

	public static void main(String[] args) {
		PopularTabelaQuestoes popularFase1 = new PopularTabelaQuestoes();
		popularFase1.popularQuestoes_Fase1();
		
		HibernateUtil.shutdown();

	}

}
