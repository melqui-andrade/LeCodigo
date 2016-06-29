package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.relatorio.RelatorioJogadorBusiness;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;
import com.br.uepb.model.EstatisticaModel;
import com.br.uepb.model.RelatorioModel;

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

		RelatorioJogadorBusiness relatorio = new RelatorioJogadorBusiness();
		try {
			// Geral
			RelatorioModel estatistica = new RelatorioModel();

			// Relatorio da FASE 1
			relatorio.estatisticaFase(1);
			estatistica.get_FASE1().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_FASE1().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_FASE1().setPulo(relatorio.getQtdRespostaPulou());

			// Relatorio da FASE 2
			relatorio.estatisticaFase(2);
			estatistica.get_FASE2().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_FASE2().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_FASE2().setPulo(relatorio.getQtdRespostaPulou());

			// Relatorio da FASE 3
			relatorio.estatisticaFase(3);
			estatistica.get_FASE3().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_FASE3().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_FASE3().setPulo(relatorio.getQtdRespostaPulou());

			float porcentagemAcerto = (estatistica.get_FASE1().getCerta() + estatistica.get_FASE2().getCerta()
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
					+ estatistica.get_FASE2().getPulo() + estatistica.get_FASE3().getPulo());

			// Resultados do relatório dos tipos de Questão.
			// FASE 1
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.ATRIBUICAO);
			estatistica.get_TIPOS_DE_VARIAVEIS().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_TIPOS_DE_VARIAVEIS().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_TIPOS_DE_VARIAVEIS().setPulo(relatorio.getQtdRespostaPulou());

			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.IF_ELSE);
			estatistica.get_IF_ELSE().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_IF_ELSE().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_IF_ELSE().setPulo(relatorio.getQtdRespostaPulou());

			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.SWITCH_CASE);
			estatistica.get_SWITCH_CASE().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_SWITCH_CASE().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_SWITCH_CASE().setPulo(relatorio.getQtdRespostaPulou());

			// FASE 2
			relatorio.estatisticaIndividual(2, TipoQuestao_Enum.FOR);
			estatistica.get_FOR().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_FOR().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_FOR().setPulo(relatorio.getQtdRespostaPulou());

			relatorio.estatisticaIndividual(2, TipoQuestao_Enum.WHILE);
			estatistica.get_WHILE().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_WHILE().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_WHILE().setPulo(relatorio.getQtdRespostaPulou());

			relatorio.estatisticaIndividual(2, TipoQuestao_Enum.DO_WHILE);
			estatistica.get_DO_WHILE().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_DO_WHILE().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_DO_WHILE().setPulo(relatorio.getQtdRespostaPulou());

			// FASE 3
			relatorio.estatisticaIndividual(3, TipoQuestao_Enum.TROCA_VARIAVEIS);
			estatistica.get_TROCA_DE_VARIAVEIS().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_TROCA_DE_VARIAVEIS().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_TROCA_DE_VARIAVEIS().setPulo(relatorio.getQtdRespostaPulou());

			relatorio.estatisticaIndividual(3, TipoQuestao_Enum.ORDENACAO_SIMPLES);
			estatistica.get_ORDENACAO_SIMPLES().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_ORDENACAO_SIMPLES().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_ORDENACAO_SIMPLES().setPulo(relatorio.getQtdRespostaPulou());

			relatorio.estatisticaIndividual(3, TipoQuestao_Enum.FUNCOES);
			estatistica.get_FUNCOES().setCerta(relatorio.getQtdRespostaCorreta());
			estatistica.get_FUNCOES().setErrada(relatorio.getQtdRespostaErrada());
			estatistica.get_FUNCOES().setPulo(relatorio.getQtdRespostaPulou());

			modelAndView.addObject("estatistica", estatistica);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return modelAndView;
	}

}
