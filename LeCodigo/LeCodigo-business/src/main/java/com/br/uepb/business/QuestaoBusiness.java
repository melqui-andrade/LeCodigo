package com.br.uepb.business;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;

public class QuestaoBusiness {
	 
	public Questao buscarQuestao(int fase, int etapa){

		QuestaoDAO questaoDAO = new QuestaoDAO();
		return questaoDAO.buscarQuestao(fase, etapa);
	}
	
	public boolean verificarRespostar(String resposta){
		//TODO Esse método precisa de mais um parâmetro, o ID da questão
		return false;
	}

}
