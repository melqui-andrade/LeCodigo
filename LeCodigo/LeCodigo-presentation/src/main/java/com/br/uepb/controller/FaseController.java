package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.domain.Questao;
import com.br.uepb.model.FaseModel;
import com.br.uepb.model.LoginModel;

@Controller
public class FaseController {

	private QuestaoBusiness questaoBusiness = new QuestaoBusiness();
	private List<Questao> listaQuestoesFase1 = new ArrayList<Questao>();
	private List<Questao> listaQuestoesFase2 = new ArrayList<Questao>();
	private List<Questao> listaQuestoesFase3 = new ArrayList<Questao>();
	
	FaseModel faseModel;
	
	@RequestMapping(value = "/fase/fase.html", method = RequestMethod.GET)
	public ModelAndView faseGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		int bits = SessaoBusiness.getInstace().getBits();
		int pontuacao = SessaoBusiness.getInstace().getPontuacao();
		int vidas = SessaoBusiness.getInstace().getVidas();
		int fase = SessaoBusiness.getInstace().getFase();
		int etapa = 1;//SessaoBusiness.getInstace().getEtapa();
		
		if(fase == 1 && listaQuestoesFase1.isEmpty()){
			for(int i=1; i<=5; i++){
				listaQuestoesFase1.add(questaoBusiness.buscarQuestao(fase, i));
			}
		} else if(fase == 2 && listaQuestoesFase2.isEmpty()){
			for(int i=1; i<=5; i++){
				listaQuestoesFase2.add(questaoBusiness.buscarQuestao(fase, i));
			}
		}else if(fase == 3 && listaQuestoesFase3.isEmpty()){
			for(int i=1; i<=5; i++){
				listaQuestoesFase3.add(questaoBusiness.buscarQuestao(fase, i));
			}
		}
		
		faseModel = new FaseModel(3);
		
		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", 2);
		modelAndView.addObject("fase", faseModel);
		modelAndView.addObject("etapa", 5);
		
		return modelAndView;
	}
	//id é etapa
	@RequestMapping(value = "/fase/questao.html", method = RequestMethod.GET)
	public ModelAndView questaoGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		
		int bits = SessaoBusiness.getInstace().getBits();
		int pontuacao = SessaoBusiness.getInstace().getPontuacao();
		int vidas = SessaoBusiness.getInstace().getVidas();
		int fase = SessaoBusiness.getInstace().getFase();
		int etapa = SessaoBusiness.getInstace().getEtapa();
		
		Questao questao = null;
		if(fase == 1){
			questao = listaQuestoesFase1.get(etapa-1);
		} else if(fase == 2){
			questao = listaQuestoesFase2.get(etapa-1);
		} else if(fase == 3){
			questao = listaQuestoesFase3.get(etapa-1);
		}
		
		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", 2);
		modelAndView.addObject("questao", questao);
		modelAndView.addObject("fase", faseModel);
		modelAndView.addObject("etapa", 4);
		
		return modelAndView;
	}
	
}
