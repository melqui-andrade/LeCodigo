package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RelatorioController {
	
	@RequestMapping(value = "/relatorio/relatorio.html", method = RequestMethod.GET)
	public ModelAndView relatorioGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();

		return modelAndView;
	}

	
}
