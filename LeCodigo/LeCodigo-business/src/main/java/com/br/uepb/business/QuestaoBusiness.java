package com.br.uepb.business;

import java.util.List;
import java.util.Random;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;
import com.br.uepb.domain.TipoQuestao_Enum;

public class QuestaoBusiness {
	 
	public Questao buscarQuestao(int fase, int etapa){

		QuestaoDAO questaoDAO = new QuestaoDAO();
		List<Questao> questoes;
		if(fase==1){
			if(etapa==1){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ATRIBUICAO);
			}
			else if(etapa==2){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.IF_ELSE);
			}
			else if(etapa==3){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.SWITCH_CASE);
			}
			else{
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ATRIBUICAO);
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.IF_ELSE));
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.SWITCH_CASE));
			}
		}
		else if(fase==2){
			if(etapa==1){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FOR);
			}
			else if(etapa==2){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.WHILE);
			}
			else if(etapa==3){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.DO_WHILE);
			}
			else{
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FOR);
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.WHILE));
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.DO_WHILE));
			}
		}
		else if(fase==3){
			if(etapa==1){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.TROCA_VARIAVEIS);
			}
			else if(etapa==2){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ORDENACAO_SIMPLES);
			}
			else if(etapa==3){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FUNCOES);
			}
			else{
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.TROCA_VARIAVEIS);
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ORDENACAO_SIMPLES));
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FUNCOES));
			}
			
			Random random = new Random();
			int numQuestao = random.nextInt(questoes.size()-1);
			return questoes.get(numQuestao);
		}
		
				
		return null; //questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ATRICUICAO);
	}
	
	public boolean verificarResposta(String resposta, int idQuestao) throws Exception{
		//TODO Esse método precisa de mais um parâmetro, o ID da questão, atualizar doc
		QuestaoDAO questaoDAO = new QuestaoDAO();
		Questao questao = questaoDAO.buscarQuestao(idQuestao);
		SessaoBusiness sessao = SessaoBusiness.getInstace();
		
		RespostaDoAluno respostaDoAluno;
		
		
		if(questao.getResposta().equals(resposta)){
			sessao.setBits(sessao.getBits()+sessao.getValorDaQuestao());
			
			return true;
		}
		else{		
			//TODO diminuir vida
			sessao.diminuirVida();
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
