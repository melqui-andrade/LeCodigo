package com.br.uepb.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name="Jogador")
public class Jogador {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	@Column(unique=true)
	@NotNull
	private String login;
	@NotNull
	private String senha;
	@NotNull
	private TipoUsuario_Enum tipo_usuario; //pode ser administrador, aluno e professor	
	private int pontuacao_total;
	
	@OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Partida> partidas;
	
	
	public Jogador() {
		
	}
	
	public Jogador(String nome, String login, String senha, TipoUsuario_Enum tipo_usuario){
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
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


	public TipoUsuario_Enum getTipo() {
		return tipo_usuario;
	}

	public void setTipo(TipoUsuario_Enum tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
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
