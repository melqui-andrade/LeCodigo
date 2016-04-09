import java.util.ArrayList;
import java.util.List;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class PopularTabelaQuestoes {

	public static void main(String[] args) {

		/*
		 * // Testando se a lista de blocos salva para uma questão e é retornada
		 * certo
		 * 
		 * QuestaoDAO dao = new QuestaoDAO();
		 * 
		 * Questao questao = dao.buscarQuestao(1); List<Bloco> blocos =
		 * questao.getBlocos(); System.out.println("Da questão 1: " +
		 * blocos.get(1).getDescricao() + " com id: " + blocos.get(1).getId());
		 * 
		 * Questao questao2 = dao.buscarQuestao(2); List<Bloco> blocos2 =
		 * questao2.getBlocos(); System.out.println("Da questão 2: " +
		 * blocos2.get(1).getDescricao() + " com id: " +
		 * blocos2.get(1).getId());
		 * 
		 */

		// Questão 01
		List<Bloco> blocos01 = new ArrayList<>();

		blocos01.add(new Bloco("1-int numero; String resposta;"));
		blocos01.add(new Bloco("2-if(numero){"));
		blocos01.add(new Bloco("3-resposta = “O número é par”;}"));
		blocos01.add(new Bloco("4-else{ resposta = “O número é impar”;}"));
		blocos01.add(new Bloco("5-if(numero%3==0){"));
		blocos01.add(new Bloco("6-if(numero%2==0){"));

		addQuestao(
				"Como deve-se verificar se um número qualquer é par ou impar? Organize blocos para estabelecer a ordem que considerar correta.",
				"1-6-3-4", 1, TipoQuestao_Enum.IF_ELSE, blocos01);

		// Questão 02
		List<Bloco> blocos02 = new ArrayList<>();

		blocos02.add(new Bloco("1-input(numeros[2]);"));
		blocos02.add(new Bloco("2-int maior = numeros[0];"));
		blocos02.add(new Bloco("3-input(numeros[1]);"));
		blocos02.add(new Bloco("4-if(numeros[1] > maior){"));
		blocos02.add(new Bloco("5-int numeros[3];"));
		blocos02.add(new Bloco("6-input(numeros[0]);"));
		blocos02.add(new Bloco("7-print(maior);"));
		blocos02.add(new Bloco("8-maior = numeros[1];"));
		blocos02.add(new Bloco("9-if(numero[2] > maior){"));
		blocos02.add(new Bloco("10-if(numero[2] > maior){"));
		blocos02.add(new Bloco("11-maior = numero[2];}"));
		blocos02.add(new Bloco("12-else{"));
		blocos02.add(new Bloco("13-maior = numero[2];}"));

		addQuestao(
				"Escreva um algoritmo para determinar qual o maior valor em uma lista que contém três números distintos.",
				"5-6-3-1-2-4-8-10-13-12-9-11-7 | 5-3-6-1-2-4-8-10-13-12-9-11-7 | 5-1-3-6-2-4-8-10-13-12-9-11-7 | 5-6-1-3-2-4-8-10-13-12-9-11-7",
				1, TipoQuestao_Enum.IF_ELSE, blocos02);

		// Questão 03
		List<Bloco> blocos03 = new ArrayList<>();

		blocos03.add(new Bloco("1-print(3);}"));
		blocos03.add(new Bloco("2-if (n1 == n2 && n1 == n3) {"));
		blocos03.add(new Bloco("3-print(2);"));
		blocos03.add(new Bloco("4-print(1);"));
		blocos03.add(new Bloco("5-} else {"));
		blocos03.add(new Bloco("6-input(n1); input(n2); input(n3);"));
		blocos03.add(new Bloco("7-} else if (n1 != n2 && n1 != n3) {"));

		addQuestao(
				"Faça um programa que leia 3 números inteiros e imprima um (e apenas um) dos seguintes números: \n1 - (Se todos os números são iguais)\n2 - (Se todos os números são diferentes) \n3 - (Se apenas dois números são iguais)",
				"6-2-4-7-3-5-1", 1, TipoQuestao_Enum.IF_ELSE, blocos03);

		// Questão 04
		List<Bloco> blocos04 = new ArrayList<>();

		blocos04.add(new Bloco("1-}"));
		blocos04.add(new Bloco("2-print(“Informe a idade:“);"));
		blocos04.add(new Bloco("3-input(profissao);"));
		blocos04.add(new Bloco("4-print(“Informe a profissao:“);"));
		blocos04.add(new Bloco("5-int idade;"));
		blocos04.add(new Bloco("6-print(“Passagem = 1,50“);"));
		blocos04.add(new Bloco("7-if (profissão == “estudante”) {"));
		blocos04.add(new Bloco("8-print(Passagem = 1,50);"));
		blocos04.add(new Bloco("9-else {"));
		blocos04.add(new Bloco("10-if ( (idade <= 7) ||  (idade >= 65) ) {"));
		blocos04.add(new Bloco("11-input(idade);"));
		blocos04.add(new Bloco("12-print(“Passagem = 3,00“);"));
		blocos04.add(new Bloco("13-if (profissão = “estudante”) {"));
		blocos04.add(new Bloco("14-input(estudante);"));
		blocos04.add(new Bloco("15-string profissao;"));
		blocos04.add(new Bloco("16-print (“Passagem gratuita”);"));

		addQuestao(
				"Mariana está querendo desenvolver um código para gerenciar as passagens de um ônibus coletivo. Para isto, ela precisa considerar que pessoas acima de 65 anos e abaixo de 7 anos não pagam passagem. E que os estudantes pagam meia-passagem. Desenvolva o código para imprimir o valor da passagem do ônibus, considerando que o valor da passagem inteira é 3,00. Se o passageiro não precisa pagar passagem imprima a mensagem “Passagem gratuita!”",
				"5-15-2-11-4-3-10-16-1-9-7-6-1-9-12-1-1 | 5-15-4-3-2-11-10-16-1-9-7-6-1-9-12-1-1 | 15-5-2-11-4-3-10-16-1-9-7-6-1-9-12-1-1 | 15-5-4-3-2-11-10-16-1-9-7-6-1-9-12-1-1",
				1, TipoQuestao_Enum.IF_ELSE, blocos04);

		// Questão 05
		List<Bloco> blocos05 = new ArrayList<>();

		blocos05.add(new Bloco("1-input(idade);"));
		blocos05.add(new Bloco("2-}"));
		blocos05.add(new Bloco("3-print(”Você pode doar sangue”);"));
		blocos05.add(new Bloco("4-print(”Você não pode doar sangue”);"));
		blocos05.add(new Bloco("5-if( (idade >= 18) && (idade <=67)){"));
		blocos05.add(new Bloco("6-else{"));
		blocos05.add(new Bloco("7-int idade;"));

		addQuestao(
				"Para doar sangue é necessário ter entre 18 e 67 anos. Faça um código que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.",
				"7-1-5-3-2-6-4-2", 1, TipoQuestao_Enum.IF_ELSE, blocos05);

		// Questão 06
		List<Bloco> blocos06 = new ArrayList<>();

		blocos06.add(new Bloco("1-String lugar; String sigla;"));
		blocos06.add(new Bloco("2-switch(lugar){"));
		blocos06.add(new Bloco("3-case “Brasil” :"));
		blocos06.add(new Bloco("4-sigla = “BR”;"));
		blocos06.add(new Bloco("5-case “Nordeste” :"));
		blocos06.add(new Bloco("6-sigla = “NE”;"));
		blocos06.add(new Bloco("7-case “Paraíba” :"));
		blocos06.add(new Bloco("8-sigla = “PB”;"));
		blocos06.add(new Bloco("9-}"));
		blocos06.add(new Bloco("10-switch(sigla){"));
		blocos06.add(new Bloco("11-case “PB” :"));
		blocos06.add(new Bloco("12-lugar = “Paraíba”;"));
		blocos06.add(new Bloco("13-case “BR” :"));
		blocos06.add(new Bloco("14-lugar = “Brasil”;"));
		blocos06.add(new Bloco("15-case “NE” :"));
		blocos06.add(new Bloco("16-lugar = “Nordeste”;"));

		addQuestao(
				"A variável “lugar” pode possuir os valores “Brasil”, “Nordeste” ou “Paraíba”. Garanta que a variável “sigla” corresponda ao lugar informado.",
				"1-2-3-4-5-6-7-8-9 | 1-2-3-4-7-8-5-6-9 | 1-2-5-6-3-4-7-8-9 | 1-2-5-6-7-8-3-4-9 | 1-2-7-8-3-4-5-6-9 | 1-2-7-8-5-6-3-4-9",
				1, TipoQuestao_Enum.SWITCH_CASE, blocos06);

		// Questão 07
		List<Bloco> blocos07 = new ArrayList<>();

		blocos07.add(new Bloco("1-print(“Quarta-feira“); break;"));
		blocos07.add(new Bloco("2-case 7:"));
		blocos07.add(new Bloco("3-print(“Sábado“); break;"));
		blocos07.add(new Bloco("4-case 2:"));
		blocos07.add(new Bloco("5-print(“Terça-feira“); break;"));
		blocos07.add(new Bloco("6-case 6:"));
		blocos07.add(new Bloco("7-case 4:"));
		blocos07.add(new Bloco("8-print(“Domingo“); break;"));
		blocos07.add(new Bloco("9-default:"));
		blocos07.add(new Bloco("10-switch (diaDaSemana) {"));
		blocos07.add(new Bloco("11-print(“Este não é um dia válido!“);}"));
		blocos07.add(new Bloco("12-case 3:"));
		blocos07.add(new Bloco("13-case 5:"));
		blocos07.add(new Bloco("14-int diaDaSemana = 5;"));
		blocos07.add(new Bloco("15-case 1:"));
		blocos07.add(new Bloco("16-print(“Sexta-feira“); break;"));
		blocos07.add(new Bloco("17-print(“Quinta-feira“); break;"));
		blocos07.add(new Bloco("18-print(“Segunda-feira“); break;"));

		addQuestao("Ordene os dias da semana usando um Switch Case e depois imprima a quinta-feira.",
				"14-10-15-8-4-18-12-5-7-1-13-17-6-16-2-3-9-11", 1, TipoQuestao_Enum.SWITCH_CASE, blocos07);

		// Questão 08
		List<Bloco> blocos08 = new ArrayList<>();

		blocos08.add(new Bloco("1-case 4 :  valor_total = (3,50 * quantidade);"));
		blocos08.add(new Bloco("2-input(numero_produto);"));
		blocos08.add(new Bloco("3-int quantidade = 0;"));
		blocos08.add(new Bloco("4-case 1 :  valor_total = (2,00 * quantidade);"));
		blocos08.add(new Bloco("5-print(“Informe o código do produto”);"));
		blocos08.add(new Bloco("6-input(codigo);"));
		blocos08.add(new Bloco("7-}"));
		blocos08.add(new Bloco("8-case 3 :  valor_total = (2,50 * quantidade);"));
		blocos08.add(new Bloco("9-print(“Informe a quantidade do produto”);"));
		blocos08.add(new Bloco("10-case (1,2,3,4) :  valor_total = (2,00 * quantidade);"));
		blocos08.add(new Bloco("11-int codigo = 0;"));
		blocos08.add(new Bloco("12-input(quantidade);"));
		blocos08.add(new Bloco("13-float valor_total = 0;"));
		blocos08.add(new Bloco("14-switch(codigo) {"));
		blocos08.add(new Bloco("15–print(“Valor Total = “+valor_total);"));
		blocos08.add(new Bloco("16-switch ()"));
		blocos08.add(new Bloco("17-case 2 :  valor_total = (3,00 * quantidade);"));
		blocos08.add(new Bloco("18-print(“Valor  Total= “ + valor_total);"));
		blocos08.add(new Bloco("19-string codigo = 0;"));

		addQuestao(
				"A lanchonete de Marli está com um sistema novo e codificou todos os seus produtos para agilizar o atendimento. \nA tabela dos produtos é a seguinte: \nProduto -  Código - Valor \nPastel - 1- 2,00 \nCachorro-Quente - 2 - 3,00 \nCoxinha - 3 - 2,50 \nRefrigerante - 4 - 3,50 \n\nCrie um algoritmo que leia o código de um produto e a quantidade e imprima o  valor total",
				"11-3-5-6-9-12-14-4-17-8-1-7-18 | 3-11-5-6-9-12-14-4-17-8-1-7-18", 1, TipoQuestao_Enum.SWITCH_CASE,
				blocos08);

		// Questão 09
		List<Bloco> blocos09 = new ArrayList<>();

		blocos09.add(new Bloco("1-ordenação"));
		blocos09.add(new Bloco("2-decisão"));
		blocos09.add(new Bloco("3-if/else"));
		blocos09.add(new Bloco("4-resolvido"));
		blocos09.add(new Bloco("5-inserir"));
		blocos09.add(new Bloco("6-resolvido"));
		blocos09.add(new Bloco("7-switch/case"));
		blocos09.add(new Bloco("8-variável"));

		addQuestao(
				"A estrutura switch/case é uma estrutura para problemas de 1______. Quando uma 2 ______ possui várias condições a serem testadas, o uso do 3 ______ torna o código mais legível. Decidir que mensagem mostrar após o usuário 4 ______ um valor no programa, é um exemplo comum de problema que pode ser 5 ______ com switch/case. Já decidir qual o maior valor em uma lista de tamanho variável é um problema em que a estrutura 6 ______ fica melhor empregada.",
				"2-8-7-5-4-3", 1, TipoQuestao_Enum.SWITCH_CASE, blocos09);

		// Questão 10
		List<Bloco> blocos10 = new ArrayList<>();

		blocos10.add(new Bloco("1-}"));
		blocos10.add(new Bloco("2-case 3:"));
		blocos10.add(new Bloco("3-print(“dois“);"));
		blocos10.add(new Bloco("4-int n;"));
		blocos10.add(new Bloco("5-case 1:"));
		blocos10.add(new Bloco("6-input(n);"));
		blocos10.add(new Bloco("7-print(“três“);"));
		blocos10.add(new Bloco("8-print(“um“);"));
		blocos10.add(new Bloco("9-break;"));
		blocos10.add(new Bloco("10-case 2:"));
		blocos10.add(new Bloco("11-switch(n){"));
		blocos10.add(new Bloco("13-default:"));

		addQuestao(
				"Faça com que o código leia um número de 1 à 3, e escreva este número por extenso.",
				" 4-6-11-5-8-10-3-2-7-13-9-1", 1, TipoQuestao_Enum.SWITCH_CASE, blocos10);

	}

	public static boolean addQuestao(String descricao, String resposta, int fase, TipoQuestao_Enum tipoQuestao,
			List<Bloco> blocos) {
		QuestaoDAO dao = new QuestaoDAO();

		Questao questao = new Questao(descricao, resposta, fase, tipoQuestao, blocos);

		dao.adicionarQuestao(questao);
		return true;
	}
}
