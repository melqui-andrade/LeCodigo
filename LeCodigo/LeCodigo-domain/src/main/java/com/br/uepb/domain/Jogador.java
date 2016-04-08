package com.br.uepb.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Jogador")
public class Jogador {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String login;
	private String senha;
	private int pontuacao_total;
	
	@OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Partida> partidas;
	
	public Jogador(String nome, String login, String senha){
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPontuacao_total() {
		return pontuacao_total;
	}

	public void setPontuacao_total(int pontuacao_total) {
		this.pontuacao_total = pontuacao_total;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
}
