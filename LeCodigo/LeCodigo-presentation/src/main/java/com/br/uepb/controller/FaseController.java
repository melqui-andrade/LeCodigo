package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.domain.Questao;
import com.br.uepb.model.FaseModel;

@Controller
public class FaseController {

	private QuestaoBusiness questaoBusiness = new QuestaoBusiness();
	private PartidaBusiness partidaBusiness = new PartidaBusiness();

	private List<Questao> listaQuestoesFase1 = new ArrayList<Questao>();
	private List<Questao> listaQuestoesFase2 = new ArrayList<Questao>();
	private List<Questao> listaQuestoesFase3 = new ArrayList<Questao>();

	// enum == enunciado das questoes :)
	private List<String> listaEnumQuestoes1 = new ArrayList<String>();
	private List<String> listaEnumQuestoes2 = new ArrayList<String>();
	private List<String> listaEnumQuestoes3 = new ArrayList<String>();

	private FaseModel faseModel;
	private boolean passouFase = false;
	private int idJogador;
	private boolean ehNovaPartida = true;
	int bits;
	int pontuacao;
	int vidas;
	int fase;
	int etapa;

	@RequestMapping(value = "/fase/fase.html", method = RequestMethod.GET)
	public ModelAndView faseGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		
		if(passouFase){
			passouFase = false;
            return new ModelAndView("redirect:/fase/transicaoFase.html");
		}
		
		bits = SessaoBusiness.getInstace().getBits();
		pontuacao = SessaoBusiness.getInstace().getPontuacao();
		vidas = SessaoBusiness.getInstace().getVidas();
		fase = SessaoBusiness.getInstace().getFase();
		etapa = SessaoBusiness.getInstace().getEtapa();

		
		if(ehNovaPartida){
			poularQuestoes();
		}else{
			popularQuestoesDaSessao();
		}
		
		Questao questao = null;
		if (fase == 1) {
			questao = listaQuestoesFase1.get(etapa - 1);
		} else if (fase == 2) {
			questao = listaQuestoesFase2.get(etapa - 1);
		} else if (fase == 3) {
			questao = listaQuestoesFase3.get(etapa - 1);
		}
		

		faseModel = new FaseModel(fase);

		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", vidas);
		modelAndView.addObject("fase", faseModel);
		modelAndView.addObject("etapa", etapa);

		return modelAndView;
	}

	private void popularQuestoesDaSessao() {
		if (fase == 1 && listaQuestoesFase1.isEmpty()) {
			for (int i = 5; i >= etapa; i--) {
				listaQuestoesFase1.add(i-1, questaoBusiness.buscarQuestao(fase, i));
			}
		} else if (fase == 2 && listaQuestoesFase2.isEmpty()) {
			for (int i = 5; i >= etapa; i--) {
				listaQuestoesFase2.add(i-1, questaoBusiness.buscarQuestao(fase, i));
			}
		} else if (fase == 3 && listaQuestoesFase3.isEmpty()) {
			for (int i = 5; i >= etapa; i--) {
				listaQuestoesFase3.add(i-1, questaoBusiness.buscarQuestao(fase, i));
			}
		}
	}

	private void poularQuestoes() {
		if (fase == 1 && listaQuestoesFase1.isEmpty()) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase1.add(questaoBusiness.buscarQuestao(fase, i));
			}
		} else if (fase == 2 && listaQuestoesFase2.isEmpty()) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase2.add(questaoBusiness.buscarQuestao(fase, i));
			}
		} else if (fase == 3 && listaQuestoesFase3.isEmpty()) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase3.add(questaoBusiness.buscarQuestao(fase, i));
			}
		}
	}

	// id é etapa
	@RequestMapping(value = "/fase/questao.html", method = RequestMethod.GET)
	public ModelAndView questaoGet(HttpServletRequest request,
			@RequestParam(value = "resposta", required = false) String resposta) {

		ModelAndView modelAndView = new ModelAndView();

		int fase = SessaoBusiness.getInstace().getFase();
		int etapa = SessaoBusiness.getInstace().getEtapa();


		Questao questao = null;
		if (fase == 1) {
			questao = listaQuestoesFase1.get(etapa - 1);
		} else if (fase == 2) {
			questao = listaQuestoesFase2.get(etapa - 1);
		} else if (fase == 3) {
			questao = listaQuestoesFase3.get(etapa - 1);
		}

		resposta = (String) request.getParameter("resposta");
		if (resposta != null) {
			boolean status_resposta = false;
			
			try {
				if(resposta.equals("pulou")){
					questao = questaoBusiness.pularQuestao(questao.getId(), fase, etapa);
					if (fase == 1) {
						listaQuestoesFase1.add(etapa - 1,  questao);
					} else if (fase == 2) {
						listaQuestoesFase2.add(etapa - 1,  questao);
					} else if (fase == 3) {
						listaQuestoesFase3.add(etapa - 1,  questao);
					}
				}else{
					status_resposta = questaoBusiness.verificarResposta(resposta, questao.getId());
					if(status_resposta){
						partidaBusiness.avancarEtapa();
						if(SessaoBusiness.getInstace().getFase() > fase){
							passouFase = true;
						}
					}else if(SessaoBusiness.getInstace().getVidas() == 0){
						ModelAndView mav = new ModelAndView("redirect:/fase/perdeu.html");
						mav.addObject("fase",faseModel);
						return mav;
					}
					modelAndView.addObject("status_resposta", status_resposta);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

		}
			
			int bits = SessaoBusiness.getInstace().getBits();
			int pontuacao = SessaoBusiness.getInstace().getPontuacao();
			int vidas = SessaoBusiness.getInstace().getVidas();			

			modelAndView.addObject("questao", questao);
			modelAndView.addObject("idFase", fase);
			modelAndView.addObject("bits", bits);
			modelAndView.addObject("pontuacao", pontuacao);
			modelAndView.addObject("vidas", vidas);
			modelAndView.addObject("questao", questao);
			modelAndView.addObject("fase", faseModel);
			modelAndView.addObject("etapa", etapa);
			return modelAndView;
		
		//return modelAndView;
	}

	@RequestMapping(value = "/fase/transicaoFase.html", method = RequestMethod.GET)
	public ModelAndView transicaoGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		idJogador = SessaoBusiness.getInstace().getJogador().getId();
		
		if(partidaBusiness.ahPartidaPendente(idJogador)){
			partidaBusiness.continuarPartida(idJogador);
		}else{
			partidaBusiness.iniciarPartida(idJogador);
		}
		
		int fase = SessaoBusiness.getInstace().getFase();
		faseModel = new FaseModel(fase);

		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("fase", faseModel);

		return modelAndView;
	}

}
