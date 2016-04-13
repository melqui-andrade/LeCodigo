package com.br.uepb.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Questao")
public class Questao {
	@Id
	@GeneratedValue
	private int id;
	@Column (length=500)
	private String descricao;
	private String resposta;
	private int fase;
	private TipoQuestao_Enum tipo_questao;
	@OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Bloco> blocos;
	
	public Questao() {}
	
	public Questao(String descricao, String resposta, int fase, TipoQuestao_Enum tipo_questao, List<Bloco> blocos){
		this.descricao = descricao;
		this.resposta = resposta;
		this.fase = fase;
		this.tipo_questao =  tipo_questao;
		this.blocos = blocos;
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

	public TipoQuestao_Enum getTipo_questao() {
		return tipo_questao;
	}

	public void setTipo_questao(TipoQuestao_Enum tipo_questao) {
		this.tipo_questao = tipo_questao;
	}

	public List<Bloco> getBlocos() {
		return blocos;
	}

	public void setBlocos(List<Bloco> blocos) {
		this.blocos = blocos;
	}
}
