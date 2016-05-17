package com.br.uepb.controller;

import java.util.List; 

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;

@Controller
public class RelatorioAlunoController {

	
	@RequestMapping(value = "/relatorio/relatorioAluno.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jogador", new Jogador());
		modelAndView.addObject("modelViewJogador");
		List<Jogador> lstJogador = JogadorDAO.getInstance().rankingJogadores();
		request.setAttribute("lstJogador", lstJogador);
		return modelAndView;
	}
	
	// TODO: FAZER O POST. Pegar o idUsuario e listar as questoes que ele fez e identificar se ele errou, acertou ou pulou.

}
