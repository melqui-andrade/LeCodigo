package com.br.uepb.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.br.uepb.business.GerenciarSessaoBusiness;
import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.business.SessaoBusiness;

@Controller
public class TransicaoFaseController {

	private PartidaBusiness partidaBusiness = new PartidaBusiness();

	@RequestMapping(value = "/fase/transicaoFase.html", method = RequestMethod.GET)
	public ModelAndView transicaoGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		String login = request.getSession().getAttribute("login").toString();
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		int idJogador = sessaoBusiness.getJogador().getId();

		if (partidaBusiness.ahPartidaPendente(idJogador)) {
			// ehNovaPartida = false;
			partidaBusiness.continuarPartida(login, idJogador);
		} else {
			// ehNovaPartida = true;
			partidaBusiness.iniciarPartida(login, idJogador);
		}
		int fase = sessaoBusiness.getFase();
		modelAndView.addObject("idFase", fase);
		modelAndView.setViewName("fase/transicaoFase");
		return modelAndView;
	}

}
