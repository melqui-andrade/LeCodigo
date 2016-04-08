package com.br.uepb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bloco")
public class Bloco {
	
	@Id
	@GeneratedValue
	private int id;
	private int id_questao;
	private int descricao;
	
	public Bloco(int id_questao, int descricao){
		this.id_questao = id_questao;
		this.descricao = descricao;
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
