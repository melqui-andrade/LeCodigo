package com.br.uepb.business.relatorio;

import java.util.ArrayList;
import java.util.List;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;

public class RelatorioJogadorBusiness {
	 
	private String login;
	private Questao questao;
	private Jogador jogador;
	
	private int qtdRespostaCorreta;
	private int qtdRespostaErrada;
	private int qtdRespostaPulou;
	private int qtdPartidas;
	QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
	JogadorDAO jogadorDAO = JogadorDAO.getInstance();
	public RelatorioJogadorBusiness(String login) {
		this.login = login;
		this.jogador = jogadorDAO.buscarJogador(login);
	}
	
	private void getQtdPartidas(){
		this.qtdPartidas = jogador.getPartidas().size();
	}
	
	
	private void qtdRespostasCorretasErradasPulou(){		
		for(Partida partida : jogador.getPartidas()){
			for (RespostaDoAluno respostaDoAluno : partida.getRespostas_aluno()) {
				String possiveisRespostas[] = questaoDAO.buscarQuestao(respostaDoAluno.getId_questao()).getResposta().split(" | ");
				String respostas[] = respostaDoAluno.getRespostas().split(" | ");
				for (int i = 0; i < respostas.length; i++) {
					if(respostas[i].trim().equals("pulou")){
						qtdRespostaPulou++;
					}
					else if(i<respostas.length-1){//Se o jogador resposdeu corretamente, então será a ultima resposta que ele deu
						qtdRespostaErrada++;
					}
				}
				boolean ultimaRespostaCorreta = false; //Indica se a ultima resposta do jogador para uma questão foi correta
				for (int i = 0; i < possiveisRespostas.length; i++) {
					if(respostas[respostas.length-1].trim().equals(possiveisRespostas[i])){
						ultimaRespostaCorreta = true;
						break;
					}
				}
				if(ultimaRespostaCorreta){
					qtdRespostaCorreta++;
				}
				else{
					qtdRespostaErrada++;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param idQuestao refere-se a questão cujas respostas foram dadas
	 * @param resposta recebe algo do tipo 1-2-3-4-5
	 * @return um lista contendo a descrição de cada bloco
	 */
	public List<String> getBlocos(int idQuestao, String resposta){
		if(resposta.equals("pulou")){
			return null;
		}
		int cont = 0;
		questao = questaoDAO.buscarQuestao(idQuestao);
		List<String> blocos = new ArrayList<>();
		for (int i = 0; i < resposta.length(); i+=2) {
			blocos.add(getBloco(questao, resposta.charAt(i)+""));
		}
		
		return blocos;
	}

	private String getBloco(Questao questao, String idBloco) {
		
		for (Bloco bloco : questao.getBlocos()) {
			if(bloco.getId() == Integer.parseInt(idBloco)){
				return bloco.getDescricao();
			}
		}
		
		return null;
	}
}
