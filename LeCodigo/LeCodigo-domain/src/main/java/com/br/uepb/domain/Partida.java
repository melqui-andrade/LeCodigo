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
@Table(name="Partida")
public class Partida {

	@Id
	@GeneratedValue
	private int id;
	private int id_jogador;
	
	@OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<RespostaDoAluno> respostas_aluno;
	private String data_hora;
	private int pontuacao;

	public Partida(int id_jogador, String data_hora) {
		this.id_jogador = id_jogador;
		this.data_hora = data_hora;
	}

	public int getId() {
		return id;
	}
	
	public int getId_jogador() {
		return id_jogador;
	}

	public void setId_jogador(int id_jogador) {
		this.id_jogador = id_jogador;
	}

	public List<RespostaDoAluno> getRespostas_aluno() {
		return respostas_aluno;
	}

	public void setRespostas_aluno(List<RespostaDoAluno> respostas_aluno) {
		this.respostas_aluno = respostas_aluno;
	}

	public String getData_hora() {
		return data_hora;
	}

	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
}
