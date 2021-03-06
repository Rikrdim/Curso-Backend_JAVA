package _03_Estruturas_repetitivas;

import java.util.Scanner;

public class _02_While_ou_enquanto {

	public static void main(String[] args) {


		// O WHILE ( ou Enquanto) ? uma estrutura de controle que repete um bloco de comandos enquanto uma condi??o ? verdadeira.
		
		// QUANDO USAR: Quando n?o se sabe previamente a quantidade de repeti??es que ser? realizada.
		
		// Esta estrutura ? parecida com o IF, mas difere que ela vai executar o bloco de comando e voltar pra condi??o WHILE.
		
		
		// SINTAXE                                       REGRA
		
		// while ( condi??o ) {                          V(verdadeiro): Executa e volta
		//		comando1							     F(falso):      pula fora
		//		comando2
		// }
		
		// Ou seja, enquanto a condi??o do WHILE for verdadeira, a leitura do bloco de comandos, sempre volta a ler a condi??o WHILE
		//			caso a condi??o do WHILE passe a ser falsa na leitura do bloco de comandos, esta condi??o ir? parar de ser lida
		//				e vai avan?ar pra linha seguinte, fora desta condi??o WHILE. 
		
		
		//EXEMPLO PR?TICO
		
		// Fazer um programa que leia os n?meros inteiros at? que o ZERO (0) seja lido. E ao final, mostra a soma dos n?meros lidos.
		
		// COMO FAZER comentado:
		
		// import java.util.Scanner;
		//
		// public class main {
		// 		public static void main(String[] args) {
		//
		//			Scanner sc = new Scanner(System.in);
		//			
		//			int x = sc.nextInt();
		//
		//			int soma = 0;				1		OU SEJA1: A cria??o da vari?vel soma recebendo 0 ? o par?metro de inicia??o do calculo. E o 0 ? o elemento neutro
		//			while( x != 0 ) {           2       OU SEJA2: Enquanto o x for diferente de 0, a leitura do bloco de comandos sempre volta a ler a condi??o WHILE 
		//		        soma = soma + x;        3              2: Sempre que passar pelo WHILE e ler que o X ? diferente de 0 significa que foi digitado o N? e este N? vai entrar na soma    	
		//				x = sc.nextInt();				OU SEJA3: Dentro da condi??o WHILE e antes da leitura da vari?vel par?metro ? necess?rio ter a express?o de soma dos n?meros diferentes de 0
		//
		//			}
		//			System.out.println(soma);
		//
		//			sc.close();
		
		// EXEMPLO EXECUT?VEL		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 n?meros diferentes de 0(zero): ");

		int x = sc.nextInt();
		
		int soma = 0;
		while ( x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println("A soma dos n?meros digitados ?: " + soma);
		
		sc.close();
		

	}

}
