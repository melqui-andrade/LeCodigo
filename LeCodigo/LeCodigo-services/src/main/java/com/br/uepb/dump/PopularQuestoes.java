package com.br.uepb.dump;

import com.br.uepb.dao.QuestaoDAO;

import conexaoBD.HibernateUtil;

public class PopularQuestoes {

	public static void main(String[] args) {
		
		//Metodo para apagar as questoes e os bocos e criar de novo
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		questaoDAO.apagarQuestoes();
		
		//Popular questoes da fase 1 
		PopularTabelaQuestoes popularFase1 = new PopularTabelaQuestoes();
		popularFase1.popularQuestoes_Fase1();
		
		
		//Popular questoes da fase 2 
		PopularTabelaQuestoes2 popularFase2 = new PopularTabelaQuestoes2();
		popularFase2.popularQuestoes_Fase2();
		
		//Popular questoes da fase 3 
		PopularTabelaQuestoes3 popularFase3 = new PopularTabelaQuestoes3();
		popularFase3.popularQuestoes_Fase3();
		
		//Fechar a conexão com a base de dados
		HibernateUtil.shutdown();

	}

}
