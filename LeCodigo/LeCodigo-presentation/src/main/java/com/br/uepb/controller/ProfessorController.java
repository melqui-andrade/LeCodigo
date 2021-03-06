package com.br.uepb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.JogadorBusiness;
import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.model.JogadorModel;

@Controller
public class ProfessorController {

	@RequestMapping(value = "/professor/home.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();

		try {
			int tipo_usuario = Integer.parseInt(request.getSession().getAttribute("tipo_usuario").toString());
			System.out.println("tipo usuario: " + tipo_usuario);

			if (tipo_usuario != 2) {
				modelAndView.setViewName("redirect:/home/login.html");
			} else {
				modelAndView.setViewName("professor/home");
			}
		} catch (Exception e) {
			modelAndView.setViewName("redirect:/home/login.html");
		}

		return modelAndView;
	}

}
