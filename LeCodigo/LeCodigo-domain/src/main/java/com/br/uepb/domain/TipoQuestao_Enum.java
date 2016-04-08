package com.br.uepb.domain;

/**
 * Este {@link Enum} define os tipos de {@link Questao}.
 * @author Lucas Miranda
 *
 */
public enum TipoQuestao_Enum {

	ATRICUICAO(1), 		IF_ELSE(2), 
	SWITCH_CASE(3), 	FOR(4), 
	WHILE(5), 		    DO_WHILE(6), 
	TROCA_VARIAVEIS(7), ORDENACAO_SIMPLES(8), 
	FUNCOES(9);
	
	private int tipos;	
	private TipoQuestao_Enum(int tipos) {
		this.setTipos(tipos);
	}
	public int getTipos() {
		return tipos;
	}
	public void setTipos(int tipos) {
		this.tipos = tipos;
	}	
}
