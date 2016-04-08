package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.runtime.parser.node.GetExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.model.LoginModel;

@Controller
public class HomeController {

	//private static final Log LOG = LogFactory.getLog(HomeController.class);


	@RequestMapping(value = "/home/home.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("model", new LoginModel());
		request.getSession().removeAttribute("login");
		request.getSession().removeAttribute("idSessao");


		return modelAndView;
	}

	@RequestMapping(value = "/home/home.html", method = RequestMethod.POST)
	public ModelAndView homePost(@ModelAttribute("model") @Valid LoginModel model,BindingResult bindingResult, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/home/apresentacao");

		if (bindingResult.hasErrors()) {
			modelAndView.addObject("model", new LoginModel());
			return modelAndView;
		}

		return new ModelAndView("redirect:/home/home.html");
	}

	@RequestMapping(value = "/home/transicaoFase.html", method = RequestMethod.GET)
	public ModelAndView transicaoGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("model", new LoginModel());
		request.getSession().removeAttribute("login");
		request.getSession().removeAttribute("idSessao");

		return modelAndView;
	}

}
