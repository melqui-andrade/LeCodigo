package com.br.uepb.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;

public class SessaoBusiness {

	private int fase = 1;
	private int etapa = 1;
	private int bits = 0;
	private int valorDaQuestao = 3;
	private int vidas = 3;
	private int pontuacao = 0;
	private static SessaoBusiness instance;
	private static List<Questao> questoesQueSairam;
	
	//TODO Já fiz, é só para lerem isso: Vou deixar o jogador atual da partida aqui,
	//para poder salvar ou atualizar as informações dele no BD.
	//Sempre que o jogador responder ou pular uma questão, deve ser atualizado os dados no bd
	private Jogador jogador;
	//Essa é a partida atual, as informações são persistidas nesse objeto, e associada ao jogador
	private Partida partida;
	private RespostaDoAluno respostaDoAluno;
	
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

	public void setFase(int fase) {
		this.fase = fase;
	}

	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}

	public void setBits(int bits) {
		this.bits = bits;
	}

	public void setValorDaQuestao(int valorDaQuestao) {
		this.valorDaQuestao = valorDaQuestao;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public static List<Questao> getQuestoesQueSairam() {
		if(questoesQueSairam==null){
			questoesQueSairam = new ArrayList<Questao>();
		}
		return questoesQueSairam;
	}

	public static void addQuestaoQueSaiu(Questao questaoQueSaiu) {
		if(questoesQueSairam==null){
			questoesQueSairam = new ArrayList<Questao>();
		}
		SessaoBusiness.questoesQueSairam.add(questaoQueSaiu);
	}
	
	public void atualizarPartidaDoJogador(int id_questao, String resposta){
		//Verifico se a resposta é referente a outra questão
		if(id_questao!=respostaDoAluno.getId_questao())
			this.respostaDoAluno = new RespostaDoAluno();
		respostaDoAluno.setEtapa(this.etapa);
		respostaDoAluno.setId_questao(id_questao);
		if(respostaDoAluno.getRespostas().isEmpty())
			respostaDoAluno.setRespostas(resposta);
		else
			//TODO outra coisa esse "|" era para ser adicionado no domain, mas não colocaram
			respostaDoAluno.setRespostas(respostaDoAluno.getRespostas()+"|"+resposta);
		partida.getRespostas_aluno().add(respostaDoAluno);
		partida.setData_hora(new Date().toString());
		partida.setPontuacao(pontuacao);
		
		
	}
	public void iniciarPartidaDoJogador(int idJogador){
		this.jogador = new JogadorDAO().buscarJogador(idJogador);
		this.partida = new Partida();
		this.partida.setRespostas_aluno(new ArrayList<RespostaDoAluno>());
		this.jogador.getPartidas().add(this.partida);
		this.respostaDoAluno = new RespostaDoAluno();
	}
	
	
}
