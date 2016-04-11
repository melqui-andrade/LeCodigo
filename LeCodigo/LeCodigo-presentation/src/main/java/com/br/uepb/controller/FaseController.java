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

	FaseModel faseModel;

	@RequestMapping(value = "/fase/fase.html", method = RequestMethod.GET)
	public ModelAndView faseGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		int bits = SessaoBusiness.getInstace().getBits();
		int pontuacao = SessaoBusiness.getInstace().getPontuacao();
		int vidas = SessaoBusiness.getInstace().getVidas();
		int fase = SessaoBusiness.getInstace().getFase();
		int etapa = SessaoBusiness.getInstace().getEtapa();

		if (fase == 1 && listaQuestoesFase1.isEmpty()) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase1.add(questaoBusiness.buscarQuestao(fase, i));
				// listaEnumQuestoes1.add(questaoBusiness.getParteDoEnunciado(listaQuestoesFase1.get(i).getId(),
				// 5));
			}
		} else if (fase == 2 && listaQuestoesFase2.isEmpty()) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase2.add(questaoBusiness.buscarQuestao(fase, i));
				// listaEnumQuestoes2.add(questaoBusiness.getParteDoEnunciado(listaQuestoesFase2.get(i).getId(),
				// 5));
			}
		} else if (fase == 3 && listaQuestoesFase3.isEmpty()) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase3.add(questaoBusiness.buscarQuestao(fase, i));
				// listaEnumQuestoes3.add(questaoBusiness.getParteDoEnunciado(listaQuestoesFase3.get(i).getId(),
				// 5));
			}
		}

		faseModel = new FaseModel(fase);

		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", vidas);
		modelAndView.addObject("fase", faseModel);
		modelAndView.addObject("etapa", etapa);

		return modelAndView;
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

			try {
				if(questaoBusiness.verificarResposta(resposta, questao.getId())){
					return new ModelAndView("redirect:/fase/fase.html");
				}				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			
			int bits = SessaoBusiness.getInstace().getBits();
			int pontuacao = SessaoBusiness.getInstace().getPontuacao();
			int vidas = SessaoBusiness.getInstace().getVidas();			

			modelAndView.addObject("idFase", fase);
			modelAndView.addObject("bits", bits);
			modelAndView.addObject("pontuacao", pontuacao);
			modelAndView.addObject("vidas", vidas);
			modelAndView.addObject("questao", questao);
			modelAndView.addObject("fase", faseModel);
			modelAndView.addObject("etapa", etapa);
			return modelAndView;
		}
		return modelAndView;
	}

	@RequestMapping(value = "/fase/transicaoFase.html", method = RequestMethod.GET)
	public ModelAndView transicaoGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		partidaBusiness.iniciarPartida(0);
		int fase = SessaoBusiness.getInstace().getFase();
		faseModel = new FaseModel(fase);

		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("fase", faseModel);

		return modelAndView;
	}

}
