package com.br.uepb.domain;

public enum TipoUsuario_Enum {
	ADMINISTRADOR(1), 
	ALUNO(2), 
	PROFESSOR(3);
	
	private int tipos;	
	
	private TipoUsuario_Enum(int tipos) {
		this.setTipos(tipos);
	}
	
	public int getTipos() {
		return tipos;
	}
	
	public void setTipos(int tipos) {
		this.tipos = tipos;
	}	
	
}
