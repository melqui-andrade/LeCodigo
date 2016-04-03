package com.br.uepb.business;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;

public class QuestaoBusiness {
	 
	public Questao buscarQuestao(int fase, int etapa){

		QuestaoDAO questaoDAO = new QuestaoDAO();
		return questaoDAO.buscarQuestao(fase, etapa);
	}
	
	public boolean verificarResposta(String resposta, int idQuestao){
		//TODO Esse método precisa de mais um parâmetro, o ID da questão, atualizar doc
		QuestaoDAO questaoDAO = new QuestaoDAO();
		Questao questao = questaoDAO.buscarQuestao(idQuestao);
		SessaoBusiness sessao = SessaoBusiness.getInstace();
		
		
		if(questao.getResposta() == resposta){
			//TODO aumentar bits
			return true;
		}
		else{		
			//TODO diminuir vida
			return false;
		}
	}
	
	public Questao pularQuestao(int fase, int etapa){
		QuestaoDAO questaoDAO = new QuestaoDAO();
		Questao questao = questaoDAO.buscarQuestao(fase, etapa);
		SessaoBusiness sessao = SessaoBusiness.getInstace();
		//TODO O que é preciso para pular uma questão?
		return questaoDAO.PulaQuestao(fase, etapa);
		
	}

}
