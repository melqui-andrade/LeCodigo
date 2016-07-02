package com.br.uepb.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Relatorio")
public class Relatorio {
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _geral = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _tipos_atribuicao_de_variaveis = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _if_else = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _switch_case = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _for = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _while = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _do_while = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _ordenacao = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _contadores = new Estatistica();
	@OneToOne(cascade = CascadeType.ALL)
	private Estatistica _funcoes = new Estatistica();
	public Estatistica get_geral() {
		return _geral;
	}
	public void set_geral(Estatistica _geral) {
		this._geral = _geral;
	}
	public Estatistica get_tipos_atribuicao_de_variaveis() {
		return _tipos_atribuicao_de_variaveis;
	}
	public void set_tipos_atribuicao_de_variaveis(Estatistica _tipos_atribuicao_de_variaveis) {
		this._tipos_atribuicao_de_variaveis = _tipos_atribuicao_de_variaveis;
	}
	public Estatistica get_if_else() {
		return _if_else;
	}
	public void set_if_else(Estatistica _if_else) {
		this._if_else = _if_else;
	}
	public Estatistica get_switch_case() {
		return _switch_case;
	}
	public void set_switch_case(Estatistica _switch_case) {
		this._switch_case = _switch_case;
	}
	public Estatistica get_for() {
		return _for;
	}
	public void set_for(Estatistica _for) {
		this._for = _for;
	}
	public Estatistica get_while() {
		return _while;
	}
	public void set_while(Estatistica _while) {
		this._while = _while;
	}
	public Estatistica get_do_while() {
		return _do_while;
	}
	public void set_do_while(Estatistica _do_while) {
		this._do_while = _do_while;
	}
	public Estatistica get_ordenacao() {
		return _ordenacao;
	}
	public void set_ordenacao(Estatistica _ordenacao) {
		this._ordenacao = _ordenacao;
	}
	public Estatistica get_contadores() {
		return _contadores;
	}
	public void set_contadores(Estatistica _contadores) {
		this._contadores = _contadores;
	}
	public Estatistica get_funcoes() {
		return _funcoes;
	}
	public void set_funcoes(Estatistica _funcoes) {
		this._funcoes = _funcoes;
	}
	
	

}
