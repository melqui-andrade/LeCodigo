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
	private boolean partidaEncerrada;
	//*************************//
	private int fase;
	private int etapa;
	private int bits;
	private int valorDaQuestao;
	private int vidas;
	private List<Questao> questoesQueSairam;

	public Partida() {
		
	}
	
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

	public boolean isPartidaEncerrada() {
		return partidaEncerrada;
	}

	public void setPartidaEncerrada(boolean partidaEncerrada) {
		this.partidaEncerrada = partidaEncerrada;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public int getEtapa() {
		return etapa;
	}

	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}

	public int getBits() {
		return bits;
	}

	public void setBits(int bits) {
		this.bits = bits;
	}

	public int getValorDaQuestao() {
		return valorDaQuestao;
	}

	public void setValorDaQuestao(int valorDaQuestao) {
		this.valorDaQuestao = valorDaQuestao;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public List<Questao> getQuestoesQueSairam() {
		return questoesQueSairam;
	}

	public void setQuestoesQueSairam(List<Questao> questoesQueSairam) {
		this.questoesQueSairam = questoesQueSairam;
	}
	
	
}
