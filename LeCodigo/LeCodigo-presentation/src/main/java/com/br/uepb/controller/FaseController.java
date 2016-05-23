package com.br.uepb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.br.uepb.business.GerenciarSessaoBusiness;
import com.br.uepb.business.PartidaBusiness;
import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.business.SessaoBusiness;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;
import com.br.uepb.model.FaseModel;

@Controller
public class FaseController {

	private QuestaoBusiness questaoBusiness = new QuestaoBusiness();
	private PartidaBusiness partidaBusiness = new PartidaBusiness();

	private List<Questao> listaQuestoesFase1 = new ArrayList<Questao>();
	private List<Questao> listaQuestoesFase2 = new ArrayList<Questao>();
	private List<Questao> listaQuestoesFase3 = new ArrayList<Questao>();

	private FaseModel faseModel;
	private boolean passouFase = false;
	private int idJogador;
	private boolean ehNovaPartida = true;
	//int bits;
	//int pontuacao;
	//int vidas;
	//int fase;
	//int etapa;
	SessaoBusiness sessaoBusiness;
	
	@RequestMapping(value = "/fase/fase.html", method = RequestMethod.GET)
	public ModelAndView faseGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		
		if(passouFase){
			passouFase = false;
            return new ModelAndView("redirect:/fase/transicaoFase.html");
		}
		String login = request.getSession().getAttribute("login").toString();
		sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		int bits = sessaoBusiness.getBits();
		int pontuacao = sessaoBusiness.getPontuacao();
		int vidas = sessaoBusiness.getVidas();
		int fase = sessaoBusiness.getFase();
		int etapa = sessaoBusiness.getEtapa();

		/*if(ehNovaPartida){
			popularQuestoesNovas(login);
		}else{
			popularQuestoesDaSessao(login);
		}*/

		faseModel = new FaseModel(fase);

		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("bits", bits);
		modelAndView.addObject("pontuacao", pontuacao);
		modelAndView.addObject("vidas", vidas);
		modelAndView.addObject("fase", faseModel);
		modelAndView.addObject("etapa", etapa);

