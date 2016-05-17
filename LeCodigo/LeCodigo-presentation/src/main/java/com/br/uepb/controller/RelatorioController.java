package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.JogadorBusiness;
import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;

@Controller
public class RelatorioController {

	 private QuestaoBusiness questoesBusiness = new QuestaoBusiness();
	
	@RequestMapping(value = "/relatorio/relatorio.html", method = RequestMethod.GET)
	public ModelAndView relatorioGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
//		List<Jogador> lstAlunos = new JogadorBusiness().
//		request.getSession().setAttribute("lstAluno", lstAlunos);
		return modelAndView;
	}

	
}
