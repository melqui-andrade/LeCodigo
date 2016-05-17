package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

@Controller
public class RelatorioTurmaController {

	@RequestMapping(value = "/relatorio/relatorioTurma.html", method = RequestMethod.GET)
	public ModelAndView homeGet(HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("questao", new Questao());
		List<Questao> lstQuestao = new ArrayList<Questao>(); 
		lstQuestao = QuestaoDAO.getInstance().listarQuestoes(1, TipoQuestao_Enum.ATRIBUICAO);
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(1, TipoQuestao_Enum.IF_ELSE));
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(1, TipoQuestao_Enum.SWITCH_CASE));
		
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(2, TipoQuestao_Enum.FOR));
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(2, TipoQuestao_Enum.WHILE));
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(2, TipoQuestao_Enum.DO_WHILE));
		
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(3, TipoQuestao_Enum.TROCA_VARIAVEIS));
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(3, TipoQuestao_Enum.ORDENACAO_SIMPLES));
		lstQuestao.addAll(QuestaoDAO.getInstance().listarQuestoes(3, TipoQuestao_Enum.FUNCOES));
		
		
		request.setAttribute("lstQuestao", lstQuestao);
		
		return modelAndView;
	}

}
