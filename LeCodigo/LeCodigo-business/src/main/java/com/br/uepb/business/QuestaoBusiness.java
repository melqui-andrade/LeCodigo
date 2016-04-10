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
