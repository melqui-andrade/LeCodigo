package com.br.uepb.controller;

import java.util.List; 

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.relatorio.RelatorioJogadorBusiness;
import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.TipoQuestao_Enum;
import com.br.uepb.model.RelatorioModel;

@Controller
public class RelatorioAlunoController {

	
	@RequestMapping(value = "/relatorio/relatorioAluno.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {
		String login = request.getSession().getAttribute("login").toString();
		RelatorioJogadorBusiness relatorio = new RelatorioJogadorBusiness(request.getParameter(login));
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
		
		
		// FASE 1
		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.IF_ELSE);
			rel_IF_ELSE.setCerta(relatorio.getQtdRespostaCorreta());
			rel_IF_ELSE.setErrada(relatorio.getQtdRespostaErrada());
			rel_IF_ELSE.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("ifElse_certo", rel_IF_ELSE.getCerta());
			request.setAttribute("ifElse_errado", rel_IF_ELSE.getErrada());
			request.setAttribute("ifElse_pulo", rel_IF_ELSE.getPulo());
			
		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.ATRIBUICAO);
			rel_TiposVariaveis.setCerta(relatorio.getQtdRespostaCorreta());
			rel_TiposVariaveis.setErrada(relatorio.getQtdRespostaErrada());
			rel_TiposVariaveis.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("atribuicao_certo", rel_TiposVariaveis.getCerta());
			request.setAttribute("atribuicao_errado", rel_TiposVariaveis.getErrada());
			request.setAttribute("atribuicao_pulo", rel_TiposVariaveis.getPulo());
			
		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.SWITCH_CASE);
			rel_SWICTH_CASE.setCerta(relatorio.getQtdRespostaCorreta());
			rel_SWICTH_CASE.setErrada(relatorio.getQtdRespostaErrada());
			rel_SWICTH_CASE.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("switch_certo", rel_SWICTH_CASE.getCerta());
			request.setAttribute("switch_errado", rel_SWICTH_CASE.getErrada());
			request.setAttribute("switch_pulo", rel_SWICTH_CASE.getPulo());
			
		// Resumo da FASE 1
		rel_f1.setCerta(rel_IF_ELSE.getCerta()+rel_TiposVariaveis.getCerta()+rel_SWICTH_CASE.getCerta());
		rel_f1.setErrada(rel_IF_ELSE.getErrada()+rel_TiposVariaveis.getErrada()+rel_SWICTH_CASE.getErrada());
		rel_f1.setPulo(rel_IF_ELSE.getPulo()+rel_TiposVariaveis.getPulo()+rel_SWICTH_CASE.getPulo());
		request.setAttribute("certo_fase1", rel_f1.getCerta());
		request.setAttribute("errado_fase1", rel_f1.getErrada());
		request.setAttribute("pulo_fase1", rel_f1.getPulo());
			
		// FASE 2
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.DO_WHILE);
			rel_DO_WHILE.setCerta(relatorio.getQtdRespostaCorreta());
			rel_DO_WHILE.setErrada(relatorio.getQtdRespostaErrada());
			rel_DO_WHILE.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("doWhile_certo", rel_DO_WHILE.getCerta());
			request.setAttribute("doWhile_errado", rel_DO_WHILE.getErrada());
			request.setAttribute("doWhile_pulo", rel_DO_WHILE.getPulo());
			
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.WHILE);
			rel_WHILE.setCerta(relatorio.getQtdRespostaCorreta());
			rel_WHILE.setErrada(relatorio.getQtdRespostaErrada());
			rel_WHILE.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("while_certo", rel_WHILE.getCerta());
			request.setAttribute("while_errado", rel_WHILE.getErrada());
			request.setAttribute("while_pulo", rel_WHILE.getPulo());
			
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.FOR);
			rel_FOR.setCerta(relatorio.getQtdRespostaCorreta());
			rel_FOR.setErrada(relatorio.getQtdRespostaErrada());
			rel_FOR.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("for_certo", rel_FOR.getCerta());
			request.setAttribute("for_errado", rel_FOR.getErrada());
			request.setAttribute("for_pulo", rel_FOR.getPulo());
			
		// Resumo da FASE 2
		rel_f2.setCerta(rel_DO_WHILE.getCerta()+rel_WHILE.getCerta()+rel_FOR.getCerta());
		rel_f2.setErrada(rel_DO_WHILE.getErrada()+rel_WHILE.getErrada()+rel_FOR.getErrada());
		rel_f2.setPulo(rel_DO_WHILE.getPulo()+rel_WHILE.getPulo()+rel_FOR.getPulo());
		request.setAttribute("certo_fase2", rel_f2.getCerta());
		request.setAttribute("errado_fase2", rel_f2.getErrada());
		request.setAttribute("pulo_fase2", rel_f2.getPulo());
		
		// FASE 3
		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.ATRIBUICAO);
			rel_TROCA_DE_VARIAVEIS.setCerta(relatorio.getQtdRespostaCorreta());
			rel_TROCA_DE_VARIAVEIS.setErrada(relatorio.getQtdRespostaErrada());
			rel_TROCA_DE_VARIAVEIS.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("atribuicao_certo", rel_TROCA_DE_VARIAVEIS.getCerta());
			request.setAttribute("atribuicao_errado", rel_TROCA_DE_VARIAVEIS.getErrada());
			request.setAttribute("atribuicao_pulo", rel_TROCA_DE_VARIAVEIS.getPulo());
			
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.ORDENACAO_SIMPLES);
			rel_ORDENACAO_SIMPLES.setCerta(relatorio.getQtdRespostaCorreta());
			rel_ORDENACAO_SIMPLES.setErrada(relatorio.getQtdRespostaErrada());
			rel_ORDENACAO_SIMPLES.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("ordenacao_certo", rel_ORDENACAO_SIMPLES.getCerta());
			request.setAttribute("ordenacao_errado", rel_ORDENACAO_SIMPLES.getErrada());
			request.setAttribute("ordenacao_pulo", rel_ORDENACAO_SIMPLES.getPulo());
			
		relatorio.estatisticaIndividual(3, TipoQuestao_Enum.FUNCOES);
			rel_FUNCOES.setCerta(relatorio.getQtdRespostaCorreta());
			rel_FUNCOES.setErrada(relatorio.getQtdRespostaErrada());
			rel_FUNCOES.setPulo(relatorio.getQtdRespostaPulou());
			request.setAttribute("funcoes_certo", rel_FUNCOES.getCerta());
			request.setAttribute("funcoes_errado", rel_FUNCOES.getErrada());
			request.setAttribute("funcoes_pulo", rel_FUNCOES.getPulo());
			
		// Resumo da FASE 3
		rel_f3.setCerta(rel_TROCA_DE_VARIAVEIS.getCerta()+rel_ORDENACAO_SIMPLES.getCerta()+rel_FUNCOES.getCerta());
		rel_f3.setErrada(rel_TROCA_DE_VARIAVEIS.getErrada()+rel_ORDENACAO_SIMPLES.getErrada()+rel_FUNCOES.getErrada());
		rel_f3.setPulo(rel_TROCA_DE_VARIAVEIS.getPulo()+rel_ORDENACAO_SIMPLES.getPulo()+rel_FUNCOES.getPulo());
		request.setAttribute("certo_fase3", rel_f3.getCerta());
		request.setAttribute("errado_fase3", rel_f3.getErrada());
		request.setAttribute("pulo_fase3", rel_f3.getPulo());
			
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jogador", new Jogador());
		modelAndView.addObject("modelViewJogador");
		List<Jogador> lstJogador = JogadorDAO.getInstance().rankingJogadores();
		request.setAttribute("lstJogador", lstJogador);
		return modelAndView;
	}
	
	// TODO: FAZER O POST. Pegar o idUsuario e listar as questoes que ele fez e identificar se ele errou, acertou ou pulou.

}
