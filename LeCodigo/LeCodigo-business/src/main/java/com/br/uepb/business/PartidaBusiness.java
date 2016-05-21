package com.br.uepb.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;

@Component
public class PartidaBusiness {

	private Partida partida = null;
	public void iniciarPartida(String login, int id_jogador){
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		if(sessaoBusiness.getPartida()!=null){
			return;
		}
		sessaoBusiness.setFase(1);
		sessaoBusiness.setEtapa(1);
		sessaoBusiness.setBits(0);
		sessaoBusiness.setValorDaQuestao(3);
		sessaoBusiness.iniciarPartidaDoJogador(id_jogador);
		
	}
	
	public void continuarPartida(String login, int id_jogador){
		if(this.partida!=null){
			SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
			sessaoBusiness.setPartida(this.partida);
			sessaoBusiness.setBits(partida.getBits());
			sessaoBusiness.setPontuacao(partida.getPontuacao());
			sessaoBusiness.setVidas(partida.getVidas());
			sessaoBusiness.setValorDaQuestao(partida.getValorDaQuestao());
			sessaoBusiness.setQuestoesQueSairam(partida.getQuestoesQueSairam());
			sessaoBusiness.setEtapa(partida.getEtapa());
			sessaoBusiness.setFase(partida.getFase());
		}
	}
	
	public boolean ahPartidaPendente(int id_jogador){
		Jogador jogador = JogadorDAO.getInstance().buscarJogador(id_jogador);
		int qtdPartidas = jogador.getPartidas().size();
		if(qtdPartidas == 0)
			return false;
		this.partida = jogador.getPartidas().get(qtdPartidas-1);
		return !this.partida.isPartidaEncerrada();
	}
	
	public void finalizarPartida(String login){
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		sessaoBusiness.finalizarPartida();
		
	}
	
	public void avancarEtapa(String login){
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		int etapa = sessaoBusiness.getEtapa();
		int fase = sessaoBusiness.getFase();
		sessaoBusiness.setEtapa(etapa+1);
		if(fase==1){
			if(etapa<5){
				sessaoBusiness.setValorDaQuestao(3);
			}else{
				sessaoBusiness.setFase(2);
				sessaoBusiness.setEtapa(1);
				sessaoBusiness.setValorDaQuestao(5);
			}
			
		}
		else if(fase==2){
			if(etapa<5){
				sessaoBusiness.setValorDaQuestao(5);
			}else{
				sessaoBusiness.setFase(3);
				sessaoBusiness.setEtapa(1);
				sessaoBusiness.setValorDaQuestao(7);
			}
		}
		else if(fase==3){
			if(etapa<5){
				sessaoBusiness.setValorDaQuestao(7);
			}else{
				//Pensando em uma quarta fase :P
				sessaoBusiness.setFase(4);
				sessaoBusiness.setEtapa(1);
				sessaoBusiness.setValorDaQuestao(9);
			}
			
		}
	}
	
	public List<Jogador> visualizarRanking(){
		return JogadorDAO.getInstance().rankingJogadores();		
	}
}
