package com.br.uepb.dump;

import java.util.ArrayList;
import java.util.List;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class PopularTabelaQuestoes2 {

	public void popularQuestoes_Fase2() {
		//FASE 2 - FOR
		Questao1_Fase2_For();
		Questao2_Fase2_For();
		Questao3_Fase2_For();
		//Questao4_Fase2_For();
		Questao5_Fase2_For();
		Questao7_Fase2_For();
		
		//FASE 2 - WHILE
		Questao1_Fase2_While();
		Questao2_Fase2_While();
		Questao3_Fase2_While();
		Questao4_Fase2_While();
		Questao5_Fase2_While();
		Questao9_Fase2_While();
		
		//FASE 2 - DO_WHILE
		Questao1_Fase2_DoWhile();
		Questao2_Fase2_DoWhile();
		Questao3_Fase2_DoWhile();
		//Questao4_Fase2_DoWhile();
		Questao5_Fase2_DoWhile();
		Questao6_Fase2_DoWhile();
	}
	
//*** FASE 2 - FOR ***
	//CORRIGIDA
	private void Questao1_Fase2_For() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "for (int i=9; i>=0; i--) {"));
		blocos.add(new Bloco(2, "print(i);"));
		blocos.add(new Bloco(3, "}"));
		blocos.add(new Bloco(4, "for (int i=0; i<10; i++) {"));
		blocos.add(new Bloco(5, "for (int i=9; i>0; i--) {"));
		blocos.add(new Bloco(6, "for (int i=1; i<=10; i++) {"));
		blocos.add(new Bloco(7, "for (int i=10; i>=0; i--) {"));
		blocos.add(new Bloco(8, "for (int i=1; i<10; i++) {"));
			
		addQuestao(
				"Usando a estrutura de repetição for, ordene os blocos para permitir que seja impresso em ordem "+
				"decrescente apenas os 10 primeiros números do conjunto dos naturais.",
				"1-2-3", 2, TipoQuestao_Enum.FOR, blocos);
	}
	
	//CORRIGIDA
	private void Questao2_Fase2_For() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "input(n);"));
		blocos.add(new Bloco(2, "int soma;"));
		blocos.add(new Bloco(3, "for (int i = 0; i < n; i++) {"));
		blocos.add(new Bloco(4, "for (i; i <= n; i--){"));
		blocos.add(new Bloco(5, "int i = 0;"));
		blocos.add(new Bloco(6, "int soma = 0;"));
		blocos.add(new Bloco(7, "soma = soma + i; }"));
		blocos.add(new Bloco(8, "for (i; i >= n; i++){"));
		blocos.add(new Bloco(9, "print(“A soma é ” + soma);")); 
		blocos.add(new Bloco(10, "print(“A soma é ” + i);"));

		addQuestao(
				"O programa escrito abaixo está embralhado. Sua missão é por o código na ordem correta. "+
				"O programa faz a soma dos n primeiros números naturais e depois imprime o valor da soma.",
				"6-1-3-7-9 | 1-6-3-7-9", 2, TipoQuestao_Enum.FOR, blocos);
	}
		
	//CORRIGIDA
	private void Questao3_Fase2_For() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "float c = 0;"));
		blocos.add(new Bloco(3, "c = (f - 32) * 5 / 9;"));
		blocos.add(new Bloco(4, "for(int f=0; f<=100; f++){"));
		blocos.add(new Bloco(5, "print(f+“ºF é igual a ”+c+“ºC”);"));
		
		addQuestao(
				"Faça um algoritmo que calcule e escreva o valor correspondente a temperatura em graus Farenheit de 50ºF até 150ºF para graus Celsius",
				"2-4-3-5-1", 2, TipoQuestao_Enum.FOR, blocos);
	}

	//todo falta corrigir essa questao
	private void Questao4_Fase2_For() {
		/*
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int soma = 0;"));
		blocos.add(new Bloco(2, "for (int i = 20; i < 40; i= i + 2) {"));
		blocos.add(new Bloco(3, "print(“O resultado da soma é: ”+soma);"));
		blocos.add(new Bloco(4, "}"));
		blocos.add(new Bloco(5, "for(int i = 20; i <= 40; i= i + 2) {"));
		blocos.add(new Bloco(6, "soma = soma + i;"));
		blocos.add(new Bloco(7, "for(int i = 0; i <= 40; i++) {"));
		blocos.add(new Bloco(8, "print(“O resultado da soma é: ”) + soma;"));
		
		addQuestao(
				"Laura, estudante de algoritmos, precisa de sua ajuda para completar a seguinte atividade:\n"+ 
				"Somar apenas os números pares entre 20 e 40 e depois imprimir o seguinte texto “O resultado da soma é: X”, "+
				"onde “X” é resultado final do somatório. Organize o código abaixo para ajudar Laura.",
				"1-5-6-4-3", 2, TipoQuestao_Enum.FOR, blocos);
		*/
	}
		
	//CORRIGIDA
	private void Questao5_Fase2_For() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "print(i + 1);}"));
		blocos.add(new Bloco(2, "print(i);}"));
		blocos.add(new Bloco(3, "for (int i = 0; i < 1000; i++) {"));
		blocos.add(new Bloco(4, "for (int i = 0; i < 1000; i--) {"));
		blocos.add(new Bloco(5, "for (int i = 0; i <= 1000; i++) {"));
		
		addQuestao(
			"Faça um programa que imprima os números inteiros que inicia em 1 e termina em 1000.",
			"3-1", 2, TipoQuestao_Enum.FOR, blocos);
	}
	
	private void Questao7_Fase2_For() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int juros = 5;"));
		blocos.add(new Bloco(2, "float juros = 0.05;"));
		blocos.add(new Bloco(3, "float divida = 100;"));
		blocos.add(new Bloco(4, "for (int mes = 1; mes < 8; mes++) {"));
		blocos.add(new Bloco(5, "for (int mes = 0; mes < 8; mes++) {"));
		blocos.add(new Bloco(6, "for (int mes = 1; mes <= 8; mes++) {"));
		blocos.add(new Bloco(7, "float total = divida * ( (1.0 + juros) ^ mes );"));
		blocos.add(new Bloco(8, "print(total);}"));
		
		addQuestao(
			"A empresa Space Inc cobra juros de 6% ao mês por atraso no pagamento. Etvaldo deve R$ 100,00 a Space Inc. "+
		    "Escreva um programa que imprima o valor que Etvaldo vai estar devendo a empresa ao fim de cada mês por 8 meses.<br />"+		
		    "Obs: Utilize a seguinte fórmula para o cálculo de juros:  <b>total = valor * ( (1 + juros) ^ meses)</b>",
			"1-2-3-6-7-8 | 1-3-2-6-7-8 | 2-1-3-6-7-8 | 2-3-1-6-7-8 | 3-1-2-6-7-8 | 3-2-1-6-7-8 | 2-3-6-1-7-8 | 3-2-6-1-7-8 | 1-3-6-2-7-8 | "+
		    "3-1-6-2-7-8 | 1-2-6-3-7-8 | 2-1-6-3-7-8 | 2-3-6-1-7-8 | 3-2-6-1-7-8 | 1-3-6-2-7-8 | 3-1-6-2-7-8 | 1-3-6-2-7-8 | 3-1-6-2-7-8 | "+
					"1-2-6-3-7-8 | 2-1-6-3-7-8 | 2-3-6-1-7-8 | 3-2-6-1-7-8 | 1-3-6-2-7-8 | 3-1-6-2-7-8 | 1-2-6-3-7-8 | 2-1-6-3-7-8",
			2, TipoQuestao_Enum.FOR, blocos);
	}
	
