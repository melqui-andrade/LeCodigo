package com.br.uepb.business;

import org.springframework.stereotype.Component;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.Relatorio;
import com.br.uepb.domain.TipoUsuario_Enum;

@Component
public class JogadorBusiness {

	JogadorDAO jogadorDAO = JogadorDAO.getInstance();	
	
	public boolean autenticarJogador(String login, String senha){
		boolean jogadorFoiAutenticado = jogadorDAO.autenticarJogador(login, senha);
		if(jogadorFoiAutenticado){
			Jogador novoJogador = jogadorDAO.buscarJogador(login);
			adicionaJogadorNaSessao(novoJogador, jogadorFoiAutenticado);
			return true;
		}
		else{
			return false;
		}
	}
	
	public Jogador buscaJogador(String login){
		return jogadorDAO.buscarJogador(login);
	}
	
	public int buscarPontuacao(int idJogador){
		return jogadorDAO.buscarPontuacao(idJogador);
	}
	
	public boolean cadastraJogador(String nome, String login, String senha, TipoUsuario_Enum tipo_usuario){
		Jogador jogador = new Jogador(nome, login, senha, tipo_usuario);
		return jogadorDAO.adicionarJogador(jogador);
	}
	
	/**
	 * Cadastrar um novo usuário
	 * @param nome Nome do usuário
	 * @param login Login para acessar o jogo
	 * @param senha Senha para acessar o jogo
	 * @param tipoJogador Valores: Adm, Aluno, Professor
	 * @return true, caso o jogador tenha sido cadastrado com sucesso
	 */
	public boolean cadastraJogador(String nome, String login, String senha, String tipoJogador){
		JogadorDAO jogadorDAO = JogadorDAO.getInstance();
		Jogador novoJogador = jogadorDAO.buscarJogador(login);
		if(novoJogador == null){
			novoJogador = new Jogador();
			novoJogador.setLogin(login);
			novoJogador.setNome(nome);
			novoJogador.setSenha(senha);
			novoJogador.setTipo(obtemTipoUsuario(tipoJogador));
			return jogadorDAO.adicionarJogador(novoJogador);
		}
		else{
			return false;
		}
	}

	private void adicionaJogadorNaSessao(Jogador novoJogador, boolean jogadorFoiAdicionado) {
		if(jogadorFoiAdicionado){
			GerenciarSessaoBusiness.addSessaoBusiness(novoJogador, new SessaoBusiness());
		}
	}
	
	private TipoUsuario_Enum obtemTipoUsuario(String tipo){
		switch(tipo){
		case "Adm": return TipoUsuario_Enum.ADMINISTRADOR;		
		
		case "Professor": return TipoUsuario_Enum.PROFESSOR;
		
		case "Aluno": return TipoUsuario_Enum.ALUNO;
		
		default: return null;
		}
	}
	
	public Relatorio getRelatorioDaTurma(){
		return jogadorDAO.estatisticaDaTurma();
	}
	
}
