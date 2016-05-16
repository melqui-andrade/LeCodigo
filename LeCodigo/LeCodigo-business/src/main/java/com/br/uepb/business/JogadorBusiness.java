package com.br.uepb.business;

import org.springframework.stereotype.Component;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoUsuario_Enum;

@Component
public class JogadorBusiness {

	JogadorDAO jogadorDAO = JogadorDAO.getInstance();
	public boolean criarJogador(String nome, String login, String senha, TipoUsuario_Enum tipo_usuario){
		Jogador jogador = new Jogador(nome, login, senha, tipo_usuario);
		return jogadorDAO.adicionarJogador(jogador);
	}
	
	public boolean autenticarJogador(String login, String senha){
		return jogadorDAO.autenticarJogador(login, senha);
	}
	
	public Jogador buscaJogador(String login){
		return jogadorDAO.buscarJogador(login);
	}
	
	public int buscarPontuacao(int idJogador){
		return jogadorDAO.buscarPontuacao(idJogador);
	}
	
}
