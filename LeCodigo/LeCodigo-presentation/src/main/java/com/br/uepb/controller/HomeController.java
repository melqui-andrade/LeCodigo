package com.br.uepb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.GerenciarSessaoBusiness;
import com.br.uepb.business.JogadorBusiness;
import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.model.JogadorModel;

@Controller
public class HomeController {

	@RequestMapping(value = "/home/home.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		try {
			String login = request.getSession().getAttribute("login").toString();
			GerenciarSessaoBusiness.removeSessao(login);
			//String login = request.getSession().getAttribute("login").toString();
			//SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
			//sessaoBusiness.encerraSessao();
		} catch (Exception e) {
		}
		
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	@RequestMapping(value = "/home/cadastrar.html", method = RequestMethod.GET)
	public ModelAndView cadastrarGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home/cadastrar");
		modelAndView.addObject("jogadorModel", new JogadorModel());

		modelAndView.addObject("status", "3");
		return modelAndView;
	}

	@RequestMapping(value = "/home/cadastrar.html", method = RequestMethod.POST)
	public ModelAndView cadastrarPost(@ModelAttribute("jogadorModel") JogadorModel jogadorModel, Model model) {
		JogadorBusiness jogadorBusiness = new JogadorBusiness();

		ModelAndView modelAndView = new ModelAndView();
		if (jogadorModel != null) {

			try {
				jogadorBusiness.cadastraJogador(jogadorModel.getNome(), jogadorModel.getLogin(),
						jogadorModel.getSenha(), jogadorModel.getTipo());
				modelAndView.addObject("status", "0");
				modelAndView.setViewName("home/cadastrar");

			} catch (Exception e) {
				modelAndView.addObject("status", "1");
				modelAndView.setViewName("home/cadastrar");
				modelAndView.addObject("jogadorModel", new JogadorModel());
			}

		}
		return modelAndView;
	}

	@RequestMapping(value = "/home/login.html", method = RequestMethod.GET)
	public ModelAndView loginGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jogadorModel", new JogadorModel());
		return modelAndView;
	}

	@RequestMapping(value = "/home/login.html", method = RequestMethod.POST)
	public ModelAndView loginPost(@ModelAttribute("jogadorModel") JogadorModel jogadorModel, HttpSession session, Model model) {
		JogadorBusiness jogadorBusiness = new JogadorBusiness();

		ModelAndView modelAndView = new ModelAndView();
		try {
			jogadorBusiness.autenticarJogador(jogadorModel.getLogin(), jogadorModel.getSenha());
			session.setAttribute("login", jogadorModel.getLogin());
			SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(jogadorModel.getLogin());
			Jogador jog = sessaoBusiness.getJogador();
			int tipo_usuario = sessaoBusiness.getJogador().getTipo().ordinal();
			if ( tipo_usuario == 1) { // aluno
				return new ModelAndView("redirect:/fase/transicaoFase.html");
			}
			if (tipo_usuario == 2) { // professor
				modelAndView.setViewName("professor/home");
			}

		} catch (Exception e) {
			modelAndView.setViewName("home/login");
			modelAndView.addObject("jogadorModel", new JogadorModel());
		}
		return modelAndView;
	}

	@RequestMapping(value = "/home/instrucoes.html", method = RequestMethod.GET)
	public ModelAndView instrucoesGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	@RequestMapping(value = "/home/ranking.html", method = RequestMethod.GET)
	public ModelAndView rankingGet(HttpServletRequest request) {

		PartidaBusiness partidaBusiness = new PartidaBusiness();
		List<Jogador> jogadores = partidaBusiness.visualizarRanking();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jogadores", jogadores);
		return modelAndView;
	}
}
