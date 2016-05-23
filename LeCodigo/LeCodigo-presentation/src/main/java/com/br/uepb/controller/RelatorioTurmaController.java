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
		
		RelatorioJogadorBusiness relatorio = new RelatorioJogadorBusiness();
		try {
			relatorio.estatisticaFase(1);
			int questoesCertasF1 = relatorio.getQtdRespostaCorreta();
			int questoesErradasF1 = relatorio.getQtdRespostaErrada();
			int questoesPulouF1 = relatorio.getQtdRespostaPulou();
		
			request.setAttribute("questoesCertasF1", questoesCertasF1);
			request.setAttribute("questoesErradasF1", questoesErradasF1);
			request.setAttribute("questoesPulouF1", questoesPulouF1);
			
			relatorio.estatisticaFase(2);
			
			int questoesCertasF2 = relatorio.getQtdRespostaCorreta();
			int questoesErradasF2 = relatorio.getQtdRespostaErrada();
			int questoesPulouF2 = relatorio.getQtdRespostaPulou();
			
			request.setAttribute("questoesCertasF2", questoesCertasF2);
			request.setAttribute("questoesErradasF2", questoesErradasF2);
			request.setAttribute("questoesPulouF2", questoesPulouF2);		
			
			relatorio.estatisticaFase(3);
			
			int questoesCertasF3 = relatorio.getQtdRespostaCorreta();
			int questoesErradasF3 = relatorio.getQtdRespostaErrada();
			int questoesPulouF3 = relatorio.getQtdRespostaPulou();
			
			request.setAttribute("questoesCertasF3", questoesCertasF3);
			request.setAttribute("questoesErradasF3", questoesErradasF3);
			request.setAttribute("questoesPulouF3", questoesPulouF3);
			
			
			float porcentagemAcerto = (questoesCertasF1+questoesCertasF2+questoesCertasF3);
			float porcentagemErros = (questoesErradasF1+questoesErradasF2+questoesErradasF3);
			float porcentagemPulos = (questoesPulouF1+questoesPulouF2+questoesPulouF3);
			
			float soma = porcentagemAcerto + porcentagemErros + porcentagemPulos;
			
			
			porcentagemAcerto = (porcentagemAcerto*100)/soma;
			porcentagemErros = (porcentagemErros*100)/soma;
			porcentagemPulos = (porcentagemPulos*100)/soma;
			
			request.setAttribute("soma", soma);
			request.setAttribute("certo", porcentagemAcerto);
			request.setAttribute("erro", porcentagemErros);
			request.setAttribute("pulo", porcentagemPulos);
			request.setAttribute("lstQuestao", lstQuestao);	
			
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
