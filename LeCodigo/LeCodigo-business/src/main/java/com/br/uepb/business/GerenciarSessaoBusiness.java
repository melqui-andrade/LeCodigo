package com.br.uepb.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.dao.PartidaDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;

public class GerenciarSessaoBusiness {

	private static Map<String, SessaoBusiness> sessoes = new HashMap<>();
	
	public static SessaoBusiness getSessaoBusiness(String login){

		return sessoes.get(login);
	}
	
	public static SessaoBusiness getSessaoBusiness(int idJogador){
		return sessoes.get(JogadorDAO.getInstance().buscarJogador(idJogador).getLogin());
	}
	
	public static void addSessaoBusiness(Jogador jogador, SessaoBusiness sessao){
		if(!sessoes.containsKey(jogador.getLogin())){
			sessao.setJogador(jogador);
			sessoes.put(jogador.getLogin(), sessao);
		}
	}
	
	public static void removeSessao(String login){
		try {
			sessoes.remove(login);
		} catch (Exception e) {
		}
	}
	
	
}
