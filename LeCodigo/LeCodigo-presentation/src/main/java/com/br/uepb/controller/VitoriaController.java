package com.br.uepb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VitoriaController {
	
	@RequestMapping(value = "/fase/vitoria.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("fase/vitoria");
		return modelAndView;
	}
}
