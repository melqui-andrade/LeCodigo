package com.br.uepb.dump;


import java.util.ArrayList;
import java.util.List;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

import conexaoBD.HibernateUtil;

import com.br.uepb.domain.Bloco;

public class PopularTabelaQuestoes3 {

	public static void main(String[] args){
		//Questão 21
		List<Bloco> blocos021 = new ArrayList<>();

		blocos021.add(new Bloco("1- while(x<21){"));
		blocos021.add(new Bloco("2- print(“Ao infinito e além :P”);"));
		blocos021.add(new Bloco("3- int x = 6;"));
		blocos021.add(new Bloco("4- x+=1;}"));
		blocos021.add(new Bloco("5- while(x==21){"));
		blocos021.add(new Bloco("6- x-=1;}"));

		addQuestao("Organize o código para exibir a mensagem “Ao infinito e além :P” várias vezes.",
				"3-1-2-4", 2, TipoQuestao_Enum.WHILE, blocos021);

		//Questao 22

		List<Bloco> blocos022 = new ArrayList<>();

		blocos022.add(new Bloco("1- }"));
		blocos022.add(new Bloco("2- print(“2- while(x < 10){"));
		blocos022.add(new Bloco("3- while(x < 5){"));
		blocos022.add(new Bloco("4- while(x > 10){"));
		blocos022.add(new Bloco("5- while(x <= 11){"));
		blocos022.add(new Bloco("6- while(x <= 5){"));
		blocos022.add(new Bloco("7- print(\"Hello Word!\");"));
		blocos022.add(new Bloco("8- x = x + 2;"));
		blocos022.add(new Bloco("9- int x = 1; "));

		addQuestao("Organize o algoritmo para que a palavra \"Hello Word!\" seja escrita 5 vezes",
				"9-2-7-8-1 | 9-2-8-7-1", 2, TipoQuestao_Enum.WHILE, blocos022);

		//Questao 23

		List<Bloco> blocos023 = new ArrayList<>();

		blocos023.add(new Bloco("1 - for"));
		blocos023.add(new Bloco("2 - while"));
		blocos023.add(new Bloco("3 - if"));
		blocos023.add(new Bloco("4 - falso"));
		blocos023.add(new Bloco("5 - verdadeira"));
		blocos023.add(new Bloco("6 - switch"));
		blocos023.add(new Bloco("7 - (i)"));
		blocos023.add(new Bloco("8 - (ii)"));

		addQuestao("A instrução ____ executa uma instrução ou bloco de instrução enquanto "
				+ "uma determinada condição for ______. O seu funcionamento se resume aos "
				+ "seguintes passos. (i) A condição é avaliada; (ii) Se o resultado da "
				+ "avaliação for Falso, o laço termina e o programa continua na instrução"
				+ " imediatamente após o _____. (iii) Se o resultado for verdadeiro, é "
				+ "executada a instrução associada ao _____. (iv) Volta-se ao ponto ___.",
				"2-5-2-2-7", 2, TipoQuestao_Enum.WHILE, blocos023);

		//Questao 24

		List<Bloco> blocos024 = new ArrayList<>();

		blocos024.add(new Bloco("1 - while (true) {"));
		blocos024.add(new Bloco("2 - }"));
		blocos024.add(new Bloco("3 - while (numero != 0) {"));
		blocos024.add(new Bloco("4 - print (\"Informe um número:\");"));
		blocos024.add(new Bloco("5 - if (numero != 0) {"));
		blocos024.add(new Bloco("6 - int numero = 0;"));
		blocos024.add(new Bloco("7 - print(\"O numero é: \"+numero);"));
		blocos024.add(new Bloco("8- x = x + 2;"));
		blocos024.add(new Bloco("9- int x = 1; "));

		addQuestao("Organize o código abaixo para receber vários números e imprimir logo em "
				+ "seguida, enquanto o número 0 não for informado. Se o número 0 for "
				+ "informado, ele não será impresso e o programa termina.",
				"6-10-9-3-7-10-9-2 | 10-6-9-3-7-10-9-2", 2, TipoQuestao_Enum.WHILE, blocos024);

		//Questao 25

		List<Bloco> blocos025 = new ArrayList<>();

		blocos025.add(new Bloco("1 - while (count <= 10) {"));
		blocos025.add(new Bloco("2 - maior = num;"));
		blocos025.add(new Bloco("3 - print(\"O maior numero digitado é: \" + maior);"));
		blocos025.add(new Bloco("4 - input(num);"));
		blocos025.add(new Bloco("5 - int count = 2;"));
		blocos025.add(new Bloco("6 - maior = num;}"));
		blocos025.add(new Bloco("7 - if (num > maior) {"));
		blocos025.add(new Bloco("8 - float maior, num;"));
		blocos025.add(new Bloco("9 - count++;}"));

		addQuestao("Imprima o maior número dentre os 10 números digitados pelo usuário.",
				"8-5-4-2-1-4-7-6-9-3 | 5-8-4-2-1-4-7-6-9-3", 2, TipoQuestao_Enum.WHILE, blocos025);

		//Questao 26

		List<Bloco> blocos026 = new ArrayList<>();

		blocos026.add(new Bloco("1-int x = 0;"));
		blocos026.add(new Bloco("2-do{"));
		blocos026.add(new Bloco("3-if(x%2 != 0){"));
		blocos026.add(new Bloco("4-print(x+\"\\n\");}"));
		blocos026.add(new Bloco("5-x++;"));
		blocos026.add(new Bloco("6-}while(x<=10);"));
		blocos026.add(new Bloco("7-if(x%2 == 0){"));
		blocos026.add(new Bloco("8- }while(x=10);"));
		
		addQuestao("Arranje as linhas de um loop finito para que seja impresso o valor da"
				+ " variável x apenas quando for ímpar.",
				"1-2-3-4-5-6 | 1-2-5-3-4-6", 2, TipoQuestao_Enum.DO_WHILE, blocos026);

		//Questao 27

		List<Bloco> blocos027 = new ArrayList<>();

		blocos027.add(new Bloco("1 - while"));
		blocos027.add(new Bloco("2 - for"));
		blocos027.add(new Bloco("3 - while e for"));
		blocos027.add(new Bloco("4 - if"));
		blocos027.add(new Bloco("5 - do ... while "));
		blocos027.add(new Bloco("6 - switch"));

		addQuestao("A instução ______ difere dos outros laço porque o teste da condição é "
				+ "realizado no fim do corpo do laço e não antes, como acontecia com os "
				+ "laços _____ e _____. Desta forma o corpo do laço _____ é executado pelo"
				+ " menos uma vez, enquanto nos laços _____ o corpo do laço pode nunca ser"
				+ " executado.",
				"5-1-2-5-3 | 5-2-1-5-3", 2, TipoQuestao_Enum.DO_WHILE, blocos027);

		//Questao 28

		List<Bloco> blocos028 = new ArrayList<>();

		blocos028.add(new Bloco("1- int x = 50;"));
		blocos028.add(new Bloco("2- int y = 8;"));
		blocos028.add(new Bloco("3- x--;"));
		blocos028.add(new Bloco("4- y++;"));
		blocos028.add(new Bloco("5- }while(y <10);"));
		blocos028.add(new Bloco("6- }while( x > 48);"));
		blocos028.add(new Bloco("7- print(\"GO HORSE!\");"));
		blocos028.add(new Bloco("8- do{"));

		addQuestao("Organize o algoritmo para que a palavra \"GO HORSE!\" seja escrita 4 vezes",
				"1-8-2-8-7-4-5-3-6 | 2-8-1-8-7-3-6-4-5 | 1-8-2-8-4-7-5-3-6 | 2-8-1-8-3-7-6-4-5",
				2, TipoQuestao_Enum.DO_WHILE, blocos028);
		
		HibernateUtil.shutdown();


	}

	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO dao = new QuestaoDAO();

		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);

		dao.adicionarQuestao(questao);
		return true;
	}
}
