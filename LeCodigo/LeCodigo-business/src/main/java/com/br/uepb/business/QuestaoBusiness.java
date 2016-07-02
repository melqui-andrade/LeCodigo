package com.br.uepb.business;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Estatistica;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.Relatorio;
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
			sessaoBusiness.salvarQuestoesDaPartida();
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
				atualizarEstatistica(login, questao.getTipo_questao(), "acerto");
				sessao.setBits(sessao.getBits()+sessao.getValorDaQuestao());
				sessao.setPontuacao(sessao.getPontuacao()+sessao.getValorDaQuestao());
				new PartidaBusiness().avancarEtapa(login);
				sessao.atualizarPartidaDoJogador(idQuestao, resposta);
				return true;
			}
		}
		atualizarEstatistica(login, questao.getTipo_questao(), "erro");
		sessao.diminuirVida();
		sessao.atualizarPartidaDoJogador(idQuestao, resposta);
		return false;
	}
	/**
	 * Salva no banco de dados informações relacionadas a quantidade de acerto, erro ou pulo do jogador
	 * @param idQuestao
	 * @param status pode receber os valores acerto, erro ou pulo
	 */
	private void atualizarEstatistica(String login, TipoQuestao_Enum tipoquestao, String status) {
		Relatorio relatorio = GerenciarSessaoBusiness.getSessaoBusiness(login).getJogador().getRelatorio();
		Estatistica estatistica;
		switch (tipoquestao) {
		case ATRIBUICAO:
			estatistica = relatorio.get_tipos_atribuicao_de_variaveis();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case IF_ELSE:
			estatistica = relatorio.get_if_else();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case SWITCH_CASE:
			estatistica = relatorio.get_switch_case();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case FOR:
			estatistica = relatorio.get_for();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case WHILE:
			estatistica = relatorio.get_while();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case DO_WHILE:
			estatistica = relatorio.get_do_while();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case TROCA_VARIAVEIS:
			estatistica = relatorio.get_contadores();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case ORDENACAO_SIMPLES:
			estatistica = relatorio.get_ordenacao();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;
			
		case FUNCOES:
			estatistica = relatorio.get_funcoes();
			if(status.equals("acerto")){
				estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
			}else if(status.equals("erro")){
				estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
			}else{
				estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
			}
			break;

		default:
			break;
		}
		estatistica = relatorio.get_geral();
		if(status.equals("acerto")){
			estatistica.setQtdRespostaCerta(estatistica.getQtdRespostaCerta()+1);
		}else if(status.equals("erro")){
			estatistica.setQtdRespostaErrada(estatistica.getQtdRespostaErrada()+1);
		}else{
			estatistica.setQtdRespostaPulada(estatistica.getQtdRespostaPulada()+1);
		}
		
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
			Questao questao = questaoDAO.buscarQuestao(idQuestao);
			atualizarEstatistica(login, questao.getTipo_questao(), "pulou");
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
