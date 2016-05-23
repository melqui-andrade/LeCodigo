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

@Controller
public class RelatorioAlunoController {

	
	@RequestMapping(value = "/relatorio/relatorioAluno.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {
		String login = request.getSession().getAttribute("login").toString();
		RelatorioJogadorBusiness relatorio = new RelatorioJogadorBusiness(request.getParameter(login));
		
		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.IF_ELSE);
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.ATRIBUICAO);
		relatorio.estatisticaIndividual(3, TipoQuestao_Enum.SWITCH_CASE);

		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.DO_WHILE);
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.WHILE);
		relatorio.estatisticaIndividual(3, TipoQuestao_Enum.FOR);

		relatorio.estatisticaIndividual(1, TipoQuestao_Enum.TROCA_VARIAVEIS);
		relatorio.estatisticaIndividual(2, TipoQuestao_Enum.ORDENACAO_SIMPLES);
		relatorio.estatisticaIndividual(3, TipoQuestao_Enum.FUNCOES);

		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("jogador", new Jogador());
		modelAndView.addObject("modelViewJogador");
		List<Jogador> lstJogador = JogadorDAO.getInstance().rankingJogadores();
		request.setAttribute("lstJogador", lstJogador);
		return modelAndView;
	}
	
	// TODO: FAZER O POST. Pegar o idUsuario e listar as questoes que ele fez e identificar se ele errou, acertou ou pulou.

}
