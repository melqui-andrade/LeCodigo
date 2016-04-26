package com.br.uepb.dump;


import java.util.ArrayList;
import java.util.List;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class PopularTabelaQuestoes3 {

	public void popularQuestoes_Fase3() {
		//FASE 3 - TROCA VARIAVEIS
		Questao1_Fase3_AtribicaoVar();
		Questao2_Fase3_AtribicaoVar();
		Questao3_Fase3_AtribicaoVar();
		Questao4_Fase3_AtribicaoVar();
		
		//FASE 3 - ORDENACAO
		Questao1_Fase3_Ordenacao();
		Questao3_Fase3_Ordenacao();
		Questao4_Fase3_Ordenacao();
		Questao5_Fase3_Ordenacao();
		
		//FASE 3 - FUNCAO
		Questao1_Fase3_Funcao();
		Questao4_Fase3_Funcao();
		Questao5_Fase3_Funcao();		
	}

//*** FASE 3 - TROCA VARIAVEIS ***
	//CORRIGIDA
	private void Questao1_Fase3_AtribicaoVar() {
		List<Bloco> blocos = new ArrayList<>();
			  
		blocos.add(new Bloco(1, "float A;"));
		blocos.add(new Bloco(2, "C=A;"));
		blocos.add(new Bloco(3, "}"));
		blocos.add(new Bloco(4, "float C;"));
		blocos.add(new Bloco(5, "input(B);"));
		blocos.add(new Bloco(6, "A=B;"));
		blocos.add(new Bloco(7, "input(A);"));
		blocos.add(new Bloco(8, "print(“Inserir número A: ”);"));
		blocos.add(new Bloco(9, "B=C;"));
		blocos.add(new Bloco(10, "input(B);"));
				  
		addQuestao(
				"Elaborar um programa para receber valores, do usuário, utilizando as variáveis “A” e “B”. "+
				"Após isto, o programa, utilizando-se de uma 3ª variável “C”, deverá trocar o conteúdo das variáveis “A” e “B”. "+
				"Depois imprima o seguinte texto com o valor das variáveis “O valor de A é 'ValorA' e o valor de B é 'ValorB'",
				"1-5-4-8-7-3-10-2-6-9 |  5-1-4-8-7-3-10-2-6-9 | 5-4-1-8-7-3-10-2-6-9 |  4-1-5-8-7-3-10-2-6-9 | 1-4-5-8-7-3-10-2-6-9", 
				3, TipoQuestao_Enum.TROCA_VARIAVEIS, blocos);
	}

	//CORRIGIDA
	private void Questao2_Fase3_AtribicaoVar() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "troca = aluno1;"));
		blocos.add(new Bloco(2, "troca = aluno3;"));
		blocos.add(new Bloco(3, "aluno2 = aluno1;"));
		blocos.add(new Bloco(4, "int troca = 0;"));
		blocos.add(new Bloco(5, "aluno2 = aluno3;"));
		blocos.add(new Bloco(6, "int aluno1, aluno2, aluno3;"));
		blocos.add(new Bloco(7, "print(“Aluno1 = ”+aluno1+“ | Aluno2 = ”+aluno2+“ | Aluno3 = ”+aluno3);"));
		blocos.add(new Bloco(8, "print(“Aluno1 = ”+aluno2+“ | Aluno2 = ”+“ | Aluno3 = ”+aluno3);"));
		blocos.add(new Bloco(9, "aluno3 = aluno1;"));
		blocos.add(new Bloco(10, "int troca = aluno1 + aluno2 + aluno3;"));
		blocos.add(new Bloco(11, "aluno1 = aluno3;"));
		blocos.add(new Bloco(12, "int aluno1 = 9, aluno2 = 5, aluno3 = 7;"));
		blocos.add(new Bloco(13, "aluno1 = aluno2;"));
		blocos.add(new Bloco(14, "aluno1 = troca;"));
		blocos.add(new Bloco(15, "troca = aluno2;"));
		blocos.add(new Bloco(16, "aluno3 = troca;"));
		blocos.add(new Bloco(17, "aluno2 = troca;"));
				  
		addQuestao(
				"Descobriram que as notas de três alunos de uma determinada turma foram trocadas. "+
				"As notas alteradas dos alunos são as seguintes: aluno1=9, aluno2=5, aluno3=7. "+
				"Faça um algoritmo para trocar as notas dos alunos utilizando o seguinte critério: aluno1=aluno3, aluno2=aluno1 e aluno3=aluno2. "+
				"Ao final do algoritmo imprima as notas dos alunos da seguinte forma: “Aluno1 = X | Aluno2 = Y | Aluno3 = Z”. "+
				"Onde X, Y e Z são as respetivas notas dos alunos. Observação: utilize a variavel auxiliar “troca” para alterar os valores entre as variáveis.",				
				"4-12-1-13-5-16-7 | 12-4-1-13-5-16-7 | 4-12-15-5-9-14-7 | 12-4-15-5-9-14-7 | 4-12-2-9-13-17-7 | 12-4-2-9-13-17-7", 
				3, TipoQuestao_Enum.TROCA_VARIAVEIS, blocos);
	}

	//CORRIGIDA
	private void Questao3_Fase3_AtribicaoVar() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "String minhaLista[] = {“Biscoito”, “Pão”, “Café”, “Açúcar”, “Manteiga”};"));
		blocos.add(new Bloco(2, "String acumuladorDeItem;"));
		blocos.add(new Bloco(3, "int indice = 2;"));
		blocos.add(new Bloco(4, "acumuladorDeItem = minhaLista[indice];"));
		blocos.add(new Bloco(5, "minhaLista[indice] = minhaLista[4];"));
		blocos.add(new Bloco(6, "minhaLista[4] = acumuadorDeItem;"));
		blocos.add(new Bloco(7, "for(int contador = 0; contador<5; contador+=1){"));
		blocos.add(new Bloco(8, "print(minhaLista[contador]+ “ ”);"));
		blocos.add(new Bloco(9, "}"));
		blocos.add(new Bloco(10, "print(minhaLista[indice]+ “ ”);"));
		blocos.add(new Bloco(11, "for(int contador = 1; contador<6; contador++){"));
		blocos.add(new Bloco(12, "int aluno1 = 9, aluno2 = 5, aluno3 = 7;"));
		blocos.add(new Bloco(13, "aluno1 = aluno2;"));
		blocos.add(new Bloco(14, "aluno1 = troca;"));
		blocos.add(new Bloco(15, "troca = aluno2;"));
		blocos.add(new Bloco(16, "aluno3 = troca;"));
		blocos.add(new Bloco(17, "aluno2 = troca;"));
				  
		addQuestao(
				"Imagine que você possui uma lista de compras com 5 itens ordenados de acordo com sua prioridade.<br />"+
				"<b>Os itens são: Biscoito, Pão, Café, Açúcar e Manteiga;</b><br />"+
				"Um amigo pede para que você compre os mesmos itens para ele, mas como não sabe o custo da compra e possui pouco dinheiro, modifica a lista de acordo com sua prioridade.<br />"+
				"<b>A lista que ele pede é: Biscoito, Pão, Manteiga, Açúcar e Café.</b><br /><br />"+
				"Organize o código a seguir para que sua lista de compras seja alterada para atender o desejo de seu amigo, e mostre a lista com os itens alterados.<br />",				
				"1-2-3-4-5-6-7-8-9 | 2-1-3-4-5-6-7-8-9 | 3-1-2-4-5-6-7-8-9 | 1-3-2-4-5-6-7-8-9 | 2-3-1-4-5-6-7-8-9 | 3-2-1-4-5-6-7-8-9", 
				3, TipoQuestao_Enum.TROCA_VARIAVEIS, blocos);
	}
	
	//CORRIGIDA
	private void Questao4_Fase3_AtribicaoVar() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "print(“x = ”+ x +“- y = ”+y);"));
		blocos.add(new Bloco(2, "int x = 2; y = 5;"));
		blocos.add(new Bloco(3, "x = y - x;"));
		blocos.add(new Bloco(4, "y = y - x;"));
		blocos.add(new Bloco(5, "y = x + y;"));
					  
		addQuestao(
				"As variáveis a seguir tem os seguintes valores X = 2 e Y = 5. "+
				"Organize o algoritmos para trocar o valor dessas variáveis imprimindo “x = 5 - y = 2”",				
				"2-5-3-4-1", 3, TipoQuestao_Enum.TROCA_VARIAVEIS, blocos);
	}
	
	//*** FASE 3 - ORDENACAO ***
	//CORRIGIDA
	private void Questao1_Fase3_Ordenacao() {
		List<Bloco> blocos = new ArrayList<>();
			
		blocos.add(new Bloco(1, "aux = num[i];"));
		blocos.add(new Bloco(2, "if (num[j] < num[min])"));
		blocos.add(new Bloco(3, "int aux;"));
		blocos.add(new Bloco(4, "int i, j, min;"));
		blocos.add(new Bloco(5, "min = j; }"));
		blocos.add(new Bloco(6, "min = i;"));
		blocos.add(new Bloco(7, "for (i = 0; i < (tam-1); i++) {"));
		blocos.add(new Bloco(8, "num[min] = aux;} }"));
		blocos.add(new Bloco(9, "for (j = (i+1); j < tam; j++) {"));
		blocos.add(new Bloco(10, "if (i != min) {"));
		blocos.add(new Bloco(11, "num[i] = num[min];"));
					  
		addQuestao(
				"Maria, uma estudante de estatística, recebeu uma lista de números aleatórios. Ela quer saber qual a mediana da lista. Para saber isso ela deverá ordenar os números e depois pegar o elemento do meio. Mas como Maria não quer fazer a ordenação manualmente, ela chamou um amigo de computação. "+
				"E agora, se fosse você como faria? Ordene a lista com o método de Insertion Sort.<br /> <br />"+
				"A ordenação por seleção ou selection sort é um algoritmo de ordenação baseado em se passar sempre o menor valor do vetor para a primeira posição, depois o de segundo menor valor para a segunda posição, "+
				"e assim é feito sucessivamente com os (n-1) elementos restantes, até os últimos dois elementos.<br />"+
				"<br />Lista: 4 | 6 | 9 | 0 | 3 | 1 | 10 | 2 | 5 | 7 | 8",
				"4-3-7-6-9-2-5-10-1-11-8", 3, TipoQuestao_Enum.ORDENACAO_SIMPLES, blocos);
	}

	//CORRIGIDA
	private void Questao3_Fase3_Ordenacao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "String nomes[200];"));
		blocos.add(new Bloco(2, "String palavraMenor, aux;"));
		blocos.add(new Bloco(3, "for (int i=0; i<nomes.length-1; i++) {"));
		blocos.add(new Bloco(4, "for (int j=i+1;j<nomes.length; j++) {"));
		blocos.add(new Bloco(5, "if (nomes[i].length() < nomes[j].length()) {"));
		blocos.add(new Bloco(6, "palavraMenor=nomes[i];"));
		blocos.add(new Bloco(7, "} else {"));
		blocos.add(new Bloco(8, "palavraMenor=nomes[j];"));
		blocos.add(new Bloco(9, "} for(int x=0; x<palavraMenor.length(); x++) {"));
		blocos.add(new Bloco(10, "if (nomes[i].charAt(x)>nomes[j].charAt(x)) {"));
		blocos.add(new Bloco(11, "aux = nomes[i];"));
		blocos.add(new Bloco(12, "nomes[i] = nomes[j];"));
		blocos.add(new Bloco(13, "nomes[j] = aux; break;}"));
		blocos.add(new Bloco(14, "if (nomes[i].charAt(x)<nomes[j].charAt(x)){ break; }"));
		blocos.add(new Bloco(15, "} } }"));
		blocos.add(new Bloco(16, "for (int j=1;j<nomes.length; j++) {"));
						  
		addQuestao(
				"Como fazer para ordenar alfabeticamente uma lista com centenas de nomes? É simples, basta implementar um algoritmo que faça a ordenação. "+
				"Talvez a implementação do algoritmo não seja tão simples. Vamos lá, o código a seguir deverá ser capaz de fazer a ordenação. "+
				"Suponha que a variavel “nomes” já possua 200 nomes.",				
				"1-2-3-4-5-6-7-8-9-10-11-12-13-14-15 | 2-1-3-4-5-6-7-8-9-10-11-12-13-14-15", 3, TipoQuestao_Enum.ORDENACAO_SIMPLES, blocos);
	}
	
	//CORRIGIDA
	private void Questao4_Fase3_Ordenacao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "selecao(int n, int v[]){"));
		blocos.add(new Bloco(3, "x = v[i];"));
		blocos.add(new Bloco(4, "v[min] = x;"));
		blocos.add(new Bloco(5, "v[i] = v[min];"));
		blocos.add(new Bloco(6, "min = i;"));
		blocos.add(new Bloco(7, "min = j;"));
		blocos.add(new Bloco(8, "for (i = 0; i < n-1; ++i) {"));
		blocos.add(new Bloco(9, "for (j = i+1; j < n; ++j){"));
		blocos.add(new Bloco(10, "if (v[j] < v[min]){"));
		blocos.add(new Bloco(11, "int i, j, min, x;"));
							  
		addQuestao(
				"Crie um algoritmo para ordenar uma lista de tamanho n qualquer por seleção",				
				"2-11-8-6-9-10-7-1-1-3-5-4-1-1", 3, TipoQuestao_Enum.ORDENACAO_SIMPLES, blocos);
	}
	
	//CORRIGIDA
	private void Questao5_Fase3_Ordenacao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "int v[3];"));
		blocos.add(new Bloco(2, "for (int j=0; j<3-1; j++) {"));
		blocos.add(new Bloco(3, "int i, j, auxiliar;"));
		blocos.add(new Bloco(4, "if (v[j]>v[j+1]) {"));
		blocos.add(new Bloco(5, "for (int i=0; i<3; i++){"));
		blocos.add(new Bloco(6, "v[j] = v[j+1];"));
		blocos.add(new Bloco(7, "auxiliar = v[j];"));
		blocos.add(new Bloco(8, "v[j+1] = auxiliar;"));
		blocos.add(new Bloco(9, "}"));
								  
		addQuestao(
				"Crie um algoritmo para ordenar uma lista de 3 elementos",				
				"1-3-5-2-4-7-6-8-9-9-9", 3, TipoQuestao_Enum.ORDENACAO_SIMPLES, blocos);
	}
	
	//CORRIGIDA
	private void Questao1_Fase3_Funcao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "return real; }"));
		blocos.add(new Bloco(2, "int real = dollar / 3.50;"));
		blocos.add(new Bloco(3, "float transformarDollarReal(float dollar) {"));
		blocos.add(new Bloco(4, "float real = dollar / 3.50;"));
		blocos.add(new Bloco(5, "float real;"));		
								  
		addQuestao(
				"Jussara sempre vai ao EUA, todas as vezes ela faz comprinhas. Mas com o dóllar alto ela quer um aplicativo que faça a transformação do dollar para o real."+
				"A atual contação do dóllar está valendo 3.50. Crie uma função que faça a transformar.",				
				"3-4-1", 3, TipoQuestao_Enum.FUNCOES, blocos);
	}
	
	//CORRIGIDA
	private void Questao4_Fase3_Funcao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "}"));
		blocos.add(new Bloco(2, "if (n == 0) {"));
		blocos.add(new Bloco(3, "if (n == 1) {"));
		blocos.add(new Bloco(4, "fibonacci(int n) {"));
		blocos.add(new Bloco(5, "return 0;"));
		blocos.add(new Bloco(6, "return 1;"));
		blocos.add(new Bloco(7, "return  fibonacci(n-1) + fibonacci(n-2);"));
								  
		addQuestao(
				"Construa uma função que retorne o elemento da posição N na sequência de fibonacci.",				
				"4-2-5-1-3-6-1-7-1 | 4-3-6-1-2-5-1-7-1", 3, TipoQuestao_Enum.FUNCOES, blocos);
	}
	
	//CORRIGIDA
	private void Questao5_Fase3_Funcao() {
		List<Bloco> blocos = new ArrayList<>();
		
		blocos.add(new Bloco(1, "troca(int v[], int i, int j) {"));
		blocos.add(new Bloco(2, "v[j]= aux;"));
		blocos.add(new Bloco(3, "v[i]=v[j];"));
		blocos.add(new Bloco(4, "aux = 'a';"));
		blocos.add(new Bloco(5, "int aux = v[i];"));
		blocos.add(new Bloco(6, "}"));
		blocos.add(new Bloco(7, "j=j+1;"));
		blocos.add(new Bloco(8, "i=i+1;"));
		blocos.add(new Bloco(9, "return v[];"));
								  
		addQuestao(
				"Faça uma função que troque duas variáveis.",				
				"1-5-3-2-6-9", 3, TipoQuestao_Enum.FUNCOES, blocos);
	}	
	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();

		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);
		questaoDAO.adicionarQuestao(questao);
		
		return true;
	}
}
