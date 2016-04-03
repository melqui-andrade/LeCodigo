package com.br.uepb.business;

public class SessaoBusiness {

	private int fase = 1;
	private int etapa = 1;
	private int bits = 0;
	private int vidas = 3;
	private int pontuacao = 0;
	private static SessaoBusiness instance;
	
	private SessaoBusiness(){};
	
	public static SessaoBusiness getInstace(){
		if(instance == null){
			instance = new SessaoBusiness();
		}
		return instance;
	}
	
	public void comprarVida(){
		
	}
}
