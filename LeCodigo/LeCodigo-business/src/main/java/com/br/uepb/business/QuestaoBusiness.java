package com.br.uepb.business;

import java.util.List;
import java.util.Random;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;
import com.br.uepb.domain.TipoQuestao_Enum;

import conexaoBD.HibernateUtil;

public class QuestaoBusiness {
	
	
	public Questao buscarQuestao(int fase, int etapa){

		QuestaoDAO questaoDAO = new QuestaoDAO();
		List<Questao> questoes = null;
		if(fase==1){
			if(etapa==1){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ATRIBUICAO.ordinal());
			}
			else if(etapa==2){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.IF_ELSE.ordinal());
			}
			else if(etapa==3){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.SWITCH_CASE.ordinal());
			}
			else{
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ATRIBUICAO.ordinal());
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.IF_ELSE.ordinal()));
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.SWITCH_CASE.ordinal()));
			}
		}
		else if(fase==2){
			if(etapa==1){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FOR.ordinal());
			}
			else if(etapa==2){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.WHILE.ordinal());
			}
			else if(etapa==3){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.DO_WHILE.ordinal());
			}
			else{
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FOR.ordinal());
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.WHILE.ordinal()));
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.DO_WHILE.ordinal()));
			}
		}
		else if(fase==3){
			if(etapa==1){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.TROCA_VARIAVEIS.ordinal());
			}
			else if(etapa==2){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ORDENACAO_SIMPLES.ordinal());
			}
			else if(etapa==3){
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FUNCOES.ordinal());
			}
			else{
				questoes = questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.TROCA_VARIAVEIS.ordinal());
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.ORDENACAO_SIMPLES.ordinal()));
				questoes.addAll(questaoDAO.listarQuestoes(fase, TipoQuestao_Enum.FUNCOES.ordinal()));
			}
			
			
		}
		if(!questoes.isEmpty()){
			int numQuestao = 0;
			do{
				Random random = new Random();
				numQuestao = random.nextInt(questoes.size());
				
				
			}while(SessaoBusiness.getQuestoesQueSairam().contains(questoes.get(numQuestao)));
			SessaoBusiness.addQuestaoQueSaiu(questoes.get(numQuestao));
			return questoes.get(numQuestao);
		}
		return null;
	}
	
	public boolean verificarResposta(String resposta, int idQuestao) throws Exception{
		//TODO Esse método precisa de mais um parâmetro, o ID da questão, atualizar doc
		QuestaoDAO questaoDAO = new QuestaoDAO();
		Questao questao = questaoDAO.buscarQuestao(idQuestao);
		SessaoBusiness sessao = SessaoBusiness.getInstace();
		
		String [] possiveisRespostas = questao.getResposta().split("|");
		for (int i = 0; i < possiveisRespostas.length; i++) {
			if(possiveisRespostas[i].trim().equals(resposta)){
				sessao.setBits(sessao.getBits()+sessao.getValorDaQuestao());
				sessao.setPontuacao(sessao.getPontuacao()+sessao.getValorDaQuestao());
				sessao.atualizarPartidaDoJogador(idQuestao, resposta);
				return true;
			}
		}
		sessao.diminuirVida();
		sessao.atualizarPartidaDoJogador(idQuestao, resposta);
		return false;
	}
	
	public Questao pularQuestao(int fase, int etapa){
		QuestaoDAO questaoDAO = new QuestaoDAO();
//		Questao questao = questaoDAO.buscarQuestao(fase, etapa);
		SessaoBusiness sessao = SessaoBusiness.getInstace();
		//TODO O que é preciso para pular uma questão?
		//Acho que é:
		
		return buscarQuestao(fase, etapa); //questaoDAO.PulaQuestao(fase, etapa);
		
	}

}
