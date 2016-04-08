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
	private String descricao;
	
	public Bloco() {
		
	}
	
	public Bloco(int id_questao, String descricao){
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
