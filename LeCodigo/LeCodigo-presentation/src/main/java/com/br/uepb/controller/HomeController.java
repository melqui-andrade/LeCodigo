package com.br.uepb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.domain.Partida;

@Controller
public class HomeController {
	
	private static final Log LOG = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private PartidaBusiness partidaBusiness;

	@RequestMapping(value = "/home/home.html", method = RequestMethod.GET)
	public ModelAndView paginaInicialGET(HttpServletRequest request) {
		
		LOG.debug("Iniciada a execucao do metodo: paginaInicialGET");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("partida", new Partida(0, "hoje"));
		
		//request.getSession().setAttribute("lstUsers", new ArrayList<UsuarioDomain>());
		
		LOG.debug("Finalizada a execucao do metodo: showWelcomeHtml");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/home/home.html", method = RequestMethod.POST)
	public ModelAndView addNewUser(@ModelAttribute("partida") @Valid Partida partida, BindingResult bindingResult, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		
		if(bindingResult.hasErrors()){
			
		}
		
		return modelAndView;
	}
	
}
