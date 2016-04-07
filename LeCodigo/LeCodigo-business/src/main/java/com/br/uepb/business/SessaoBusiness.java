package com.br.uepb.business;

public class SessaoBusiness {

	private int fase = 1;
	private int etapa = 1;
	private int bits = 0;
	private int valorDaQuestao = 3;
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
		switch(fase){
		case 1:
			if(bits >= 3) vidas++;			
			break;
		case 2:
			if(bits >= 5) vidas++;
			break;
		case 3:
			if(bits >= 7) vidas++;
			break;
		}
	}
	public void diminuirVida() throws Exception{
		if(vidas > 0){
			vidas--;
		}
		else{
			throw new Exception("Sem vidas");
		}
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
	
	public int getValorDaQuestao(){
		return valorDaQuestao;
	}

	public int getVidas() {
		return vidas;
	}

	public int getPontuacao() {
		return pontuacao;
	}
}
