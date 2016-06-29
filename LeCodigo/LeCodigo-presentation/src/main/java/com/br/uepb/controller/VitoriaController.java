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
		try {
			String login = request.getSession().getAttribute("login").toString();

			if (login == null) {
				modelAndView.setViewName("redirect:/home/login.html");
			} else {
				modelAndView.setViewName("fase/vitoria");
			}
		} catch (Exception e) {
			modelAndView.setViewName("redirect:/home/login.html");
		}

		return modelAndView;
	}
}
