package com.br.uepb.domain;

import java.util.List;

public class Questao {

	private int id;
	private String descricao;
	private String resposta;
	private int fase;
	private int tipo_questao;
	private List<Bloco> blocos;
	
	public Questao(String descricao, String resposta, int fase, int tipo_questao, List<Bloco> blocos){
		
	}
	
	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public int getTipo_questao() {
		return tipo_questao;
	}

	public void setTipo_questao(int tipo_questao) {
		this.tipo_questao = tipo_questao;
	}

	public List<Bloco> getBlocos() {
		return blocos;
	}

	public void setBlocos(List<Bloco> blocos) {
		this.blocos = blocos;
	}
}
