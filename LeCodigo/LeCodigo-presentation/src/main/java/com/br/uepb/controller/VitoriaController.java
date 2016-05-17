package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.domain.Questao;
import com.br.uepb.model.FaseModel;

@Controller
public class VitoriaController {

	private FaseModel faseModel;
	
	@RequestMapping(value = "/fase/vitoria.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("fase", faseModel);
		return modelAndView;
	}
}
