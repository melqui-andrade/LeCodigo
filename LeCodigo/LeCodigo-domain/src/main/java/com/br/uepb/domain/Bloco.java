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
	private String descricao;
	
	public Bloco() {
		
	}
	
	public Bloco(String descricao){
		this.descricao = descricao;
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
}
