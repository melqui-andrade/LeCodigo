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

	public int getFase() {
		return fase;
	}

	public int getEtapa() {
		return etapa;
	}

	public int getBits() {
		return bits;
	}

	public int getVidas() {
		return vidas;
	}

	public int getPontuacao() {
		return pontuacao;
	}
	
	
	//TODO atualizar documentação, novos métodos criados
	//TODO método para perder vidas
}
