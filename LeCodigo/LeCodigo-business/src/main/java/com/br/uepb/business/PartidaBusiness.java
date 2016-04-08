package com.br.uepb.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.br.uepb.domain.Jogador;

@Component
public class PartidaBusiness {

	SessaoBusiness sessaoBusiness = SessaoBusiness.getInstace();
	public void iniciarPartida(int id_jogador){
		sessaoBusiness.setFase(1);
		sessaoBusiness.setEtapa(1);
		sessaoBusiness.setBits(0);
		sessaoBusiness.setValorDaQuestao(3);
		
	}
	
	public void finalizarPartida(){
		
		
	}
	
	public void avancarEtapa(){
		int etapa = sessaoBusiness.getEtapa();
		sessaoBusiness.setEtapa(etapa+1);
		if(etapa<=5){
			sessaoBusiness.setFase(1);
			sessaoBusiness.setValorDaQuestao(3);
		}
		else if(etapa<=10){
			sessaoBusiness.setFase(2);
			sessaoBusiness.setValorDaQuestao(5);
		}
		else if(etapa<=15){
			sessaoBusiness.setFase(3);
			sessaoBusiness.setValorDaQuestao(7);
		}
	}
	
	public List<Jogador> visualizarRanking(){
		return null;
	}
	
}
