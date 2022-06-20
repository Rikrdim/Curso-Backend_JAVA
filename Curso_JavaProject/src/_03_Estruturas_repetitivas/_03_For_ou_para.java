package _03_Estruturas_repetitivas;

import java.util.Scanner;

public class _03_For_ou_para {

	public static void main(String[] args) {
		
		
		// A estrutura repetitiva FOR ou "para" � uma estrutura repetitiva de controle que repete um bloco de comandos, para um certo
		// para um certo intervalo de valores.
		
		// QUANDO USAR? :
		// Quando se sabe previamente a quantidade de repeti��es, ou intervalo de valores.
		
		//                SINTAXE                                               REGRA
																				
		// for( in�cio ; condi��o ; incremento ) {           				In�cio:     Executa somente na primeira vez
		//	 comando1														Condi��o:   V: executa e volta
		//	 comando2																    F: pula fora
		// }															 	Incremento: Executa toda vez, depois de voltar
		
		
		//EXEMPLO PROPOSTO:
		
		// Fazer um programa que l� o valor inteiro N e depois N n�meros inteiros. Ao final, mostra a soma dos N lidos
		// ENTRADA DE DADOS: 3 5 2 4
		// SA�DA DE DADOS: 11
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0 ; i < N ; i = i + 1) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
		
		// COMENT�RIO EXPLICATIVO: Diferente do While que repete a condi��o sem limite de vezes, no FOR, � definido uma quantidade 
		// limite que se pode ler. No caso do exemplo acima, foi definido que a condi��o ir� ler apenas 3x na entrada de dados,
		// para retornar o resultado da soma das 3 outras entradas ap�s a defini��o.
	}

}
