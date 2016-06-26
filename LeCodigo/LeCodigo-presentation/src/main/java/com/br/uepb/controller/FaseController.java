package com.br.uepb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.GerenciarSessaoBusiness;
import com.br.uepb.business.SessaoBusiness;

@Controller
public class FaseController {

	SessaoBusiness sessaoBusiness;
	private int fase = 1;

	@RequestMapping(value = "/fase/fase.html", method = RequestMethod.GET)
	public ModelAndView faseGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		String login = request.getSession().getAttribute("login").toString();
		sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);

		if (fase < sessaoBusiness.getFase()) {
			fase = sessaoBusiness.getFase();
			return new ModelAndView("redirect:/fase/transicaoFase.html");
		}

		int bits = sessaoBusiness.getBits();
		int pontuacao = sessaoBusiness.getPontuacao();
		int vidas = sessaoBusiness.getVidas();
		fase = sessaoBusiness.getFase();
		int etapa = sessaoBusiness.getEtapa();

		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", vidas);
		modelAndView.addObject("etapa", etapa);

		modelAndView.setViewName("fase/fase");
		return modelAndView;
	}
}
