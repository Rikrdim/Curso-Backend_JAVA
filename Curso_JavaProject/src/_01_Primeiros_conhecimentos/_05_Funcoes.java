package _01_Primeiros_conhecimentos;

import java.util.Scanner;

public class _05_Funcoes {

	public static void main(String[] args) {
		
	/*
		As funções representam um processamento que possuem um significado
		
			* Math.sqrt(double)  		 - Calcular raiz quadrada de um valor  
			* System.out.println(String) - Função responsável por mostrar alguma coisa na tela
			 
			 [ Função: Math.sqrt  |  Argumento: double]
			 [ Função: System.out.println  |  Argumento: String ]
	*/

		//EXEMPLO EXPLICATIVO
		
		double x = Math.sqrt(25);
				
		System.out.println(x);

		
		System.out.println(" ");
		System.out.println("***************************************************");
		System.out.println(" ");
		
		
		//EXEMPLO EXPLICATIVO

		/* Fazer um programa para ler 3 números inteiros e mostrar na tela o maior deles */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		ShowResult(maior);            //Função que mostra o resultado, passando o valor "maior" e mostrar na tela
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {    // public: pra que fique disponível em outras classes  |  static: pra que possa ser chamada independente de criar um objeto  |  (int): Tipo de dado que a função retorna  |  (max(...)): definição do parâmetro de entrada

		int aux;
		
		if( x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;                // Return: Indicação do que precisa ser retornado, no caso, o valor da variável "aux"
	
	}
	
	public static void ShowResult(int value) {                     // Void: retorno de função vazia
	
		System.out.println("O maior valor é: " + value);
	}
}
