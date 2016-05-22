package com.br.uepb.business;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;
import com.br.uepb.domain.TipoQuestao_Enum;

import conexaoBD.HibernateUtil;

public class QuestaoBusiness {
	
	QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
	public Questao buscarQuestao(String login, int fase, int etapa){

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
				
				
			}while(questaoRepetida(login, questoes.get(numQuestao).getId()));
			SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
			sessaoBusiness.addQuestaoQueSaiu(questoes.get(numQuestao));
			Questao questao = questoes.get(numQuestao);
			Collections.shuffle(questao.getBlocos());
			System.out.println(questao.getDescricao());
			return questao;
		}
		return null;
	}
	
	public boolean verificarResposta(String login, String resposta, int idQuestao) throws Exception{
		Questao questao = questaoDAO.buscarQuestao(idQuestao);
		SessaoBusiness sessao = GerenciarSessaoBusiness.getSessaoBusiness(login);
		
		String [] possiveisRespostas = questao.getResposta().split(" | ");
		for (int i = 0; i < possiveisRespostas.length; i++) {
			if(possiveisRespostas[i].trim().equals(resposta)){
				sessao.setBits(sessao.getBits()+sessao.getValorDaQuestao());
				sessao.setPontuacao(sessao.getPontuacao()+sessao.getValorDaQuestao());
				new PartidaBusiness().avancarEtapa(login);
				sessao.atualizarPartidaDoJogador(idQuestao, resposta);
				return true;
			}
		}
		sessao.diminuirVida();
		sessao.atualizarPartidaDoJogador(idQuestao, resposta);
		return false;
	}
	
	public Questao pularQuestao(String login, int idQuestao, int fase, int etapa){
		SessaoBusiness sessao = GerenciarSessaoBusiness.getSessaoBusiness(login);
		boolean podePular = false;
		switch(fase){
		case 1:
			if(sessao.getBits() >= 3){
				podePular=true;
				sessao.setBits(sessao.getBits()-3);
			}
			break;
		case 2:
			if(sessao.getBits() >= 5){
				podePular=true;
				sessao.setBits(sessao.getBits()-5);
			}
			break;
		case 3:
			if(sessao.getBits() >= 7){
				podePular=true;
				sessao.setBits(sessao.getBits()-7);
			}
			break;
		}
		
		if(podePular){
			sessao.atualizarPartidaDoJogador(idQuestao, "pulou");
			return buscarQuestao(login, fase, etapa);
		}
		else{
			return null;
		}
		
	}
	
	public String getParteDoEnunciado(int idQuestao, int tamanho){
		
		Questao questao = questaoDAO.buscarQuestao(idQuestao);
		
		if(questao != null){
			return questao.getDescricao().substring(tamanho);
		}
		else{
			return "ID inválido";
		}
	}
	
	private boolean questaoRepetida(String login, int idQuestao){
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		for(Questao questao : sessaoBusiness.getQuestoesQueSairam()){
			if(questao.getId()==idQuestao){
				return true;
			}
		}
		return false;
	}
}
