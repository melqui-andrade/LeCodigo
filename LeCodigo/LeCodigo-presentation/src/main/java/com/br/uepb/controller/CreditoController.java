package com.br.uepb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreditoController {

	@RequestMapping(value = "/home/credito.html", method = RequestMethod.GET)
	public ModelAndView perdeuGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();	
		
		modelAndView.setViewName("home/credito");
		return modelAndView;
	}

}
