package com.br.uepb.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.dao.PartidaDAO;
import com.br.uepb.dao.QuestaoDAO;
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
	private SessaoBusiness instance;
	private String questoesQueSairam = "";
	private Jogador jogador;
	private Partida partida;
	private RespostaDoAluno respostaDoAluno;
	
	private JogadorDAO jogadorDAO = JogadorDAO.getInstance();
	private PartidaDAO partidaDAO = PartidaDAO.getInstance();
	
	public SessaoBusiness(){};
	
	public SessaoBusiness getInstace(){
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
	
	public void setJogador(Jogador novoJogador){
		jogador = novoJogador;
	}
	
	

	public RespostaDoAluno getRespostaDoAluno() {
		return respostaDoAluno;
	}

	public void setRespostaDoAluno(RespostaDoAluno respostaDoAluno) {
		this.respostaDoAluno = respostaDoAluno;
	}

	public List<Questao> getQuestoesQueSairam() {
		if(questoesQueSairam==null || questoesQueSairam.isEmpty()){
			return new ArrayList<>();
		}
		List<Questao> questoes = new ArrayList<>();
		String ids[] = questoesQueSairam.split("_");
		for (int i = 0; i < ids.length; i++) {
			questoes.add(QuestaoDAO.getInstance().buscarQuestao(Integer.parseInt(ids[i])));
		}
		return questoes;
	}
	
	public Questao ultimaQuestao(){
		if(questoesQueSairam==null || questoesQueSairam.isEmpty()){
			return null;
		}
		String ids[] = questoesQueSairam.split("_");
		String id = ids[ids.length-1];
		return QuestaoDAO.getInstance().buscarQuestao(Integer.parseInt(id));
	}

	public void addQuestaoQueSaiu(Questao questaoQueSaiu) {
		if(questoesQueSairam==null){
			questoesQueSairam = "";
		}
		if(questoesQueSairam.isEmpty()){
			questoesQueSairam += questaoQueSaiu.getId();
		}else{
			questoesQueSairam+="_"+questaoQueSaiu.getId();
		}
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
		partida.setBits(bits);
		partida.setEtapa(etapa);
		partida.setFase(fase);
		partida.setVidas(vidas);
		partida.setValorDaQuestao(valorDaQuestao);
		partida.setQuestoesQueSairam(questoesQueSairam);
		int index = jogador.getPartidas().size()-1;
		jogador.getPartidas().set(index, partida);
		jogadorDAO.atualizarJogador(jogador);	
	}
	
	public void salvarQuestoesDaPartida() {
		partida.setQuestoesQueSairam(questoesQueSairam);
		int index = jogador.getPartidas().size()-1;
		jogador.getPartidas().set(index, partida);
		jogadorDAO.atualizarJogador(jogador);	
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
		this.partida.getRespostas_aluno().add(this.respostaDoAluno);
		//Adiciona a partida no banco de dados
		jogadorDAO.atualizarJogador(jogador);
	}
	
	public void finalizarPartida(){
		partida.setPartidaEncerrada(true);
		jogadorDAO.atualizarJogador(jogador);
		this.partida = null;
		questoesQueSairam = "";
		
	}
	
	public Partida getPartida(){
		return this.partida;
	}
	
	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setQuestoesQueSairam(String questoesQueSairam) {
		this.questoesQueSairam = questoesQueSairam;
		
	}

	/*public void encerraSessao(){
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
	}*/
	
	
}
