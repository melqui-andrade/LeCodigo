package com.br.uepb.dump;
import java.util.ArrayList;
import java.util.List;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class PopularTabelaQuestoes {

	//QUESTOES DA FASE 1
	public void popularQuestoes_Fase1() {
		//FASE 1 - IF_ELSE
		Questao1_Fase1_IfElse();		
		Questao2_Fase1_IfElse();
		Questao3_Fase1_IfElse();
		Questao4_Fase1_IfElse();
		Questao5_Fase1_IfElse();
		Questao6_Fase1_IfElse();
		Questao9_Fase1_IfElse();
		Questao10_Fase1_IfElse();
		
		//FASE 2 - SWITH_CASE
		Questao1_Fase1_SwitchCase();
		Questao2_Fase1_SwitchCase();
		Questao3_Fase1_SwitchCase();
		//Questao4_Fase1_SwitchCase();
		Questao5_Fase1_SwitchCase();
		Questao8_Fase1_SwitchCase();
		//Questao9_Fase1_SwitchCase();
		
		//FASE 3 - ATRIBUICAO
		Questao1_Fase1_Atribuicao();
		Questao2_Fase1_Atribuicao();
		Questao3_Fase1_Atribuicao();
		//Questao4_Fase1_Atribuicao();
		//Questao5_Fase1_Atribuicao();
		Questao6_Fase1_Atribuicao();
		Questao9_Fase1_Atribuicao();
		
	}
	
//### FASE 1 - IF_ELSE ###
	//CORRIGIDA
	private void Questao1_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int numero; String resposta;"));
		blocos.add(new Bloco(2, "if (numero) { "));
		blocos.add(new Bloco(3, "resposta = “O número é par”; }"));
		blocos.add(new Bloco(4, "else { resposta = “O número é impar”; }"));
		blocos.add(new Bloco(5, "if (numero%3==0) {"));
		blocos.add(new Bloco(6, "if (numero%2==0) {"));

		addQuestao(
				"Como deve-se verificar se um número qualquer é par ou impar? "+
		    	"Organize blocos para estabelecer a ordem que considerar correta.",
				"1-6-3-4", 1, TipoQuestao_Enum.IF_ELSE, blocos);
	}
	
	//CORRIGIDA
	private void Questao2_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "input(numeros[2]);"));
		blocos.add(new Bloco(2, "int maior = numeros[0];"));
		blocos.add(new Bloco(3, "input(numeros[1]);"));
		blocos.add(new Bloco(4, "if (numeros[1] > maior) {"));
		blocos.add(new Bloco(5, "int numeros[3];"));
		blocos.add(new Bloco(6, "input(numeros[0]);"));
		blocos.add(new Bloco(7, "print(maior);"));
		blocos.add(new Bloco(8, "maior = numeros[1];"));
		blocos.add(new Bloco(9, "if (numero[2] > maior) {"));
		blocos.add(new Bloco(10, "if (numero[2] > maior) {"));
		blocos.add(new Bloco(11, "maior = numero[2]; }"));
		blocos.add(new Bloco(12, "else {"));
		blocos.add(new Bloco(13, "maior = numero[2]; }"));

		addQuestao(
				"Escreva um algoritmo para determinar qual o maior valor em uma lista que contém três números distintos.",
				"5-6-3-1-2-4-8-10-13-12-9-11-7 | 5-3-6-1-2-4-8-10-13-12-9-11-7 | 5-1-3-6-2-4-8-10-13-12-9-11-7 | 5-6-1-3-2-4-8-10-13-12-9-11-7",
				1, TipoQuestao_Enum.IF_ELSE, blocos);
	}
	
	//CORRIGIDA
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
				"Faça um programa que leia 3 números inteiros e imprima um (e apenas um) dos seguintes números:<br />"+
				"<div style='text-indent: 10px;'> 1 - (Se todos os números são iguais)<br /> </div>"+
				"<div style='text-indent: 10px;'> 2 - (Se todos os números são diferentes)<br /> </div>"+
				"<div style='text-indent: 10px;'> 3 - (Se apenas dois números são iguais) </div>",
				"6-2-4-7-3-5-1", 1, TipoQuestao_Enum.IF_ELSE, blocos);
	}

	//CORRIGIDA
	private void Questao4_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "print (“Passagem gratuita”)"));
		blocos.add(new Bloco(3, "int idade;"));
		blocos.add(new Bloco(4, "}"));
		blocos.add(new Bloco(5, "} else {"));
		blocos.add(new Bloco(6, "if ( (idade < 7) || (idade > 65) ) {"));
		blocos.add(new Bloco(7, "input(idade);"));
		blocos.add(new Bloco(8, "print(“Passagem inteira”);"));
		blocos.add(new Bloco(9, "if ( (idade >= 7) && (idade <= 65) ) {"));
		blocos.add(new Bloco(10, "print() + “Passagem inteira”;"));		

		addQuestao(
				"Mariana precisa de um programa para gerenciar as passagens de um ônibus coletivo. "+
				"Desenvolva um código para receber a idade de uma pessoa e imprimir a mensagem “Passagem gratuita!” "+
				"para pessoas acima de 65 anos e abaixo de 7, ou “Passagem inteira” para as demais.",
				"3-7-6-2-5-8-1 | 3-7-6-2-5-8-4 | 3-7-6-2-5-9-8-1-4 | 3-7-6-2-5-9-8-4-1 | 3-7-9-8-5-2-1 |  3-7-9-8-5-2-4 | 3-7-9-8-5-6-2-1-4 | 3-7-9-8-5-6-2-4-1",
				1, TipoQuestao_Enum.IF_ELSE, blocos);

	}
	
	//CORRIGIDA
	private void Questao5_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "input(idade);"));
		blocos.add(new Bloco(2, "}"));
		blocos.add(new Bloco(3, "print(“Você pode doar sangue”);"));
		blocos.add(new Bloco(4, "print(“Você não pode doar sangue”);"));
		blocos.add(new Bloco(5, "if ((idade >= 18) && (idade <=67)) {"));
		blocos.add(new Bloco(6, "else{"));
		blocos.add(new Bloco(7, "int idade;"));

		addQuestao(
				"Para doar sangue é necessário ter entre 18 e 67 anos. "+
				"Faça um código que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.",
				"7-1-5-3-2-6-4-2", 1, TipoQuestao_Enum.IF_ELSE, blocos);

	}
	
	//CORRIGIDA
	private void Questao6_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
				
		blocos.add(new Bloco(1, "int nota1, nota2;"));
		blocos.add(new Bloco(2, "else{"));
		blocos.add(new Bloco(3, "if ((nota1 + nota2) / 2 < 7) {"));
		blocos.add(new Bloco(4, "print(“vai pra final”); }"));
		blocos.add(new Bloco(5, "input(nota1);"));
		blocos.add(new Bloco(6, "float nota1, nota2;"));
		blocos.add(new Bloco(7, "input(nota2);"));
		blocos.add(new Bloco(8, "if ((nota1 + nota2) / 2 >= 7) {"));
		blocos.add(new Bloco(9, "print(“aee passou!”); }"));

		addQuestao(
				"Escreva um programa que diga se o aluno passou por média ou vai para final na disciplina. "+
				"O programa deve ler a nota da primeira e segunda unidade, calcular a média e caso a nota seja menor que 7, "+
				"imprimir a mensagem “vai pra final”, caso contrário, imprimir a mensagem “aee passou!”<br />"+
				"<br /><b> Observações:</b> <br />"+
				"<div style='text-indent: 10px;'> - Formula para calcular a média:  média = (nota1 + nota2) / 2 <br /></div>"+
				"<div style='text-indent: 10px;'> - As notas podem ter valores decimais </div>",
				"6-5-7-8-9-2-4 | 6-7-5-8-9-2-4 | 6-5-7-3-4-2-9 | 6-7-6-3-4-2-9", 1, TipoQuestao_Enum.IF_ELSE, blocos);
	}
	
	//CORRIGIDA
	private void Questao9_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "print(“Infantil”);"));
		blocos.add(new Bloco(2, "print(“Juvenil”);"));
		blocos.add(new Bloco(3, "print(“Adulto”);"));
		blocos.add(new Bloco(4, "}"));
		blocos.add(new Bloco(5, "if (idade >=15 && idade <=17) {"));
		blocos.add(new Bloco(6, "if (idade >=18 && idade <=25) {"));
		blocos.add(new Bloco(7, "if (idade >=10 && idade <=14) {"));
		blocos.add(new Bloco(8, "input(idade);"));
		blocos.add(new Bloco(9, "int idade;"));

		addQuestao(
				"Um campeonato de vôlei têm 3 categorias infantil: de 10 à 14 anos, juvenil:  "+
				"15 à 17 anos e adulto: 18 à 25 anos. Faça um programa que receba a idade de uma pessoa e "+
				"mostre na saída em qual categoria ela se encontra.",
				"9-8-7-1-4-5-2-4-6-3-4 | 9-8-7-1-4-6-3-4-5-2-4 | 9-8-5-2-4-7-1-4-6-3-4 | 9-8-5-2-4-6-3-4-7-1-4 | 9-8-6-3-4-5-2-4-7-1-4 | 9-8-6-3-4-7-1-4-5-2-4", 
				1, TipoQuestao_Enum.IF_ELSE, blocos);
	}
	
	//CORRIGIDA
	private void Questao10_Fase1_IfElse() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "print(“Infantil”);"));
		blocos.add(new Bloco(2, "print(“Juvenil”);"));
		blocos.add(new Bloco(3, "print(“Adulto”);"));
		blocos.add(new Bloco(4, "}"));
		blocos.add(new Bloco(5, "if (idade >=15 && idade <=17) {"));
		blocos.add(new Bloco(6, "if (idade >=18 && idade <=25) {"));
		blocos.add(new Bloco(7, "if (idade >=10 && idade <=14) {"));
		blocos.add(new Bloco(8, "input(idade);"));
		blocos.add(new Bloco(9, "int idade;"));

		addQuestao(
				"João mora longe da escola e está indisposto para ir assistir aula porque o clima está frio. "+
				"Ele estabeleceu que se chover antes das sete horas não irá à escola, caso não chova antes das sete, então irá. "+
				"Monte um algoritmo que exemplifique essa ideia.",
				" 8-6-9-3-7-2-4-1 | 8-9-6-3-7-2-4-1 | 6-8-9-3-7-2-4-1 | 6-9-8-3-7-2-4-1 | 9-6-8-3-7-2-4-1 | 9-8-6-3-7-2-4-1", 
				1, TipoQuestao_Enum.IF_ELSE, blocos);
	}
		
