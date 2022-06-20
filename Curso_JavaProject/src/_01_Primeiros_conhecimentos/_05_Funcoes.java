package _01_Primeiros_conhecimentos;

import java.util.Scanner;

public class _05_Funcoes {

	public static void main(String[] args) {
		
	/*
		As fun��es representam um processamento que possuem um significado
		
			* Math.sqrt(double)  		 - Calcular raiz quadrada de um valor  
			* System.out.println(String) - Fun��o respons�vel por mostrar alguma coisa na tela
			 
			 [ Fun��o: Math.sqrt  |  Argumento: double]
			 [ Fun��o: System.out.println  |  Argumento: String ]
	*/

		//EXEMPLO EXPLICATIVO
		
		double x = Math.sqrt(25);
				
		System.out.println(x);

		
		System.out.println(" ");
		System.out.println("***************************************************");
		System.out.println(" ");
		
		
		//EXEMPLO EXPLICATIVO

		/* Fazer um programa para ler 3 n�meros inteiros e mostrar na tela o maior deles */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		ShowResult(maior);            //Fun��o que mostra o resultado, passando o valor "maior" e mostrar na tela
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {    // public: pra que fique dispon�vel em outras classes  |  static: pra que possa ser chamada independente de criar um objeto  |  (int): Tipo de dado que a fun��o retorna  |  (max(...)): defini��o do par�metro de entrada

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
		
		return aux;                // Return: Indica��o do que precisa ser retornado, no caso, o valor da vari�vel "aux"
	
	}
	
	public static void ShowResult(int value) {                     // Void: retorno de fun��o vazia
	
		System.out.println("O maior valor �: " + value);
	}
}
