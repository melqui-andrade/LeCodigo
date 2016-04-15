package com.br.uepb.dump;
import java.util.ArrayList;
import java.util.List;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class PopularTabelaQuestoes {

	public void popularQuestoes_Fase1() {
		//FASE 1 - IF_ELSE
		Questao1_Fase1_IfElse();		
		Questao2_Fase1_IfElse();
		Questao3_Fase1_IfElse();
		Questao4_Fase1_IfElse();
		Questao5_Fase1_IfElse();
		
		//FASE 2 - SWITH_CASE
		Questao1_Fase1_SwitchCase();
		Questao2_Fase1_SwitchCase();
		Questao3_Fase1_SwitchCase();
		Questao4_Fase1_SwitchCase();
		Questao5_Fase1_SwitchCase();
		
		//FASE 3 - ATRIBUICAO
		Questao1_Fase1_Atribuicao();
		Questao2_Fase1_Atribuicao();
		Questao3_Fase1_Atribuicao();
		Questao4_Fase1_Atribuicao();
		Questao5_Fase1_Atribuicao();		
	}
	
	//FASE 1 - IF_ELSE
	private void Questao1_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "int numero; String resposta;"));
		blocos.add(new Bloco(2, "if(numero){ "));
		blocos.add(new Bloco(3, "resposta = “O número é par”; }"));
		blocos.add(new Bloco(4, "else { resposta = “O número é impar”; }"));
		blocos.add(new Bloco(5, "if (numero%3==0) {"));
		blocos.add(new Bloco(6, "if (numero%2==0) {"));

		addQuestao(
				"Como deve-se verificar se um número qualquer é par ou impar? Organize blocos para estabelecer a ordem que considerar correta.",
				"1-6-3-4", 1, TipoQuestao_Enum.IF_ELSE, blocos);

	}
	
	
	private void Questao2_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "input(numeros[2]);"));
		blocos.add(new Bloco(2, "int maior = numeros[0];"));
		blocos.add(new Bloco(3, "input(numeros[1]);"));
		blocos.add(new Bloco(4, "if(numeros[1] > maior){"));
		blocos.add(new Bloco(5, "int numeros[3];"));
		blocos.add(new Bloco(6, "input(numeros[0]);"));
		blocos.add(new Bloco(7, "print(maior);"));
		blocos.add(new Bloco(8, "maior = numeros[1];"));
		blocos.add(new Bloco(9, "if(numero[2] > maior){"));
		blocos.add(new Bloco(10, "if(numero[2] > maior){"));
		blocos.add(new Bloco(11, "maior = numero[2];}"));
		blocos.add(new Bloco(12, "else{"));
		blocos.add(new Bloco(13, "maior = numero[2];}"));

		addQuestao(
				"Escreva um algoritmo para determinar qual o maior valor em uma lista que contém três números distintos.",
				"5-6-3-1-2-4-8-10-13-12-9-11-7 | 5-3-6-1-2-4-8-10-13-12-9-11-7 | 5-1-3-6-2-4-8-10-13-12-9-11-7 | 5-6-1-3-2-4-8-10-13-12-9-11-7",
				1, TipoQuestao_Enum.IF_ELSE, blocos);
	}
	
	private void Questao3_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "print(3);}"));
		blocos.add(new Bloco(2, "if (n1 == n2 && n1 == n3) {"));
		blocos.add(new Bloco(3, "print(2);"));
		blocos.add(new Bloco(4, "print(1);"));
		blocos.add(new Bloco(5, "} else {"));
		blocos.add(new Bloco(6, "input(n1); input(n2); input(n3);"));
		blocos.add(new Bloco(7, "} else if (n1 != n2 && n1 != n3) {"));

		addQuestao(
				"Faça um programa que leia 3 números inteiros e imprima um (e apenas um) dos seguintes números: \n1 - (Se todos os números são iguais)\n2 - (Se todos os números são diferentes) \n3 - (Se apenas dois números são iguais)",
				"6-2-4-7-3-5-1", 1, TipoQuestao_Enum.IF_ELSE, blocos);

	}

	private void Questao4_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "print(“Informe a idade:“);"));
		blocos.add(new Bloco(3, "input(profissao);"));
		blocos.add(new Bloco(4, "print(“Informe a profissao:“);"));
		blocos.add(new Bloco(5, "int idade;"));
		blocos.add(new Bloco(6, "print(“Passagem = 1,50“);"));
		blocos.add(new Bloco(7, "if (profissão == “estudante”) {"));
		blocos.add(new Bloco(8, "print(Passagem = 1,50);"));
		blocos.add(new Bloco(9, "else {"));
		blocos.add(new Bloco(10, "if ( (idade <= 7) ||  (idade >= 65) ) {"));
		blocos.add(new Bloco(11, "input(idade);"));
		blocos.add(new Bloco(12, "print(“Passagem = 3,00“);"));
		blocos.add(new Bloco(13, "if (profissão = “estudante”) {"));
		blocos.add(new Bloco(14, "input(estudante);"));
		blocos.add(new Bloco(15, "string profissao;"));
		blocos.add(new Bloco(16, "print (“Passagem gratuita”);"));

		addQuestao(
				"Mariana está querendo desenvolver um código para gerenciar as passagens de um ônibus coletivo. Para isto, ela precisa "+
				"considerar que pessoas acima de 65 anos e abaixo de 7 anos não pagam passagem. E que os estudantes pagam meia-passagem. "+
				"Desenvolva o código para imprimir o valor da passagem do ônibus, considerando que o valor da passagem inteira é 3,00. "+
				"Se o passageiro não precisa pagar passagem imprima a mensagem “Passagem gratuita!”",
				"5-15-2-11-4-3-10-16-1-9-7-6-1-9-12-1-1 | 5-15-4-3-2-11-10-16-1-9-7-6-1-9-12-1-1 | 15-5-2-11-4-3-10-16-1-9-7-6-1-9-12-1-1 | 15-5-4-3-2-11-10-16-1-9-7-6-1-9-12-1-1",
				1, TipoQuestao_Enum.IF_ELSE, blocos);

	}
	
	private void Questao5_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "input(idade);"));
		blocos.add(new Bloco(2, "}"));
		blocos.add(new Bloco(3, "print(”Você pode doar sangue“);"));
		blocos.add(new Bloco(4, "print(”Você não pode doar sangue“);"));
		blocos.add(new Bloco(5, "if( (idade >= 18) && (idade <=67)){"));
		blocos.add(new Bloco(6, "else{"));
		blocos.add(new Bloco(7, "int idade;"));

		addQuestao(
				"Para doar sangue é necessário ter entre 18 e 67 anos. "+
				"Faça um código que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.",
				"7-1-5-3-2-6-4-2", 1, TipoQuestao_Enum.IF_ELSE, blocos);

	}

	//FASE 1 - SWITCH_CASE
	private void Questao1_Fase1_SwitchCase() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "String lugar; String sigla;"));
		blocos.add(new Bloco(2, "switch(lugar){"));
		blocos.add(new Bloco(3, "case “Brasil” :"));
		blocos.add(new Bloco(4, "sigla = “BR”;"));
		blocos.add(new Bloco(5, "case “Nordeste” :"));
		blocos.add(new Bloco(6, "sigla = “NE”;"));
		blocos.add(new Bloco(7, "case “Paraíba” :"));
		blocos.add(new Bloco(8, "sigla = “PB”;"));
		blocos.add(new Bloco(9, "}"));
		blocos.add(new Bloco(10, "switch(sigla){"));
		blocos.add(new Bloco(11, "case “PB” :"));
		blocos.add(new Bloco(12, "lugar = “Paraíba”;"));
		blocos.add(new Bloco(13, "case “BR” :"));
		blocos.add(new Bloco(14, "lugar = “Brasil”;"));
		blocos.add(new Bloco(15, "case “NE” :"));
		blocos.add(new Bloco(16, "lugar = “Nordeste”;"));

		addQuestao(
				"A variável “lugar” pode possuir os valores “Brasil”, “Nordeste” ou “Paraíba”. Garanta que a variável “sigla” corresponda ao lugar informado.",
				"1-2-3-4-5-6-7-8-9 | 1-2-3-4-7-8-5-6-9 | 1-2-5-6-3-4-7-8-9 | 1-2-5-6-7-8-3-4-9 | 1-2-7-8-3-4-5-6-9 | 1-2-7-8-5-6-3-4-9",
				1, TipoQuestao_Enum.SWITCH_CASE, blocos);


	}

	private void Questao2_Fase1_SwitchCase() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "ordenação"));
		blocos.add(new Bloco(2, "decisão"));
		blocos.add(new Bloco(3, "if/else"));
		blocos.add(new Bloco(4, "resolvido"));
		blocos.add(new Bloco(5, "inserir"));
		blocos.add(new Bloco(6, "resolvido"));
		blocos.add(new Bloco(7, "switch/case"));
		blocos.add(new Bloco(8, "variável"));

		addQuestao(
				"A estrutura switch/case é uma estrutura para problemas de 1______. Quando uma 2 ______ possui várias condições a serem testadas, "+
				"o uso do 3 ______ torna o código mais legível. Decidir que mensagem mostrar após o usuário 4 ______ um valor no programa, "+
				"é um exemplo comum de problema que pode ser 5 ______ com switch/case. Já decidir qual o maior valor em uma lista de tamanho variável "+
				"é um problema em que a estrutura 6 ______ fica melhor empregada.",
				"2-8-7-5-4-3", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);
	}
	
	private void Questao3_Fase1_SwitchCase() {		
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "print(“Quarta-feira“); break;"));
		blocos.add(new Bloco(2, "case 7:"));
		blocos.add(new Bloco(3, "print(“Sábado“); break;"));
		blocos.add(new Bloco(4, "case 2:"));
		blocos.add(new Bloco(5, "print(“Terça-feira“); break;"));
		blocos.add(new Bloco(6, "case 6:"));
		blocos.add(new Bloco(7, "case 4:"));
		blocos.add(new Bloco(8, "print(“Domingo“); break;"));
		blocos.add(new Bloco(9, "default:"));
		blocos.add(new Bloco(10, "switch (diaDaSemana) {"));
		blocos.add(new Bloco(11, "print(“Este não é um dia válido!“);}"));
		blocos.add(new Bloco(12, "case 3:"));
		blocos.add(new Bloco(13, "case 5:"));
		blocos.add(new Bloco(14, "int diaDaSemana = 5;"));
		blocos.add(new Bloco(15, "case 1:"));
		blocos.add(new Bloco(16, "print(“Sexta-feira“); break;"));
		blocos.add(new Bloco(17, "print(“Quinta-feira“); break;"));
		blocos.add(new Bloco(18, "print(“Segunda-feira“); break;"));

		addQuestao("Ordene os dias da semana usando um Switch Case e depois imprima a quinta-feira.",
				"14-10-15-8-4-18-12-5-7-1-13-17-6-16-2-3-9-11", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);
	}
	
	private void Questao4_Fase1_SwitchCase() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "case 4 :  valor_total = (3,50 * quantidade);"));
		blocos.add(new Bloco(2, "input(numero_produto);"));
		blocos.add(new Bloco(3, "int quantidade = 0;"));
		blocos.add(new Bloco(4, "case 1 :  valor_total = (2,00 * quantidade);"));
		blocos.add(new Bloco(5, "print(“Informe o código do produto”);"));
		blocos.add(new Bloco(6, "input(codigo);"));
		blocos.add(new Bloco(7, "}"));
		blocos.add(new Bloco(8, "case 3 :  valor_total = (2,50 * quantidade);"));
		blocos.add(new Bloco(9, "print(“Informe a quantidade do produto”);"));
		blocos.add(new Bloco(10, "case (1,2,3,4) :  valor_total = (2,00 * quantidade);"));
		blocos.add(new Bloco(11, "int codigo = 0;"));
		blocos.add(new Bloco(12, "input(quantidade);"));
		blocos.add(new Bloco(13, "float valor_total = 0;"));
		blocos.add(new Bloco(14, "switch(codigo) {"));
		blocos.add(new Bloco(15, "print(“Valor Total = ”+valor_total);"));
		blocos.add(new Bloco(16, "switch ()"));
		blocos.add(new Bloco(17, "case 2 :  valor_total = (3,00 * quantidade);"));
		blocos.add(new Bloco(18, "print(“Valor  Total= ” + valor_total);"));
		blocos.add(new Bloco(19, "string codigo = 0;"));

		addQuestao(
				"A lanchonete de Marli está com um sistema novo e codificou todos os seus produtos para agilizar o atendimento. \n"+
				"A tabela dos produtos é a seguinte: \nProduto -  Código - Valor \nPastel - 1- 2,00 \nCachorro-Quente - 2 - 3,00 \nCoxinha - 3 - 2,50 \nRefrigerante - 4 - 3,50 \n\n"+
				"Crie um algoritmo que leia o código de um produto e a quantidade e imprima o  valor total",
				"11-3-5-6-9-12-14-4-17-8-1-7-18 | 3-11-5-6-9-12-14-4-17-8-1-7-18", 1, TipoQuestao_Enum.SWITCH_CASE,
				blocos);

	}
	
	private void Questao5_Fase1_SwitchCase() {
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "case 3:"));
		blocos.add(new Bloco(3, "print(“dois“);"));
		blocos.add(new Bloco(4, "int n;"));
		blocos.add(new Bloco(5, "case 1:"));
		blocos.add(new Bloco(6, "input(n);"));
		blocos.add(new Bloco(7, "print(“três“);"));
		blocos.add(new Bloco(8, "print(“um“);"));
		blocos.add(new Bloco(9, "break;"));
		blocos.add(new Bloco(10, "case 2:"));
		blocos.add(new Bloco(11, "switch(n){"));
		blocos.add(new Bloco(13, "default:"));

		addQuestao(
				"Faça com que o código leia um número de 1 à 3, e escreva este número por extenso.",
				" 4-6-11-5-8-10-3-2-7-13-9-1", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);

	}

	//FASE 1 - ATRIBUICAO
	private void Questao1_Fase1_Atribuicao() {		
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "String palavras [] = {“Seja bem-vindo”, “universo dos algoritmos”, “ao”, “ ”};"));
		blocos.add(new Bloco(2, "int a = 3;"));
		blocos.add(new Bloco(3, "int b = a-1;"));
		blocos.add(new Bloco(4, "String frase = palavras[0] + palavras[a];"));
		blocos.add(new Bloco(5, "String frase = palavras[0] + palavras[b];"));
		blocos.add(new Bloco(6, "frase = frase + palavras[b] + palavras[1];"));
		blocos.add(new Bloco(7, "frase = frase + palavras[b] + palavras[a] + palavras[1];"));

		addQuestao(
				"Utilizando os blocos a seguir, atribua a frase “Seja bem-vindo ao universo dos algoritmos” para a variável “frase”.",
				"1-2-3-4-7 | 1-3-2-4-7 | 2-3-1-4-7 | 2-1-3-4-7 | 3-1-2-4-7 | 3-2-1-4-7", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);

	}
	
	private void Questao2_Fase1_Atribuicao() {		
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "int a"));
		blocos.add(new Bloco(2, "double b"));
		blocos.add(new Bloco(3, "boolean c"));
		blocos.add(new Bloco(4, "= false;"));
		blocos.add(new Bloco(5, "= 3,1415;"));
		blocos.add(new Bloco(6, "= -1000000;"));
		
		addQuestao(
				"Para cada valor a seguir declare uma variável que melhor armazene os valores a seguir:\n"+
				"a) false\nb) 3,1415\nc) -1.000.000",
				"1-6-2-5-3-4 | 1-6-3-4-2-5 | 2-5-1-6-3-4 | 2-5-3-4-1-6 | 3-4-1-6-2-5 | 3-4-2-5-1-6", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);

	}
	
	private void Questao3_Fase1_Atribuicao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "print(idade + “ - ” + nome);"));
		blocos.add(new Bloco(2, "String nome = “Leandro”;"));
		blocos.add(new Bloco(3, "print((idade + 5) + “ - ” + sobrenome);"));
		blocos.add(new Bloco(4, "int idade = 20;"));
		blocos.add(new Bloco(5, "String sobrenome = “Gomes”;"));
		                              		
		addQuestao(
				"Imprima a idade e o nome, logo em seguida imprima a idade após 5 anos junto com o sobrenome.",
				"4-2-5-1-3 | 5-4-2-1-3 | 2-4-5-1-3 | 2-5-4-1-3 | 4-5-2-1-3 | 5-2-4-1-3", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);
		
	}
	
	private void Questao4_Fase1_Atribuicao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "print(“Informe a primeira nota”);"));
		blocos.add(new Bloco(2, "media = nota1 + nota2 / 2;"));
		blocos.add(new Bloco(3, "print(“A media final é ”+media);"));
		blocos.add(new Bloco(4, "nota1 = print(“Informe a primeira nota”);"));
		blocos.add(new Bloco(5, "print(“A media final é ”media);"));
		blocos.add(new Bloco(6, "float media = 0;"));
		blocos.add(new Bloco(7, "string media = “0”;"));
		blocos.add(new Bloco(8, "input (nota2);"));
		blocos.add(new Bloco(9, "float nota1 = 0, nota2 = 0;"));
		blocos.add(new Bloco(10, "media = (nota1 + nota2) / 2;"));
		blocos.add(new Bloco(11, "nota2 = print(“Informe a segunda nota);"));
		blocos.add(new Bloco(12, "print(“Informe a segunda nota”);"));
		blocos.add(new Bloco(13, "input (nota1);"));		

		addQuestao(
				"Maurício, um aluno da turma de algoritmos, deseja calcular sua média final utilizando a fórmula MEDIA = (Nota1 + Nota 2) / 2. "+
				"Organize os códigos abaixo para calcular a média final de Maurício e depois imprima a frase = “A média final é X”, onde X é o resultado da média final.",
				"6-9-1-13-12-8-10-3 | 9-6-1-13-12-8-10-3", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);
		
	}

	private void Questao5_Fase1_Atribuicao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int a = 12;"));
		blocos.add(new Bloco(2, "a = a - b + c;"));
		blocos.add(new Bloco(3, "float b = 3,5;"));
		blocos.add(new Bloco(4, "b = c - a * b;"));
		blocos.add(new Bloco(5, "int c = 4;"));
		blocos.add(new Bloco(6, "c = a * b /c;"));
		
		addQuestao(
				"Dado os valores para a, b e c organize o algoritmo para que no fim da execução os valores sejam a = 18, b = -53, c = 10.",
				"1-3-5-6-2-4 | 1-5-3-6-2-4 | 3-1-5-6-2-4 | 3-5-1-6-2-4 | 5-1-3-6-2-4 | 5-3-1-6-2-4", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);
		
	}

	
	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		
		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);
		questaoDAO.adicionarQuestao(questao);
		
		return true;
	}
}
