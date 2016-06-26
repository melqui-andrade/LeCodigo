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

		RelatorioJogadorBusiness relatorio = new RelatorioJogadorBusiness();
		try {
			// Geral
			RelatorioModel estatistica = new RelatorioModel();

			// Relatorio da FASE 1
			relatorio.estatisticaFase(1);
			estatistica._FASE1.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._FASE1.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._FASE1.setPulo(relatorio.getQtdRespostaPulou());

			request.setAttribute("questoesCertasF1", estatistica._FASE1.getCerta());
			request.setAttribute("questoesErradasF1", estatistica._FASE1.getErrada());
			request.setAttribute("questoesPulouF1", estatistica._FASE1.getPulo());

			// Relatorio da FASE 2
			relatorio.estatisticaFase(2);
			estatistica._FASE2.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._FASE2.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._FASE2.setPulo(relatorio.getQtdRespostaPulou());

			request.setAttribute("questoesCertasF2", estatistica._FASE2.getCerta());
			request.setAttribute("questoesErradasF2", estatistica._FASE2.getErrada());
			request.setAttribute("questoesPulouF2", estatistica._FASE2.getPulo());

			// Relatorio da FASE 3
			relatorio.estatisticaFase(3);
			estatistica._FASE3.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._FASE3.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._FASE3.setPulo(relatorio.getQtdRespostaPulou());

			request.setAttribute("questoesCertasF3", estatistica._FASE3.getCerta());
			request.setAttribute("questoesErradasF3", estatistica._FASE3.getErrada());
			request.setAttribute("questoesPulouF3", estatistica._FASE3.getPulo());

			float porcentagemAcerto = (estatistica._FASE1.getCerta() + estatistica._FASE2.getCerta() + estatistica._FASE3.getCerta());
			float porcentagemErros = (estatistica._FASE1.getErrada() + estatistica._FASE2.getErrada() + estatistica._FASE3.getErrada());
			float porcentagemPulos = (estatistica._FASE1.getPulo() + estatistica._FASE2.getPulo() + estatistica._FASE3.getPulo());

			float soma = porcentagemAcerto + porcentagemErros + porcentagemPulos;

			porcentagemAcerto = (porcentagemAcerto * 100)/soma;
			porcentagemErros = (porcentagemErros * 100)/soma;
			porcentagemPulos = (porcentagemPulos * 100)/soma;

			
			// Relatorio GERAL
			estatistica._PORCENTAGEM_GERAL.setCerta(estatistica._FASE1.getCerta()+estatistica._FASE2.getCerta()+estatistica._FASE3.getCerta());
			estatistica._PORCENTAGEM_GERAL.setErrada(estatistica._FASE1.getErrada()+estatistica._FASE2.getErrada()+estatistica._FASE3.getErrada());
			estatistica._PORCENTAGEM_GERAL.setPulo(estatistica._FASE1.getPulo()+estatistica._FASE2.getPulo()+estatistica._FASE3.getPulo());			
			
			request.setAttribute("certo", porcentagemAcerto);
			request.setAttribute("erro", porcentagemErros);
			request.setAttribute("pulo", porcentagemPulos);

			
			// Resultados do relatório dos tipos de Questão.
			// FASE 1
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.ATRIBUICAO);
			estatistica._TIPOS_DE_VARIAVEIS.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._TIPOS_DE_VARIAVEIS.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._TIPOS_DE_VARIAVEIS.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("tiposVariaveisCerto", estatistica._TIPOS_DE_VARIAVEIS.getCerta());
				request.setAttribute("tiposVariaveisErrado", estatistica._TIPOS_DE_VARIAVEIS.getErrada());
				request.setAttribute("tiposVariaveisPulo", estatistica._TIPOS_DE_VARIAVEIS.getPulo());
				
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.IF_ELSE);
			estatistica._IF_ELSE.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._IF_ELSE.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._IF_ELSE.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("ifElseCerto", estatistica._IF_ELSE.getCerta());
				request.setAttribute("ifElseErrado", estatistica._IF_ELSE.getErrada());
				request.setAttribute("ifElsePulo", estatistica._IF_ELSE.getPulo());
				
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.SWITCH_CASE);
			estatistica._SWITCH_CASE.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._SWITCH_CASE.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._SWITCH_CASE.setPulo(relatorio.getQtdRespostaPulou());
				
				request.setAttribute("switchCerto", estatistica._SWITCH_CASE.getCerta());
				request.setAttribute("switchErrado", estatistica._SWITCH_CASE.getErrada());
				request.setAttribute("switchPulo", estatistica._SWITCH_CASE.getPulo());

				// FASE 2
			relatorio.estatisticaIndividual(2, TipoQuestao_Enum.FOR);
			estatistica._FOR.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._FOR.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._FOR.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("forCerto", estatistica._FOR.getCerta());
				request.setAttribute("forErrado", estatistica._FOR.getErrada());
				request.setAttribute("forPulo", estatistica._FOR.getPulo());
			
			relatorio.estatisticaIndividual(2, TipoQuestao_Enum.WHILE);
			estatistica._WHILE.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._WHILE.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._WHILE.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("whileCerto", estatistica._WHILE.getCerta());
				request.setAttribute("whileErrado", estatistica._WHILE.getErrada());
				request.setAttribute("whilePulo", estatistica._WHILE.getPulo());
			
			relatorio.estatisticaIndividual(2, TipoQuestao_Enum.DO_WHILE);
			estatistica._DO_WHILE.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._DO_WHILE.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._DO_WHILE.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("doWhileCerto", estatistica._DO_WHILE.getCerta());
				request.setAttribute("doWhileErrado", estatistica._DO_WHILE.getErrada());
				request.setAttribute("doWhilePulo", estatistica._DO_WHILE.getPulo());
			
				// FASE 3
			relatorio.estatisticaIndividual(3, TipoQuestao_Enum.TROCA_VARIAVEIS);
			estatistica._TROCA_DE_VARIAVEIS.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._TROCA_DE_VARIAVEIS.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._TROCA_DE_VARIAVEIS.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("troca_variaveisCerto", estatistica._TROCA_DE_VARIAVEIS.getCerta());
				request.setAttribute("troca_variaveisErrado", estatistica._TROCA_DE_VARIAVEIS.getErrada());
				request.setAttribute("troca_variaveisPulo", estatistica._TROCA_DE_VARIAVEIS.getPulo());
				
			relatorio.estatisticaIndividual(3, TipoQuestao_Enum.ORDENACAO_SIMPLES);
			estatistica._ORDENACAO_SIMPLES.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._ORDENACAO_SIMPLES.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._ORDENACAO_SIMPLES.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("ordenacaoCerto", estatistica._ORDENACAO_SIMPLES.getCerta());
				request.setAttribute("ordenacaoErrado", estatistica._ORDENACAO_SIMPLES.getErrada());
				request.setAttribute("ordenacaoPulo", estatistica._ORDENACAO_SIMPLES.getPulo());
				
			relatorio.estatisticaIndividual(3, TipoQuestao_Enum.FUNCOES);
			estatistica._FUNCOES.setCerta(relatorio.getQtdRespostaCorreta());
			estatistica._FUNCOES.setErrada(relatorio.getQtdRespostaErrada());
			estatistica._FUNCOES.setPulo(relatorio.getQtdRespostaPulou());
			
				request.setAttribute("funcoesCerto", estatistica._FUNCOES.getCerta());
				request.setAttribute("funcoesErrado", estatistica._FUNCOES.getErrada());
				request.setAttribute("funcoesPulo", estatistica._FUNCOES.getPulo());
				
	
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return modelAndView;
	}

}
