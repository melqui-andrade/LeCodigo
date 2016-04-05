package com.br.uepb.business;

import org.springframework.stereotype.Component;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;

@Component
public class JogadorBusiness {

	public boolean criarJogador(String nome, String login, String senha){
		Jogador jogador = new Jogador(nome, login, senha);
		JogadorDAO jogadorDAO = new JogadorDAO();
		return jogadorDAO.adicionarJogador(jogador);
	}
	
	public Jogador buscaJogador(String login){
		//TODO Esse é o método de autênticação do jogador? Só verifica o login?
		JogadorDAO jogadorDAO = new JogadorDAO();
		return jogadorDAO.buscarJogador(login);
	}
	
	public int buscarPontuacao(){
		//TODO Como ele acha essa pontuação? Necessário passar algum parâmeto? Pega da sessão?
		return 1;
	}
	
}