//### FASE 1 - SWITCH_CASE ###
	//CORRIGIDA
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

	//CORRIGIDA
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
				"A estrutura switch/case é uma estrutura para problemas de 1______. "+
				"Quando uma 2 ______ possui várias condições a serem testadas, o uso do 3 ______ torna o código mais legível. "+
				"Decidir que mensagem mostrar após o usuário 4 ______ um valor no programa, "+
				"é um exemplo comum de problema que pode ser 5 ______ com switch/case. "+
				"Já decidir qual o maior valor em uma lista de tamanho variável é um problema em que a estrutura 6 ______ fica melhor empregada.",
				"2-8-7-5-4-3", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);
	}
	
	//CORRIGIDA
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
	
	//todo falta corrigir essa questao
	private void Questao4_Fase1_SwitchCase() {
		/*
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
		 */
	}
	
	//CORRIGIDA
	private void Questao5_Fase1_SwitchCase() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "case 3:"));
		blocos.add(new Bloco(3, "print(“dois”);"));
		blocos.add(new Bloco(4, "int n;"));
		blocos.add(new Bloco(5, "case 1:"));
		blocos.add(new Bloco(6, "input(n);"));
		blocos.add(new Bloco(7, "print(“três”);"));
		blocos.add(new Bloco(8, "print(“um”);"));
		blocos.add(new Bloco(9, "break;"));
		blocos.add(new Bloco(10, "case 2:"));
		blocos.add(new Bloco(11, "switch(n){"));
		blocos.add(new Bloco(13, "default:"));

		addQuestao(
				"Faça com que o código leia um número de 1 à 3, e escreva este número por extenso.",
				"4-6-11-5-8-10-3-2-7-13-9-1", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);
	}

	//CORRIGIDA
	private void Questao8_Fase1_SwitchCase() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "case 'A' : print(“Ajuda”); break;"));
		blocos.add(new Bloco(2, "char codigo;"));
		blocos.add(new Bloco(3, "int codigo;"));
		blocos.add(new Bloco(4, "case 'V' : print(“Voltar”); break;"));
		blocos.add(new Bloco(5, "input(codigo);"));
		blocos.add(new Bloco(6, "case 'S' : print(“Sair”); break;"));
		blocos.add(new Bloco(7, "case(codigo) {"));
		blocos.add(new Bloco(8, "}"));
		blocos.add(new Bloco(9, "switch(codigo) {"));

		addQuestao(
				"Imagine que você está desenvolvendo um sistema para ajudar o usuário com dicas de comandos. <br />"+
				"Crie um algoritmo para ler o código de um comando e imprimir o que ele significa.  <br />"+
				"<b>Dica de Comandos: A - “Ajuda” | S - “Sair” | V - “Voltar”</b> ",
				"2-5-9-1-6-4-8 | 2-5-9-1-4-6-8 | 2-5-9-6-1-4-8 | 2-5-9-6-4-1-8 | 2-5-9-4-1-6-8 | 2-5-9-4-6-1-8", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);
	}

	//todo falta corrigir essa questao
	private void Questao9_Fase1_SwitchCase() {
		/*
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "print(c); break;"));
		blocos.add(new Bloco(3, "case '+':"));
		blocos.add(new Bloco(4, "case '-':"));
		blocos.add(new Bloco(5, "int a, b, c; char operacao;"));
		blocos.add(new Bloco(6, "input(a); input(b); input(operacao);"));
		blocos.add(new Bloco(7, "switch (operacao){"));
		blocos.add(new Bloco(8, "c = a - b;"));
		blocos.add(new Bloco(9, "c = a + b;"));

		addQuestao(
				"Organize o algoritmo para que leia dois números e escolha a operação de soma ou subtração e imprima o resultado.",
				"5-6-8-3-10-2-4-9-2-1 | 5-6-8-4-9-2-3-10-2-1", 1, TipoQuestao_Enum.SWITCH_CASE, blocos);
		*/
	}
	
