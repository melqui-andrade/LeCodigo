
import java.util.ArrayList;
import java.util.List;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

import conexaoBD.HibernateUtil;

public class PopularTabelaQuestoes2 {

	public static void main(String[] args) {

		// Questão 011
		List<Bloco> blocos011 = new ArrayList<>();

		blocos011.add(new Bloco("1-String palavras [] = {“Seja bem-vindo”, “universo dos algoritmos”, “ao”, “ “};"));
		blocos011.add(new Bloco("2-int a = 3;"));
		blocos011.add(new Bloco("3-int b = a-1;"));
		blocos011.add(new Bloco("4-String frase = palavras[0] + palavras[a];"));
		blocos011.add(new Bloco("5-String frase = palavras[0] + palavras[b];"));
		blocos011.add(new Bloco("6-frase = frase + palavras[b] + palavras[1];"));
		blocos011.add(new Bloco("7-frase = frase + palavras[b] + palavras[a] + palavras[1];"));
		
		addQuestao(
				"Utilizando os blocos a seguir, atribua a frase “Seja bem-vindo ao universo dos algoritmos“ para a variável “frase“",
				"1-2-3-4-7 | 1-3-2-4-7 | 2-3-1-4-7 | 2-1-3-4-7 | 3-1-2-4-7 | 3-2-1-4-7"
				, 1
				, TipoQuestao_Enum.SWITCH_CASE
				, blocos011);

		// Questão 012
		List<Bloco> blocos012 = new ArrayList<>();

		blocos012.add(new Bloco("1 - int a"));
		blocos012.add(new Bloco("2 - double b"));
		blocos012.add(new Bloco("3 - boolean c"));
		blocos012.add(new Bloco("4 - = false;"));
		blocos012.add(new Bloco("5 - = 3,1415;"));
		blocos012.add(new Bloco("6 - = -1000000;"));

		addQuestao(
				"Para cada valor a seguir declare uma variável que melhor armazene os valores a seguir: a) false b) 3,1415 c) -1.000.000",
				"1-6-2-5-3-4 | 1-6-3-4-2-5 | 2-5-1-6-3-4 | 2-5-3-4-1-6 | 3-4-1-6-2-5 | 3-4-2-5-1-6",
				1, TipoQuestao_Enum.SWITCH_CASE, blocos012);

		// Questão 013
		List<Bloco> blocos013 = new ArrayList<>();

		blocos013.add(new Bloco("1 - print(idade + ' - ' + nome);"));
		blocos013.add(new Bloco("2 - String nome = 'Leandro';"));
		blocos013.add(new Bloco("3 - print((idade + 5) + ' - ' + sobrenome);"));
		blocos013.add(new Bloco("4 - int idade = 20;"));
		blocos013.add(new Bloco("5 - String sobrenome = 'Gomes';"));

		addQuestao(
				"Imprima a idade e o nome, logo em seguida imprima a idade após 5 anos junto com o sobrenome.",
				"4-2-5-1-3 | 5-4-2-1-3 | 2-4-5-1-3 | 2-5-4-1-3 | 4-5-2-1-3 | 5-2-4-1-3", 1, TipoQuestao_Enum.SWITCH_CASE, blocos013);

		// Questão 014
		List<Bloco> blocos014 = new ArrayList<>();

		blocos014.add(new Bloco("1 - print(“Informe a primeira nota);"));
		blocos014.add(new Bloco("2 - media = nota1 + nota2 / 2;"));
		blocos014.add(new Bloco("3 - print(“A media final é “+media);"));
		blocos014.add(new Bloco("4 - nota1 = print(“Informe a primeira nota);"));
		blocos014.add(new Bloco("5 - print(“A media final é “media);"));
		blocos014.add(new Bloco("6 - float media = 0;"));
		blocos014.add(new Bloco("7 - string media = '0';"));
		blocos014.add(new Bloco("8 - input (nota2);"));
		blocos014.add(new Bloco("9 - float nota1 = 0, nota2 = 0;"));
		blocos014.add(new Bloco("10 - media = (nota1 + nota2) / 2;"));
		blocos014.add(new Bloco("11 - nota2 = print(“Informe a segunda nota);"));
		blocos014.add(new Bloco("12 - print(“Informe a segunda nota);"));
		blocos014.add(new Bloco("13 - input (nota1);"));
		blocos014.add(new Bloco("14 - print(“A media final é “+media);"));
		
		addQuestao(
				"Maurício, um aluno da turma de algoritmos, deseja calcular sua média final utilizando a fórmula MEDIA = (Nota1 + Nota 2) / 2. Organize os códigos abaixo para calcular a média final de Maurício e depois imprima a frase = 'A média final é X', onde X é o resultado da média final.",
				"6-9-1-13-12-8-10-3 | 9-6-1-13-12-8-10-3", 1, TipoQuestao_Enum.SWITCH_CASE, blocos014);

		// Questão 015
		List<Bloco> blocos015 = new ArrayList<>();

		blocos015.add(new Bloco("1- int a = 12;"));
		blocos015.add(new Bloco("2- a = a - b + c;"));
		blocos015.add(new Bloco("3- float b = 3,5;"));
		blocos015.add(new Bloco("4- b = c - a * b;"));
		blocos015.add(new Bloco("5- int c = 4;"));
		blocos015.add(new Bloco("6- c = a * b /c;"));
				
		addQuestao(
				"Dado os valores para a, b e c organize o algoritmo para que no fim da execução os valores sejam a = 18, b = -53, c = 10",
				"1-3-5-6-2-4|1-5-3-6-2-4|3-1-5-6-2-4|3-5-1-6-2-4|5-1-3-6-2-4|5-3-1-6-2-4", 1, TipoQuestao_Enum.SWITCH_CASE, blocos015);
		
		// Questão 016 - FASE 2
		List<Bloco> blocos016 = new ArrayList<>();

		blocos016.add(new Bloco("1- for(int i=9; i>=0; i--){"));
		blocos016.add(new Bloco("2- print(i);"));
		blocos016.add(new Bloco("3- }"));
		blocos016.add(new Bloco("4- for(int i=0; i<10; i++){"));
		blocos016.add(new Bloco("5- for(int i=9; i>0; i--){"));
		blocos016.add(new Bloco("6- for(int i=1; i<=10; i++){"));
		blocos016.add(new Bloco("7- for(int i=10; i>=0; i--){"));
		blocos016.add(new Bloco("8- for(int i=1; i<10; i++){"));
					
		
		addQuestao(
				"Usando a estrutura de repetição for, ordene os blocos para permitir que seja impresso em ordem decrescente apenas os 10 primeiros números do conjunto dos naturais:",
				"1-2-3", 2, TipoQuestao_Enum.FOR, blocos016);
		
		// Questão 017
		List<Bloco> blocos017 = new ArrayList<>();

		blocos017.add(new Bloco("1 - input(n);"));
		blocos017.add(new Bloco("2 - int soma;"));
		blocos017.add(new Bloco("3 - for (int i = 0; i < n; i++) {"));
		blocos017.add(new Bloco("4 - for (i; i <= n; i--){"));
		blocos017.add(new Bloco("5 - int i = 0;"));
		blocos017.add(new Bloco("6 - int soma = 0;"));
		blocos017.add(new Bloco("7 - soma = soma + i; }"));
		blocos017.add(new Bloco("8 - for (i; i >= n; i++){"));
		blocos017.add(new Bloco("9 - print('A soma é ' + soma);"));
		blocos017.add(new Bloco("10 - print('A soma é ' + i);"));
		
		addQuestao(
				"O programa escrito abaixo está embralhado. Sua missão é por o código na ordem correta. O programa faz a soma dos n primeiros números naturais e depois imprime o valor da soma.",
				"6-1-3-7-9 | 1-6-3-7-9", 2, TipoQuestao_Enum.FOR, blocos017);

		// Questão 018
		List<Bloco> blocos018 = new ArrayList<>();

		blocos018.add(new Bloco("1- }"));
		blocos018.add(new Bloco("2- float c = 0;"));
		blocos018.add(new Bloco("3- c = (f - 32) * 5 / 9;"));
		blocos018.add(new Bloco("4- for(int f=0; f<=100; f++){"));
		blocos018.add(new Bloco("5- print(f+'ºF é igual a '+c+'ºC');"));
		
		addQuestao(
				"Faça um algoritmo que calcule e escreva o valor correspondente a temperatura em graus Farenheit de 50ºF até 150ºF para graus Celsius",
				"2-4-3-5-1", 2, TipoQuestao_Enum.FOR, blocos018);

		// Questão 019
		List<Bloco> blocos019 = new ArrayList<>();

		blocos019.add(new Bloco("1 - int soma = 0;"));
		blocos019.add(new Bloco("2 - for (int i = 20; i < 40; i= i + 2) {"));
		blocos019.add(new Bloco("3 - print('O resultado da soma é: '+soma);"));
		blocos019.add(new Bloco("4 - }"));
		blocos019.add(new Bloco("5 - for(int i = 20; i <= 40; i= i + 2) {"));
		blocos019.add(new Bloco("6 - soma = soma + i;"));
		blocos019.add(new Bloco("7 - for(int i = 0; i <= 40; i++) {"));
		blocos019.add(new Bloco("8 - print('O resultado da soma é: ') + soma;"));
		
		addQuestao(
				"Laura, estudante de algoritmos, precisa de sua ajuda para completar a seguinte atividade: Somar apenas os números pares entre 20 e 40 e depois imprimir o seguinte texto 'O resultado da soma é: X', onde 'X' é resultado final do somatório. Organize o código abaixo para ajudar Laura.",
				"1-5-6-4-3", 2, TipoQuestao_Enum.FOR, blocos019);

		// Questão 020
		List<Bloco> blocos020 = new ArrayList<>();

		blocos020.add(new Bloco("1 - print(i + 1);}"));
		blocos020.add(new Bloco("2 - print(i);}"));
		blocos020.add(new Bloco("3 - for (int i = 0; i < 1000; i++) {"));
		blocos020.add(new Bloco("4 - for (int i = 0; i < 1000; i--) {"));
		blocos020.add(new Bloco("5 - for (int i = 0; i <= 1000; i++) {"));
			
		addQuestao(
				"Faça um programa que imprima os números inteiros que inicia em 1 e termina em 1000.",
				"3-1", 2, TipoQuestao_Enum.FOR, blocos020);
	
		HibernateUtil.shutdown();
	
		
		addQuestao(null, null, 0, null, null);
	}

	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO dao = new QuestaoDAO();

		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);

		dao.adicionarQuestao(questao);
		
		return true;
	}
}
