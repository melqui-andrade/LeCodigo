package com.br.uepb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.GerenciarSessaoBusiness;
import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;

@Controller
public class QuestaoController {
	
	QuestaoBusiness questaoBusiness = new QuestaoBusiness();
	SessaoBusiness sessaoBusiness = new SessaoBusiness();

	@RequestMapping(value = "/fase/questao.html", method = RequestMethod.GET)
	public ModelAndView questaoGet(HttpServletRequest request,
		@RequestParam(value = "resposta", required = false) String resposta) {

		ModelAndView modelAndView = new ModelAndView();
		
		String login = request.getSession().getAttribute("login").toString();
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		int fase = sessaoBusiness.getFase();
		int etapa = sessaoBusiness.getEtapa();
		
		Questao questao = sessaoBusiness.ultimaQuestao();

		resposta = (String) request.getParameter("resposta");
		if (resposta != null) {
			boolean status_resposta = false;
			
			try {
				if(resposta.equals("pulou")){
					questao = questaoBusiness.pularQuestao(login, questao.getId(), fase, etapa);
				}else{
					status_resposta = questaoBusiness.verificarResposta(login, resposta, questao.getId());
					if(status_resposta){
						if(sessaoBusiness.getFase() > fase){
							//
							//passouFase = true;
							//
						}
					}else if(sessaoBusiness.getVidas() <= 0){
						ModelAndView mav = new ModelAndView("redirect:/fase/perdeu.html");
						//
						//mav.addObject("fase",faseModel);
						//
						return mav;
					}
					modelAndView.addObject("status_resposta", status_resposta);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else{
			questao = getQuestao(fase, etapa, login);
		}
		int bits = sessaoBusiness.getBits();
		int pontuacao = sessaoBusiness.getPontuacao();
		int vidas = sessaoBusiness.getVidas();			

		modelAndView.addObject("questao", questao);
		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", vidas);
		modelAndView.addObject("questao", questao);
		//modelAndView.addObject("fase", faseModel);
		modelAndView.addObject("etapa", etapa);
		return modelAndView;
	}
	
	private Questao getQuestao(int fase, int etapa, String login) {
		
		//String login = sessaoBusiness.getJogador().getLogin();
		List<Questao> questoes = GerenciarSessaoBusiness.getSessaoBusiness(login).getQuestoesQueSairam();
		Questao questao = null;
		if(questoes.size()>0){
			questao = questoes.get(questoes.size()-1);
			try {
				//Se ocorrer erro é porque ele ainda não respndeu, então será retornado a questão anterior
				if(jaRespondeu(questao, login)){
					questao = questaoBusiness.buscarQuestao(login, fase, etapa);
				}
			} catch (Exception e) {}
			
		}
		else{
			questao = questaoBusiness.buscarQuestao(login, fase, etapa);
		}
		
		return questao;
	}
	
	private boolean jaRespondeu(Questao questao, String login) {
		sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		int index = sessaoBusiness.getPartida().getRespostas_aluno().size();
		RespostaDoAluno resposta = sessaoBusiness.getPartida().getRespostas_aluno().get(index - 1);
		
		if(resposta.getId_questao()==questao.getId()){
		
			String [] possiveisRespostasCorretas = questao.getResposta().split(" | ");
			String respostasDoAluno[] = resposta.getRespostas().split(" | ");
			String ultimaRespostaDoaluno = respostasDoAluno[respostasDoAluno.length-1];
			if(ultimaRespostaDoaluno.equals("pulou")){
				return true;
			}
			for (int i = 0; i < possiveisRespostasCorretas.length; i++) {
				if(ultimaRespostaDoaluno.equals(possiveisRespostasCorretas[i])){
					return true;
				}
			}
		}
		return false;
	}
	
	@RequestMapping(value = "/fase/vida.html", method = RequestMethod.GET)
	public ModelAndView comprarVida(HttpServletRequest request) {
		String login = request.getSession().getAttribute("login").toString();
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		sessaoBusiness.comprarVida();
		return new ModelAndView("redirect:/fase/questao.html");
	}
	
}