//### FASE 1 - ATRIBUICAO ###
	//CORRIGIDA
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
				"Utilizando os blocos a seguir, atribua a frase “Seja bem-vindo ao universo dos algoritmos” para a variável “frase”",
				"1-2-3-4-7 | 1-3-2-4-7 | 2-3-1-4-7 | 2-1-3-4-7 | 3-1-2-4-7 | 3-2-1-4-7 | 1-2-4-3-7", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);

	}
	
	//CORRIGIDA
	private void Questao2_Fase1_Atribuicao() {		
		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(1, "int a"));
		blocos.add(new Bloco(2, "double b"));
		blocos.add(new Bloco(3, "boolean c"));
		blocos.add(new Bloco(4, "= false;"));
		blocos.add(new Bloco(5, "= 3,1415;"));
		blocos.add(new Bloco(6, "= -1000000;"));
		
		addQuestao(
				"Para cada valor a seguir declare uma variável que melhor armazene os valores a seguir:<br />"+		
				"<div style='text-indent: 10px;'>a) false<br /></div>"+
				"<div style='text-indent: 10px;'>b) 3,1415<br /></div>"+
				"<div style='text-indent: 10px;'>c) -1.000.000",
				"1-6-2-5-3-4 | 1-6-3-4-2-5 | 2-5-1-6-3-4 | 2-5-3-4-1-6 | 3-4-1-6-2-5 | 3-4-2-5-1-6", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);

	}
	
	//CORRIGIDA 
	//todo falta algumas opções de resposta
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
	
	//todo falta corrigir essa questao
	private void Questao4_Fase1_Atribuicao() {
		/*
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
		*/
	}

	//todo falta corrigir essa questao
	private void Questao5_Fase1_Atribuicao() {
		/*
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
		*/
	}
	
	//CORRIGIDA
	private void Questao6_Fase1_Atribuicao() {
		
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int variasPossibilidades;"));
		blocos.add(new Bloco(2, "boolean variasPossibilidades;"));
		blocos.add(new Bloco(3, "char variasPossibilidades;"));
		blocos.add(new Bloco(4, "float variasPossibilidades;"));
		blocos.add(new Bloco(5, "variasPossibilidades = '9';"));
		blocos.add(new Bloco(6, "variasPossibilidades = 9;"));
		blocos.add(new Bloco(6, "variasPossibilidades =  “9”;"));
		
		addQuestao(
				"Organize os blocos a seguir para que a variável “variasPossibilidades” receba o valor 9",
				"1-6 | 3-5 | 4-6", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);		
	}
	
	//CORRIGIDA
	private void Questao9_Fase1_Atribuicao() {
		
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "print(risos[c]);"));
		blocos.add(new Bloco(2, "int a = 3, b = 2, c = 4;"));
		blocos.add(new Bloco(3, "String risos[] = {“kkkkkkkkjk”, “hahahaha”, “aushahushaush”, “rsrsrsrsrs”};"));
		blocos.add(new Bloco(4, "c = a - c + b;"));
		blocos.add(new Bloco(5, "c = c - b;"));
		blocos.add(new Bloco(6, "c = a + b + c;"));
		
		addQuestao(
				"Organize os blocos para imprimir o nome “hahahaha” (use apenas 4 blocos)",
				"3-2-4-1 | 2-3-4-1", 1, TipoQuestao_Enum.ATRIBUICAO, blocos);		
	}
		

	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		
		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);
		questaoDAO.adicionarQuestao(questao);
		
		return true;
	}
}
