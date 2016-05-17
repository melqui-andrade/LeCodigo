package com.br.uepb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.model.FaseModel;


@Controller
public class DerrotaController {
	
	@RequestMapping(value = "/fase/perdeu.html", method = RequestMethod.GET)
	public ModelAndView perdeuGet(HttpServletRequest request) {
		FaseModel fase = (FaseModel)request.getAttribute("fase");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("fase", fase);
		return modelAndView;
	}

}
