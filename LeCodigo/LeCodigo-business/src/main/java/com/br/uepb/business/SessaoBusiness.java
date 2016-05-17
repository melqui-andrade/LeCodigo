package com.br.uepb.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.dao.PartidaDAO;
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
	private static Jogador jogador;
	private Partida partida;
	private RespostaDoAluno respostaDoAluno;
	
	private JogadorDAO jogadorDAO = JogadorDAO.getInstance();
	private PartidaDAO partidaDAO = PartidaDAO.getInstance();
	
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
	
	public Jogador getJogador(){
		return jogador;
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
	
	public static void setJogador(Jogador novoJogador){
		jogador = novoJogador;
	}

	public static List<Questao> getQuestoesQueSairam() {
		if(questoesQueSairam==null){
			questoesQueSairam = new ArrayList<Questao>();
		}
		return questoesQueSairam;
	}
	
	public static void setQuestoesQueSairam(List<Questao> questoesQueSairam) {
		SessaoBusiness.questoesQueSairam = questoesQueSairam;
	}

	public static void addQuestaoQueSaiu(Questao questaoQueSaiu) {
		if(questoesQueSairam==null){
			questoesQueSairam = new ArrayList<Questao>();
		}
		SessaoBusiness.questoesQueSairam.add(questaoQueSaiu);
	}
	
	public void atualizarPartidaDoJogador(int id_questao, String resposta){
		//Verifico se a resposta é referente a outra questão
		if(id_questao!=respostaDoAluno.getId_questao()){
			this.respostaDoAluno = new RespostaDoAluno();
			partida.getRespostas_aluno().add(respostaDoAluno);
		}
		respostaDoAluno.setEtapa(this.etapa);
		respostaDoAluno.setId_questao(id_questao);
		respostaDoAluno.setId_partida(partida.getId());
		if(respostaDoAluno.getRespostas()==null)
			respostaDoAluno.setRespostas(resposta);
		else {
			respostaDoAluno.addResposta(resposta); 
		}
			//respostaDoAluno.setRespostas(respostaDoAluno.getRespostas()+"|"+resposta);
		partida.setData_hora(new Date().toString());
		partida.setPontuacao(pontuacao);
		//Atualizar a partida no banco de dados
		partidaDAO.atualizarPartida(partida);
		
		
	}
	public void iniciarPartidaDoJogador(int idJogador){
		this.jogador = jogadorDAO.buscarJogador(idJogador);
		//TODO remover essa verificação depois que o cadastro de jogadores tiver feito
		if(jogador==null){
			jogador = new Jogador();
			jogador.setPartidas(new ArrayList<>());
		}
		this.partida = new Partida();
		this.partida.setId_jogador(jogador.getId());
		this.partida.setRespostas_aluno(new ArrayList<RespostaDoAluno>());
		this.jogador.getPartidas().add(this.partida);
		this.respostaDoAluno = new RespostaDoAluno();
		//Adiciona a partida no banco de dados
		partidaDAO.salvarPartida(partida);
	}
	
	public void finalizarPartida(){
		partida.setPartidaEncerrada(true);
		partidaDAO.atualizarPartida(partida);
		this.partida = null;
		questoesQueSairam.clear();
		
	}
	
	public Partida getPartida(){
		return this.partida;
	}
	
	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public static void encerraSessao(){
		//fase = 1;
		//etapa = 1;
		//bits = 0;
		//valorDaQuestao = 3;
		//vidas = 3;
		//pontuacao = 0;
		SessaoBusiness instance = null;
		questoesQueSairam = null;
		jogador = null;
		//partida = null;
		//respostaDoAluno = null;
	}
	
	
}
