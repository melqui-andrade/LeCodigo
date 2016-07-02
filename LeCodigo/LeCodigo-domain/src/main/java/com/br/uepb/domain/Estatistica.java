package com.br.uepb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Estatistica")
public class Estatistica {
	
	@Id
	@GeneratedValue
	private int id;
	private int qtdRespostaCerta;
	private int qtdRespostaErrada;
	private int qtdRespostaPulada;
	public int getQtdRespostaCerta() {
		return qtdRespostaCerta;
	}
	public void setQtdRespostaCerta(int qtdRespostaCerta) {
		this.qtdRespostaCerta = qtdRespostaCerta;
	}
	public int getQtdRespostaErrada() {
		return qtdRespostaErrada;
	}
	public void setQtdRespostaErrada(int qtdRespostaErrada) {
		this.qtdRespostaErrada = qtdRespostaErrada;
	}
	public int getQtdRespostaPulada() {
		return qtdRespostaPulada;
	}
	public void setQtdRespostaPulada(int qtdRespostaPulada) {
		this.qtdRespostaPulada = qtdRespostaPulada;
	}
	
	
}
