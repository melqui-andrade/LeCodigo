package com.br.uepb.domain;

public class Bloco {
	
	private int id;
	private int id_questao;
	private int descricao;
	
	public Bloco(int id_questao, int descricao){
		
	}

	public int getId() {
		return id;
	}
	
	public int getId_questao() {
		return id_questao;
	}

	public void setId_questao(int id_questao) {
		this.id_questao = id_questao;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}
}
