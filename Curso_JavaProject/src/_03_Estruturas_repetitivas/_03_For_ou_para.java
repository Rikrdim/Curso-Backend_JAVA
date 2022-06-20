package _03_Estruturas_repetitivas;

import java.util.Scanner;

public class _03_For_ou_para {

	public static void main(String[] args) {
		
		
		// A estrutura repetitiva FOR ou "para" é uma estrutura repetitiva de controle que repete um bloco de comandos, para um certo
		// para um certo intervalo de valores.
		
		// QUANDO USAR? :
		// Quando se sabe previamente a quantidade de repetições, ou intervalo de valores.
		
		//                SINTAXE                                               REGRA
																				
		// for( início ; condição ; incremento ) {           				Início:     Executa somente na primeira vez
		//	 comando1														Condição:   V: executa e volta
		//	 comando2																    F: pula fora
		// }															 	Incremento: Executa toda vez, depois de voltar
		
		
		//EXEMPLO PROPOSTO:
		
		// Fazer um programa que lê o valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N lidos
		// ENTRADA DE DADOS: 3 5 2 4
		// SAÍDA DE DADOS: 11
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0 ; i < N ; i = i + 1) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
		
		// COMENTÁRIO EXPLICATIVO: Diferente do While que repete a condição sem limite de vezes, no FOR, é definido uma quantidade 
		// limite que se pode ler. No caso do exemplo acima, foi definido que a condição irá ler apenas 3x na entrada de dados,
		// para retornar o resultado da soma das 3 outras entradas após a definição.
	}

}
