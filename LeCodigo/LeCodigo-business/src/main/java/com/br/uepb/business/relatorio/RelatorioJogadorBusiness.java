package com.br.uepb.business.relatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.br.uepb.business.QuestaoBusiness;
import com.br.uepb.dao.JogadorDAO;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.RespostaDoAluno;

public class RelatorioJogadorBusiness {

	private String login;
	private Questao questao;
	private Jogador jogador;

	private int qtdRespostaCorreta;
	private int qtdRespostaErrada;
	private int qtdRespostaPulou;
	private int qtdPartidas;
	QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
	JogadorDAO jogadorDAO = JogadorDAO.getInstance();

	public RelatorioJogadorBusiness() {
		// TODO Auto-generated constructor stub
	}
	
	public RelatorioJogadorBusiness(String login) {
		this.login = login;
		this.jogador = jogadorDAO.buscarJogador(login);
	}

	private void getQtdPartidas() {
		this.qtdPartidas = jogador.getPartidas().size();
	}

	private void qtdRespostasCorretasErradasPulou() {
		for (Partida partida : jogador.getPartidas()) {
			for (RespostaDoAluno respostaDoAluno : partida.getRespostas_aluno()) {
				String possiveisRespostas[] = questaoDAO.buscarQuestao(respostaDoAluno.getId_questao()).getResposta()
						.split(" | ");
				String respostas[] = respostaDoAluno.getRespostas().split(" | ");
				for (int i = 0; i < respostas.length; i++) {
					if (respostas[i].trim().equals("pulou")) {
						qtdRespostaPulou++;
					} else if (i < respostas.length - 1) {// Se o jogador
															// resposdeu
															// corretamente,
															// então será a
															// ultima resposta
															// que ele deu
						qtdRespostaErrada++;
					}
				}
				boolean ultimaRespostaCorreta = false; // Indica se a ultima
														// resposta do jogador
														// para uma questão foi
														// correta
				for (int i = 0; i < possiveisRespostas.length; i++) {
					if (respostas[respostas.length - 1].trim().equals(possiveisRespostas[i])) {
						ultimaRespostaCorreta = true;
						break;
					}
				}
				if (ultimaRespostaCorreta) {
					qtdRespostaCorreta++;
				} else {
					qtdRespostaErrada++;
				}
			}
		}
	}

	/**
	 * 
	 * @param idQuestao
	 *            refere-se a questão cujas respostas foram dadas
	 * @param resposta
	 *            recebe algo do tipo 1-2-3-4-5
	 * @return um lista contendo a descrição de cada bloco
	 */
	public List<String> getBlocos(int idQuestao, String resposta) {
		if (resposta.equals("pulou")) {
			return null;
		}
		int cont = 0;
		questao = questaoDAO.buscarQuestao(idQuestao);
		List<String> blocos = new ArrayList<>();
		for (int i = 0; i < resposta.length(); i += 2) {
			blocos.add(getBloco(questao, resposta.charAt(i) + ""));
		}

		return blocos;
	}

	private String getBloco(Questao questao, String idBloco) {

		for (Bloco bloco : questao.getBlocos()) {
			if (bloco.getId() == Integer.parseInt(idBloco)) {
				return bloco.getDescricao();
			}
		}
		return null;
	}

	/**
	 * Seta os valores da quantidade de respostas certas, erradas e as que foram
	 * puladas da fase correspondente.
	 * 
	 * @param fase
	 * @throws NumberFormatException
	 * @throws Exception
	 */
	public void estatisticaFase(int fase) throws NumberFormatException, Exception {
		List<String> lista = QuestaoDAO.getInstance().view(fase, "fase");

		qtdRespostaCorreta = 0;
		qtdRespostaErrada = 0;
		qtdRespostaPulou = 0;

		for (String string : lista) {
			StringTokenizer toke = new StringTokenizer(string, "@");			 		
				
			String respostaDoAluno = toke.nextToken(); // Resposta do Aluno			
			if (respostaDoAluno.contains("pulou")) qtdRespostaPulou++;
			toke.nextToken(); // id_questao
			toke.nextToken(); // id
			toke.nextToken(); // fase
			String gabarito = toke.nextToken(); // Resposta
			toke.nextToken(); // tipo_questao

			StringTokenizer respostaToke = new StringTokenizer(respostaDoAluno, "|");
			System.out.println("Gabarito: " + respostaToke.countTokens());
		
			while (respostaToke.hasMoreTokens()) {
				String res = respostaToke.nextElement().toString();				
				System.out.print(gabarito+"\t\t"+res.trim());
				if (gabarito.trim().contains(res.trim())) {
					qtdRespostaCorreta++; System.out.println(" OK");					
				} else {
					qtdRespostaErrada++; System.out.println(" X");
				}
				
			}
		}
		qtdRespostaErrada-=qtdRespostaPulou;
	}

	public void estatisticaTipoQuestao(int arg) throws NumberFormatException, Exception {
		List<String> lista = QuestaoDAO.getInstance().view(arg, "tipo_questao");

		qtdRespostaCorreta = 0;
		qtdRespostaErrada = 0;
		qtdRespostaPulou = 0;

		for (String string : lista) {
			StringTokenizer toke = new StringTokenizer(string, "@");			 		
				
			String respostaDoAluno = toke.nextToken(); // Resposta do Aluno			
			if (respostaDoAluno.contains("pulou")) qtdRespostaPulou++;
			toke.nextToken(); // id_questao
			toke.nextToken(); // id
			toke.nextToken(); // fase
			String gabarito = toke.nextToken(); // Resposta
			toke.nextToken(); // tipo_questao

			StringTokenizer respostaToke = new StringTokenizer(respostaDoAluno, "|");
			System.out.println("Gabarito: " + respostaToke.countTokens());
		
			while (respostaToke.hasMoreTokens()) {
				String res = respostaToke.nextElement().toString();				
				System.out.print(gabarito+"\t\t"+res.trim());
				if (gabarito.trim().contains(res.trim())) {
					qtdRespostaCorreta++; System.out.println(" OK");					
				} else {
					qtdRespostaErrada++; System.out.println(" X");
				}
				
			}
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public int getQtdRespostaCorreta() {
		return qtdRespostaCorreta;
	}

	public void setQtdRespostaCorreta(int qtdRespostaCorreta) {
		this.qtdRespostaCorreta = qtdRespostaCorreta;
	}

	public int getQtdRespostaErrada() {
		return qtdRespostaErrada;
	}

	public void setQtdRespostaErrada(int qtdRespostaErrada) {
		this.qtdRespostaErrada = qtdRespostaErrada;
	}

	public int getQtdRespostaPulou() {
		return qtdRespostaPulou;
	}

	public void setQtdRespostaPulou(int qtdRespostaPulou) {
		this.qtdRespostaPulou = qtdRespostaPulou;
	}

	public QuestaoDAO getQuestaoDAO() {
		return questaoDAO;
	}

	public void setQuestaoDAO(QuestaoDAO questaoDAO) {
		this.questaoDAO = questaoDAO;
	}

	public JogadorDAO getJogadorDAO() {
		return jogadorDAO;
	}

	public void setJogadorDAO(JogadorDAO jogadorDAO) {
		this.jogadorDAO = jogadorDAO;
	}

	public void setQtdPartidas(int qtdPartidas) {
		this.qtdPartidas = qtdPartidas;
	}
}
