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
import com.br.uepb.model.RelatorioModel;

@Controller
public class RelatorioTurmaController {

	@RequestMapping(value = "/relatorio/relatorioTurma.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();

		RelatorioJogadorBusiness relatorio = new RelatorioJogadorBusiness();
		try {
			// Geral
			RelatorioModel rel = new RelatorioModel();

			RelatorioModel rel_f1 = new RelatorioModel();
			RelatorioModel rel_f2 = new RelatorioModel();
			RelatorioModel rel_f3 = new RelatorioModel();

			RelatorioModel rel_IF_ELSE = new RelatorioModel();
			RelatorioModel rel_TiposVariaveis = new RelatorioModel();
			RelatorioModel rel_SWICTH_CASE = new RelatorioModel();

			RelatorioModel rel_DO_WHILE = new RelatorioModel();
			RelatorioModel rel_WHILE = new RelatorioModel();
			RelatorioModel rel_FOR = new RelatorioModel();

			RelatorioModel rel_TROCA_DE_VARIAVEIS = new RelatorioModel();
			RelatorioModel rel_ORDENACAO_SIMPLES = new RelatorioModel();
			RelatorioModel rel_FUNCOES = new RelatorioModel();

			// Relatorio da FASE 1
			relatorio.estatisticaFase(1);
			rel_f1.setCerta(relatorio.getQtdRespostaCorreta() + "");
			rel_f1.setErrada(relatorio.getQtdRespostaErrada() + "");
			rel_f1.setPulo(relatorio.getQtdRespostaPulou() + "");

			request.setAttribute("questoesCertasF1", rel_f1.getCerta());
			request.setAttribute("questoesErradasF1", rel_f1.getErrada());
			request.setAttribute("questoesPulouF1", rel_f1.getPulo());

			// Relatorio da FASE 2
			relatorio.estatisticaFase(2);
			rel_f2.setCerta(relatorio.getQtdRespostaCorreta() + "");
			rel_f2.setErrada(relatorio.getQtdRespostaErrada() + "");
			rel_f3.setPulo(relatorio.getQtdRespostaPulou() + "");

			request.setAttribute("questoesCertasF2", rel_f2.getCerta());
			request.setAttribute("questoesErradasF2", rel_f2.getErrada());
			request.setAttribute("questoesPulouF2", rel_f2.getPulo());

			// Relatorio da FASE 3
			relatorio.estatisticaFase(3);
			rel_f3.setCerta(relatorio.getQtdRespostaCorreta() + "");
			rel_f3.setErrada(relatorio.getQtdRespostaErrada() + "");
			rel_f3.setPulo(relatorio.getQtdRespostaPulou() + "");

			request.setAttribute("questoesCertasF3", rel_f2.getCerta() + "");
			request.setAttribute("questoesErradasF3", rel_f2.getErrada() + "");
			request.setAttribute("questoesPulouF3", rel_f2.getPulo() + "");

			float porcentagemAcerto = (Float.parseFloat(rel_f1.getCerta()) + Float.parseFloat(rel_f2.getCerta())
					+ Float.parseFloat(rel_f3.getCerta()));
			float porcentagemErros = (Float.parseFloat(rel_f1.getErrada()) + Float.parseFloat(rel_f2.getErrada())
					+ Float.parseFloat(rel_f3.getErrada()));
			float porcentagemPulos = (Float.parseFloat(rel_f1.getPulo()) + Float.parseFloat(rel_f2.getPulo())
					+ Float.parseFloat(rel_f3.getPulo()));

			float soma = porcentagemAcerto + porcentagemErros + porcentagemPulos;

			porcentagemAcerto = (porcentagemAcerto * 100)/soma;
			porcentagemErros = (porcentagemErros * 100)/soma;
			porcentagemPulos = (porcentagemPulos * 100)/soma;

			
			// Relatorio GERAL
			rel.setCerta(rel_f1.getCerta()+rel_f2.getCerta()+rel_f3.getCerta());
			rel.setErrada(rel_f1.getErrada()+rel_f2.getErrada()+rel_f3.getErrada());
			rel.setCerta(rel_f1.getPulo()+rel_f2.getPulo()+rel_f3.getPulo());			
			
			request.setAttribute("certo", porcentagemAcerto);
			request.setAttribute("erro", porcentagemErros);
			request.setAttribute("pulo", porcentagemPulos);

			
			// Resultados do relatório dos tipos de Questão.
			// FASE 1
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.ATRIBUICAO);
			rel_TiposVariaveis.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_TiposVariaveis.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_TiposVariaveis.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("tiposVariaveisCerto", rel_TiposVariaveis.getCerta());
				request.setAttribute("tiposVariaveisErrado", rel_TiposVariaveis.getErrada());
				request.setAttribute("tiposVariaveisPulo", rel_TiposVariaveis.getPulo());
				
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.IF_ELSE);
			rel_IF_ELSE.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_IF_ELSE.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_IF_ELSE.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("ifElseCerto", rel_IF_ELSE.getCerta());
				request.setAttribute("ifElseErrado", rel_IF_ELSE.getErrada());
				request.setAttribute("ifElsePulo", rel_IF_ELSE.getPulo());
				
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.SWITCH_CASE);
			rel_SWICTH_CASE.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_SWICTH_CASE.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_SWICTH_CASE.setPulo(relatorio.getQtdRespostaPulou()+"");
				
				request.setAttribute("switchCerto", rel_SWICTH_CASE.getCerta());
				request.setAttribute("switchErrado", rel_SWICTH_CASE.getErrada());
				request.setAttribute("switchPulo", rel_SWICTH_CASE.getPulo());

				// FASE 2
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.FOR);
			rel_FOR.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_FOR.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_FOR.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("forCerto", rel_FOR.getCerta());
				request.setAttribute("forErrado", rel_FOR.getErrada());
				request.setAttribute("forPulo", rel_FOR.getPulo());
			
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.WHILE);
			rel_WHILE.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_WHILE.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_WHILE.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("whileCerto", rel_WHILE.getCerta());
				request.setAttribute("whileErrado", rel_WHILE.getErrada());
				request.setAttribute("whilePulo", rel_WHILE.getPulo());
			
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.DO_WHILE);
			rel_DO_WHILE.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_DO_WHILE.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_DO_WHILE.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("doWhileCerto", rel_DO_WHILE.getCerta());
				request.setAttribute("doWhileErrado", rel_DO_WHILE.getErrada());
				request.setAttribute("doWhilePulo", rel_DO_WHILE.getPulo());
			
				// FASE 3
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.TROCA_VARIAVEIS);
			rel_TROCA_DE_VARIAVEIS.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_TROCA_DE_VARIAVEIS.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_TROCA_DE_VARIAVEIS.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("troca_variaveisCerto", rel_TROCA_DE_VARIAVEIS.getCerta());
				request.setAttribute("troca_variaveisErrado", rel_TROCA_DE_VARIAVEIS.getErrada());
				request.setAttribute("troca_variaveisPulo", rel_TROCA_DE_VARIAVEIS.getPulo());
				
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.ORDENACAO_SIMPLES);
			rel_ORDENACAO_SIMPLES.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_ORDENACAO_SIMPLES.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_ORDENACAO_SIMPLES.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("ordenacaoCerto", rel_ORDENACAO_SIMPLES.getCerta());
				request.setAttribute("ordenacaoErrado", rel_ORDENACAO_SIMPLES.getErrada());
				request.setAttribute("ordenacaoPulo", rel_ORDENACAO_SIMPLES.getPulo());
				
			relatorio.estatisticaIndividual(1, TipoQuestao_Enum.FUNCOES);
			rel_FUNCOES.setCerta(relatorio.getQtdRespostaCorreta()+"");
			rel_FUNCOES.setErrada(relatorio.getQtdRespostaErrada()+"");
			rel_FUNCOES.setPulo(relatorio.getQtdRespostaPulou()+"");
			
				request.setAttribute("funcoesCerto", rel_FUNCOES.getCerta());
				request.setAttribute("funcoesErrado", rel_FUNCOES.getErrada());
				request.setAttribute("funcoesPulo", rel_FUNCOES.getPulo());
				
		
			// RESUMO DAS FASES
			rel.setCerta(rel_f1.getCerta()+rel_f2.getCerta()+rel_f3.getCerta());
			rel.setErrada(rel_f1.getErrada()+rel_f2.getErrada()+rel_f3.getErrada());
			rel.setPulo(rel_f1.getPulo()+rel_f2.getPulo()+rel_f3.getPulo());
			
				request.setAttribute("faseCerto", rel.getCerta());
				request.setAttribute("faseErro", rel.getErrada());
				request.setAttribute("fasePulo", rel.getPulo());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return modelAndView;
	}

}
