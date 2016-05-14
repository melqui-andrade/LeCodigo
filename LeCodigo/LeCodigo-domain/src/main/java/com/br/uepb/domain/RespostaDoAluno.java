package com.br.uepb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RespostaDoAluno")
public class RespostaDoAluno {
	
	@Id
	@GeneratedValue
	private int id;
	private int id_partida;
	private int id_questao;
	private int etapa;
	private String respostas;
	
	public RespostaDoAluno() {}
	
	public RespostaDoAluno(int id_partida, int id_questao, int etapa, String respostas) {
		this.id_partida = id_partida;
		this.id_questao = id_questao;
		this.etapa = etapa;
		this.respostas = respostas;
	}

	public void addResposta(String resposta){
		setRespostas(getRespostas() + " | " + resposta);
	}
	
	public void pulou(){
		setRespostas(getRespostas() + " | pulou");
	}
	
	public int getId() {
		return id;
	}

	public int getId_partida() {
		return id_partida;
	}

	public void setId_partida(int id_partida) {
		this.id_partida = id_partida;
	}

	public int getId_questao() {
		return id_questao;
	}

	public void setId_questao(int id_questao) {
		this.id_questao = id_questao;
	}

	public int getEtapa() {
		return etapa;
	}

	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}

	public String getRespostas() {
		return respostas;
	}

	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}
}
