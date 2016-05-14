package com.br.uepb.dump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

import conexaoBD.HibernateUtil;

public class PopularQuestoesApartirDeTXT {

	
	
	public PopularQuestoesApartirDeTXT() throws IOException {

		String caminhoArquivo = "src/main/java/arquivos"; 
		File file = new File(caminhoArquivo);
		File arquivos[] = file.listFiles();
		for (int i = 0; i < arquivos.length; i++) {
			FileReader arq = new FileReader(arquivos[i]);
			System.out.println((i+1)+" de "+arquivos.length+" - Arquivo: "+ arquivos[i].getName());
			ler(arq);
		}
		System.out.println("Todos os arquivos foram lidos");

		HibernateUtil.shutdown();
	}
	
	private void ler(FileReader arquivo) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(arquivo);
		
		String linha = bufferedReader.readLine();
		String fase = "", tipo = "", descricao = "", resposta = "";
		List<Bloco> blocos = new ArrayList<>();
		
		while (linha!=null) {
			if(!linha.isEmpty() && linha.charAt(0)=='*'){
				switch (linha.charAt(1)) {
				case 'I':
					linha = bufferedReader.readLine();
					while(!linha.equals("*F")){
						if(!linha.isEmpty() && linha.charAt(0)!= '#'){
							String[] info = linha.split("_");
							fase = info[0];
							tipo = info[1];
						}
						linha = bufferedReader.readLine();
					}
					break;
				case 'Q':
					linha = bufferedReader.readLine();
					while(!linha.equals("*F")){
						if(!linha.isEmpty() && linha.charAt(0)!= '#'){
							descricao+=linha;
						}
						linha = bufferedReader.readLine();
					}
					break;
				case 'B':
					linha = bufferedReader.readLine();
					while(!linha.equals("*F")){
						if(!linha.isEmpty() && linha.charAt(0)!= '#'){
							String[] info = linha.split("_");
							blocos.add(new Bloco( Integer.parseInt(info[0]) , info[1]));
						}
						linha = bufferedReader.readLine();
					}
					break;
				case 'R':
					linha = bufferedReader.readLine();
					while(!linha.equals("*F")){
						if(!linha.isEmpty() && linha.charAt(0)!= '#'){
							resposta = linha;
						}
						linha = bufferedReader.readLine();
					}
					break;

				default:
					break;
				}
			}
			linha = bufferedReader.readLine();
			
		}
		Questao questao = new Questao(descricao, resposta, Integer.parseInt(fase),
				TipoQuestao_Enum.values()[Integer.parseInt(tipo) - 1], blocos);
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		questaoDAO.adicionarQuestao(questao);
	}
	public static void main(String[] args) throws IOException {
		new PopularQuestoesApartirDeTXT();
	}
}
