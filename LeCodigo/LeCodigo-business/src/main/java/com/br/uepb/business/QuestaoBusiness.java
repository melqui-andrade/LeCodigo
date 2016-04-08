package com.br.uepb.business;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class QuestaoBusiness {
	 
	public Questao buscarQuestao(int fase, int etapa){

//		QuestaoDAO questaoDAO = new QuestaoDAO();
		return null; //questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ATRICUICAO);
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
//		Questao questao = questaoDAO.buscarQuestao(fase, etapa);
		SessaoBusiness sessao = SessaoBusiness.getInstace();
		//TODO O que é preciso para pular uma questão?
		return null; //questaoDAO.PulaQuestao(fase, etapa);
		
	}

}
