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
		
		try {
			String login = request.getSession().getAttribute("login").toString();

			if (login == null) {
				modelAndView.setViewName("redirect:/home/login.html");
			} else {
				modelAndView.setViewName("fase/transicaoFase");
			}
		} catch (Exception e) {
			modelAndView.setViewName("redirect:/home/login.html");
			return modelAndView;

		}

		
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
		try {
			if(fase==1){
				request.getSession().setAttribute("assunto", "Atribuição de váriaveis, "
						+ "tipos de variáveis, "
						+ "estrutura de condição (if-else, Switch-case)");
			}else if(fase==2){
				request.getSession().setAttribute("assunto", "Estruturas de repetição (for, while, do while)");
			}else if(fase==3){
				request.getSession().setAttribute("assunto", "Troca de variáveis, Ordenação simples e Funções");
			} else{
				request.getSession().setAttribute("assunto", "");
			}
			
		} catch (Exception e) {}

		
		modelAndView.addObject("idFase", fase);
		return modelAndView;
	}

}