		return modelAndView;
	}

	private void popularQuestoesDaSessao(String login) {
		int fase = sessaoBusiness.getFase();
		int etapa = sessaoBusiness.getEtapa();
		List<Questao> questoes = GerenciarSessaoBusiness.getSessaoBusiness(login).getQuestoesQueSairam();
		if (fase == 1 && listaQuestoesFase1.isEmpty()) {
			int cont = 0;
			for (int i = questoes.size()-1; i >= 0; i--) {
				if(questoes.get(i).getFase()==1 && cont<etapa){
					listaQuestoesFase1.add(questoes.get(i));
					cont++;
				}
			}
//			for (int i = 5; i > etapa; i--) {
//				listaQuestoesFase1.add(questaoBusiness.buscarQuestao(login, fase, i));
//			}
		} else if (fase == 2 && listaQuestoesFase2.isEmpty()) {
			int cont = 0;
			for (int i = questoes.size()-1; i >= 0; i--) {
				if(questoes.get(i).getFase()==2 && cont<etapa){
					listaQuestoesFase2.add(questoes.get(i));
					cont++;
				}
			}
//			for (int i = 5; i > etapa; i--) {
//				listaQuestoesFase2.add(questaoBusiness.buscarQuestao(login, fase, i));
//			}
		} else if (fase == 3 && listaQuestoesFase3.isEmpty()) {
			int cont = 0;
			for (int i = questoes.size()-1; i >= 0; i--) {
				if(questoes.get(i).getFase()==3 && cont<etapa){
					listaQuestoesFase3.add(questoes.get(i));
					cont++;
				}
			}
//			for (int i = 5; i > etapa; i--) {
//				listaQuestoesFase3.add(questaoBusiness.buscarQuestao(login, fase, i));
//			}
		}
	}

	private void popularQuestoesNovas(String login) {
		int fase = sessaoBusiness.getFase();
		if (fase == 1) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase1.add(questaoBusiness.buscarQuestao(login, fase, i));
			}
		} else if (fase == 2) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase2.add(questaoBusiness.buscarQuestao(login, fase, i));
			}
		} else if (fase == 3) {
			for (int i = 1; i <= 5; i++) {
				listaQuestoesFase3.add(questaoBusiness.buscarQuestao(login, fase, i));
			}
		}
	}

	// id é etapa
	@RequestMapping(value = "/fase/questao.html", method = RequestMethod.GET)
	public ModelAndView questaoGet(HttpServletRequest request,
			@RequestParam(value = "resposta", required = false) String resposta) {

		ModelAndView modelAndView = new ModelAndView();
		
		String login = request.getSession().getAttribute("login").toString();
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		int fase = sessaoBusiness.getFase();
		int etapa = sessaoBusiness.getEtapa();
		
		Questao questao = sessaoBusiness.ultimaQuestao();

		resposta = (String) request.getParameter("resposta");
		if (resposta != null) {
			boolean status_resposta = false;
			
			try {
				if(resposta.equals("pulou")){
					questao = questaoBusiness.pularQuestao(login, questao.getId(), fase, etapa);
					if (fase == 1) {
						listaQuestoesFase1.add(etapa - 1,  questao);
					} else if (fase == 2) {
						listaQuestoesFase2.add(etapa - 1,  questao);
					} else if (fase == 3) {
						listaQuestoesFase3.add(etapa - 1,  questao);
					}
				}else{
					status_resposta = questaoBusiness.verificarResposta(login, resposta, questao.getId());
					if(status_resposta){
						//partidaBusiness.avancarEtapa(login);
						if(sessaoBusiness.getFase() > fase){
							passouFase = true;
						}
					}else if(sessaoBusiness.getVidas() <= 0){
						ModelAndView mav = new ModelAndView("redirect:/fase/perdeu.html");
						mav.addObject("fase",faseModel);
						return mav;
					}
					modelAndView.addObject("status_resposta", status_resposta);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

		}else{
			questao = getQuestao(fase, etapa);
		}
			
			int bits = sessaoBusiness.getBits();
			int pontuacao = sessaoBusiness.getPontuacao();
			int vidas = sessaoBusiness.getVidas();			

			modelAndView.addObject("questao", questao);
			modelAndView.addObject("idFase", fase);
			modelAndView.addObject("bits", bits);
			modelAndView.addObject("pontuacao", pontuacao);
			modelAndView.addObject("vidas", vidas);
			modelAndView.addObject("questao", questao);
			modelAndView.addObject("fase", faseModel);
			modelAndView.addObject("etapa", etapa);
			return modelAndView;
		
		//return modelAndView;
	}

	private Questao getQuestao(int fase, int etapa) {
		String login = sessaoBusiness.getJogador().getLogin();
		List<Questao> questoes = GerenciarSessaoBusiness.getSessaoBusiness(login).getQuestoesQueSairam();
		Questao questao = null;
		if(questoes.size()>0){
			questao = questoes.get(questoes.size()-1);
			try {
				//Se ocorrer erro é porque ele ainda não respndeu, então será retornado a questão anterior
				if(jaRespondeu(questao)){
					questao = questaoBusiness.buscarQuestao(login, fase, etapa);
				}
			} catch (Exception e) {}
			
		}
		else{
			questao = questaoBusiness.buscarQuestao(login, fase, etapa);
		}
		
		/*if (fase == 1) {
			if(listaQuestoesFase1.size() < etapa){
				listaQuestoesFase1.add(questaoBusiness.buscarQuestao(login, fase, etapa));
			}
			if(ehNovaPartida){
				questao = listaQuestoesFase1.get(etapa - 1);
			}else{
				int a = Math.abs(listaQuestoesFase1.size() - etapa);
				questao = listaQuestoesFase1.get(listaQuestoesFase1.size() - a -1);
			}
				
		} else if (fase == 2) {
			if(listaQuestoesFase2.size() < etapa){
				listaQuestoesFase2.add(questaoBusiness.buscarQuestao(login, fase, etapa));
			}
			questao = listaQuestoesFase2.get(etapa - 1);
		} else if (fase == 3) {
			if(listaQuestoesFase3.size() < etapa){
				listaQuestoesFase3.add(questaoBusiness.buscarQuestao(login, fase, etapa));
			}
			questao = listaQuestoesFase3.get(etapa - 1);
		}*/
		return questao;
	}

	private boolean jaRespondeu(Questao questao) {
		int index = sessaoBusiness.getPartida().getRespostas_aluno().size();
		RespostaDoAluno resposta = sessaoBusiness.getPartida().getRespostas_aluno().get(index - 1);
		
		if(resposta.getId_questao()==questao.getId()){
		
			String [] possiveisRespostasCorretas = questao.getResposta().split(" | ");
			String respostasDoAluno[] = resposta.getRespostas().split(" | ");
			String ultimaRespostaDoaluno = respostasDoAluno[respostasDoAluno.length-1];
			if(ultimaRespostaDoaluno.equals("pulou")){
				return true;
			}
			for (int i = 0; i < possiveisRespostasCorretas.length; i++) {
				if(ultimaRespostaDoaluno.equals(possiveisRespostasCorretas[i])){
					return true;
				}
			}
		}
		return false;
	}

	@RequestMapping(value = "/fase/transicaoFase.html", method = RequestMethod.GET)
	public ModelAndView transicaoGet(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		String login = request.getSession().getAttribute("login").toString();
		SessaoBusiness sessaoBusiness = GerenciarSessaoBusiness.getSessaoBusiness(login);
		idJogador = sessaoBusiness.getJogador().getId();
		
		if(partidaBusiness.ahPartidaPendente(idJogador)){
			//ehNovaPartida = false;
			partidaBusiness.continuarPartida(login, idJogador);
		}else{
			//ehNovaPartida = true;
			partidaBusiness.iniciarPartida(login, idJogador);
		}
		
		int fase = sessaoBusiness.getFase();
		faseModel = new FaseModel(fase);

		modelAndView.addObject("idFase", fase);
		modelAndView.addObject("fase", faseModel);

		return modelAndView;
	}

}
