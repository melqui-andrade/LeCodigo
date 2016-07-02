package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.JogadorBusiness;
import com.br.uepb.business.relatorio.RelatorioJogadorBusiness;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Estatistica;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.Relatorio;
import com.br.uepb.domain.TipoQuestao_Enum;

@Controller
public class RelatorioTurmaController {

	@RequestMapping(value = "/relatorio/relatorioTurma.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();

		try {
			int tipo_usuario = Integer.parseInt(request.getSession().getAttribute("tipo_usuario").toString());
			System.out.println("tipo usuario: " + tipo_usuario);

			if (tipo_usuario != 2) {
				modelAndView.setViewName("redirect:/home/login.html");
			} else {
				modelAndView.setViewName("relatorio/relatorioTurma");
			}
		} catch (Exception e) {
			modelAndView.setViewName("redirect:/home/login.html");
		}

		try {

			JogadorBusiness jogadorBusiness = new JogadorBusiness();
			Relatorio relatorio = jogadorBusiness.getRelatorioDaTurma();
			// Geral
			// Relatorio da FASE 1
			

			// Relatorio da FASE 2

			// Relatorio da FASE 3

			/*float porcentagemAcerto = (estatistica.get_FASE1().getCerta() + estatistica.get_FASE2().getCerta()
					+ estatistica.get_FASE3().getCerta());
			float porcentagemErros = (estatistica.get_FASE1().getErrada() + estatistica.get_FASE2().getErrada()
					+ estatistica.get_FASE3().getErrada());
			float porcentagemPulos = (estatistica.get_FASE1().getPulo() + estatistica.get_FASE2().getPulo()
					+ estatistica.get_FASE3().getPulo());

			float soma = porcentagemAcerto + porcentagemErros + porcentagemPulos;

			porcentagemAcerto = (porcentagemAcerto * 100) / soma;
			porcentagemErros = (porcentagemErros * 100) / soma;
			porcentagemPulos = (porcentagemPulos * 100) / soma;

			// Relatorio GERAL
			estatistica.get_PORCENTAGEM_GERAL().setCerta(estatistica.get_FASE1().getCerta()
					+ estatistica.get_FASE2().getCerta() + estatistica.get_FASE3().getCerta());
			estatistica.get_PORCENTAGEM_GERAL().setErrada(estatistica.get_FASE1().getErrada()
					+ estatistica.get_FASE2().getErrada() + estatistica.get_FASE3().getErrada());
			estatistica.get_PORCENTAGEM_GERAL().setPulo(estatistica.get_FASE1().getPulo()
					+ estatistica.get_FASE2().getPulo() + estatistica.get_FASE3().getPulo());*/

			modelAndView.addObject("relatorio", relatorio);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return modelAndView;
	}

}