//*** FASE 2 - WHILE ***
	//CORRIGIDA
	private void Questao1_Fase2_While() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "while (x<21) {"));
		blocos.add(new Bloco(2, "print(“Ao infinito e além :P”);"));
		blocos.add(new Bloco(3, "int x = 6;"));
		blocos.add(new Bloco(4, "x+=1; }"));
		blocos.add(new Bloco(5, "while (x==21) {"));
		blocos.add(new Bloco(6, "x-=1; }"));
			
		addQuestao(
			"Organize o código para exibir a mensagem “Ao infinito e além :P” várias vezes.",
			"3-1-2-4", 2, TipoQuestao_Enum.WHILE, blocos);
	}
	
	//CORRIGIDA
	private void Questao2_Fase2_While() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "while(x < 10){"));
		blocos.add(new Bloco(3, "while(x < 5){"));
		blocos.add(new Bloco(4, "while(x > 10){"));
		blocos.add(new Bloco(5, "while(x <= 11){"));
		blocos.add(new Bloco(6, "while(x <= 5){"));
		blocos.add(new Bloco(7, "print(“Hello Word!”);"));
		blocos.add(new Bloco(8, "x = x + 2;"));
		blocos.add(new Bloco(9, "int x = 1; "));

		addQuestao(
			"Organize o algoritmo para que a palavra “Hello Word!” seja escrita 5 vezes.",
			"9-2-7-8-1 | 9-2-8-7-1", 2, TipoQuestao_Enum.WHILE, blocos);
		
	}
	
	//CORRIGIDA 
	private void Questao3_Fase2_While() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "for"));
		blocos.add(new Bloco(2, "while"));
		blocos.add(new Bloco(3, "if"));
		blocos.add(new Bloco(4, "falso"));
		blocos.add(new Bloco(5, "verdadeira"));
		blocos.add(new Bloco(6, "switch"));
		blocos.add(new Bloco(7, "(i)"));
		blocos.add(new Bloco(8, "(ii)"));
		
		addQuestao(
				"A instrução ____ executa uma instrução ou bloco de instrução enquanto uma determinada condição for ______. "+
				"O seu funcionamento se resume aos seguintes passos. (i) A condição é avaliada; (ii) Se o resultado da avaliação for Falso, "+
				"o laço termina e o programa continua na instrução imediatamente após o _____. "+
				"(iii) Se o resultado for verdadeiro, é executada a instrução associada ao _____. (iv) Volta-se ao ponto ___.",
				"2-5-2-2-7", 2, TipoQuestao_Enum.WHILE, blocos);
		
	}

	//CORRIGIDA
	private void Questao4_Fase2_While() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "while (true) {"));
		blocos.add(new Bloco(2, "}"));
		blocos.add(new Bloco(3, "while (numero != 0) {"));
		blocos.add(new Bloco(4, "print (“Informe um número:”);"));
		blocos.add(new Bloco(5, "if (numero != 0) {"));
		blocos.add(new Bloco(6, "int numero = 0;"));
		blocos.add(new Bloco(7, "print(“O numero é: ”+numero);"));
		blocos.add(new Bloco(8, "x = x + 2;"));
		blocos.add(new Bloco(9, "int x = 1;"));
		
		addQuestao(
				"Organize o código abaixo para receber vários números e imprimir logo em seguida, enquanto o número 0 não for informado. "+
				"Se o número 0 for informado, ele não será impresso e o programa termina.",
				"6-10-9-3-7-10-9-2 | 10-6-9-3-7-10-9-2", 2, TipoQuestao_Enum.WHILE, blocos);
	}

	//CORRIGIDA
	private void Questao5_Fase2_While() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "while (count <= 10) {"));
		blocos.add(new Bloco(2, "maior = num;"));
		blocos.add(new Bloco(3, "print(“O maior numero digitado é: ” + maior);"));
		blocos.add(new Bloco(4, "input(num);"));
		blocos.add(new Bloco(5, "int count = 2;"));
		blocos.add(new Bloco(6, "maior = num;}"));
		blocos.add(new Bloco(7, "if (num > maior) {"));
		blocos.add(new Bloco(8, "float maior, num;"));
		blocos.add(new Bloco(9, "count++; }"));
		
		addQuestao(
				"Imprima o maior número dentre os 10 números digitados pelo usuário.",
				"8-5-4-2-1-4-7-6-9-3 | 5-8-4-2-1-4-7-6-9-3", 2, TipoQuestao_Enum.WHILE, blocos);
		
	}
	
	//CORRIGIDA
	private void Questao9_Fase2_While() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "while (numero <= 0) {"));
		blocos.add(new Bloco(2, "print(“antecessor ”+ (numero-1) );"));
		blocos.add(new Bloco(3, "input(numero);"));
		blocos.add(new Bloco(4, "while (numero != 0) {"));
		blocos.add(new Bloco(5, "print(“antecessor”);"));
		blocos.add(new Bloco(6, "int numero = 0;"));
		blocos.add(new Bloco(7, "print(“sucessor”);"));
		blocos.add(new Bloco(8, "}"));
		blocos.add(new Bloco(9, "print(“sucessor ”+ (numero+1) );"));
		blocos.add(new Bloco(10, "input(numero);"));
		
		addQuestao(
				"Faça um algoritmo para ler vários números inteiros positivos e imprimir o seu antecessor e sucessor respectivamente, até que seja informado o número 0. "+
				"Quando for informado o número 0 nada será impresso e o algoritmo termina.",
				"6-3-4-2-9-10-8 | 6-10-4-2-9-3-8", 2, TipoQuestao_Enum.WHILE, blocos);
		
	}	
	
