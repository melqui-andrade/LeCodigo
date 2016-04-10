package com.br.uepb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Bloco")
public class Bloco {
	
	@Id
	@GeneratedValue
	private int id;
	private int id_bloco;
	private String descricao;
	
	public Bloco() {
		
	}
	
	public Bloco(int id_bloco, String descricao){
		this.id_bloco = id_bloco;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	
	public int getId_bloco() {
		return id_bloco;
	}

	public void setId_bloco(int id_bloco) {
		this.id_bloco = id_bloco;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