//*** FASE 2 - DO_WHILE ***
	//CORRIGIDA
	private void Questao1_Fase2_DoWhile() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int x = 0;"));
		blocos.add(new Bloco(2, "do {"));
		blocos.add(new Bloco(3, "if (x%2 != 0) {"));
		blocos.add(new Bloco(4, "print(x+“\n”); }"));
		blocos.add(new Bloco(5, "x++;"));
		blocos.add(new Bloco(6, "} while(x<=10);"));
		blocos.add(new Bloco(7, "if (x%2 == 0) {"));
		blocos.add(new Bloco(8, "} while(x=10);"));
		
		addQuestao(
				"Arranje as linhas de um loop finito para que seja impresso o valor da variável x apenas quando for ímpar.",
				"1-2-3-4-5-6 | 1-2-5-3-4-6", 2, TipoQuestao_Enum.DO_WHILE, blocos);
	}
	
	//CORRIGIDA
	private void Questao2_Fase2_DoWhile() {
		List<Bloco> blocos = new ArrayList<>();
				
		blocos.add(new Bloco(1, "while"));
		blocos.add(new Bloco(2, "for"));
		blocos.add(new Bloco(3, "while e for"));
		blocos.add(new Bloco(4, "if"));
		blocos.add(new Bloco(5, "do ... while")); 
		blocos.add(new Bloco(6, "switch"));

		addQuestao(
				"A instução ______ difere dos outros laço porque o teste da condição é realizado no fim do corpo do laço e não antes, "+
				"como acontecia com os laços _____ e _____. Desta forma o corpo do laço _____ é executado pelo menos uma vez, enquanto nos laços _____ o corpo do laço pode nunca ser executado.",
				"5-1-2-5-3 | 5-2-1-5-3", 2, TipoQuestao_Enum.DO_WHILE, blocos);
	}
	
	//CORRIGIDA
	private void Questao3_Fase2_DoWhile() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int x = 50;"));
		blocos.add(new Bloco(2, "int y = 8;"));
		blocos.add(new Bloco(3, "x--;"));
		blocos.add(new Bloco(4, "y++;"));
		blocos.add(new Bloco(5, "} while(y <10);"));
		blocos.add(new Bloco(6, "} while( x > 48);"));
		blocos.add(new Bloco(7, "print(“GO HORSE!”);"));
		blocos.add(new Bloco(8, "do {"));
		
		addQuestao(
				"Organize o algoritmo para que a palavra “GO HORSE!” seja escrita 4 vezes.",
				"1-8-2-8-7-4-5-3-6 | 2-8-1-8-7-3-6-4-5 | 1-8-2-8-4-7-5-3-6 | 2-8-1-8-3-7-6-4-5", 2, TipoQuestao_Enum.DO_WHILE, blocos);
	}
	
	//todo falta corrigir essa questao
	private void Questao4_Fase2_DoWhile() {
		/*
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "do {"));
		blocos.add(new Bloco(2, "input(numero1);"));
		blocos.add(new Bloco(3, "int numero1 = 0, numero2 = 0;"));
		blocos.add(new Bloco(4, "} while(1);"));
		blocos.add(new Bloco(5, "int resultado = 0, multiplicacao = 0;"));
		blocos.add(new Bloco(6, "input(numero2);"));
		blocos.add(new Bloco(7, "}"));
		blocos.add(new Bloco(8, "print (“Informe o primeiro numero: ”);"));
		blocos.add(new Bloco(9, "print (“O resultado da multiplicacao é: ” + multiplicacao);"));
		blocos.add(new Bloco(10, "multiplicacao = numero1 * numero2;"));
		blocos.add(new Bloco(11, "multiplicacao = numero1 . numero2;"));
		blocos.add(new Bloco(12, "do (resultado = 1) {"));
		blocos.add(new Bloco(13, "input(resultado);"));
		blocos.add(new Bloco(14, "print (“Deseja realizar uma nova multiplicacao?”);"));
		blocos.add(new Bloco(15, "print (“Informe o segundo numero: ”);"));
		blocos.add(new Bloco(16, "} while(resultado == 1);"));
		
		addQuestao(
				"Roberto está trabalhando em um algoritmo para uma loja que utiliza apenas teclado numerico. "+
				"O algoritmo deve multiplicar 2 números e imprimir o resultado da multiplicacao. "+
				"Após informar o resultado da multiplicação, deve ser apresentada a seguinte pergunta: “Deseja realizar uma nova multiplicacao?”. "+
				"Se o usuário informar o número 1 será realizada uma nova multiplicacao. Caso contrario, o programa será encerrado. "+
				"Uma observação: Utilize a variavel “resultado” para armazenar o retorno da pergunta, "+
				"a variável “numero1” para receber o primeiro numero e “numero2” para receber o segundo. ",
				"3-5-1-8-2-15-6-10-9-14-13-16 | 3-5-1-15-6-8-2-10-9-14-13-16 | 5-3-1-8-2-15-6-10-9-14-13-16 | 5-3-1-15-6-8-2-10-9-14-13-16 ", 
				2, TipoQuestao_Enum.DO_WHILE, blocos);
		*/
	}
	
	//CORRIGIDA
	private void Questao5_Fase2_DoWhile() {
		List<Bloco> blocos = new ArrayList<>();
				
		blocos.add(new Bloco(1, "println(“\t0. Sair”);"));
		blocos.add(new Bloco(2, "println(“\t2. Ler o menu”);"));
		blocos.add(new Bloco(3, "do {"));
		blocos.add(new Bloco(4, "if (opcao == 0) {"));
		blocos.add(new Bloco(5, "println(“\t1. Ver o menu”);"));
		blocos.add(new Bloco(6, "input(opcao);"));
		blocos.add(new Bloco(7, "println(“\t\tMenu de opções:”);"));
		blocos.add(new Bloco(8, "println(“\n\n\n\n\n\n”);}"));
		blocos.add(new Bloco(9, "println(“\t5. Não li, pode repetir?”);"));
		blocos.add(new Bloco(10, "println(“\t3. Repetir o menu”);"));
		blocos.add(new Bloco(11, "} else {"));
		blocos.add(new Bloco(12, "} while (continuar);"));
		blocos.add(new Bloco(13, "println(“Programa finalizado.”);"));
		blocos.add(new Bloco(14, "println(“\t4. Tudo de novo”);"));
		blocos.add(new Bloco(15, "boolean continuar = true; int opcao;"));
		blocos.add(new Bloco(16, "continuar = false;"));
		
		addQuestao(
				"Usando DoWhile ordene o codigo a seguir para formar um menu de visualização",
				"15-3-7-5-2-10-14-9-1-6-4-16-13-11-8-12", 
				2, TipoQuestao_Enum.DO_WHILE, blocos);
	}
	
	//CORRIGIDA
	private void Questao6_Fase2_DoWhile() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "print(“8 x ” + n + “ = ” + (8 * n) + “\n”);"));
		blocos.add(new Bloco(2, "do {"));
		blocos.add(new Bloco(3, "} while (n <= 10);"));
		blocos.add(new Bloco(4, "int n = 1;"));
		blocos.add(new Bloco(5, "n++;"));
		
		addQuestao(
				"Imprima a tabuada de 8 de multiplicação",
				"4-2-1-5-3", 
				2, TipoQuestao_Enum.DO_WHILE, blocos);
	}	
	
	
	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		
		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);
		questaoDAO.adicionarQuestao(questao);
		
		return true;
	}
}