package _03_Estruturas_repetitivas;

import java.util.Scanner;
import java.util.Locale;

public class _04_Do_While_ou_fa�aEnquanto {

	public static void main(String[] args) {
		
		
		// A estrutura Do-while ou "fa�a Enquanto" � a menos utilizada das estruturas repetitivas, mas em alguns casos � a que se 
		// encaixa melhor ao problema.
		
		// O bloco de comandos executa pelo menos 1x, pois a condi��o � verificada no final.
		
		
		// 				SINTAXE										REGRA [ condi��o V = verdadeiro | condi��o F = falso ]
		
		//       do {												V: Volta
		//			comando1										F: Pula fora
		//			comando2
		//
		// 		} while( condi��o );
		
		
		
		// EXEMPLO PR�TICO
		
		// Fazer um programa para ler a temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usu�rio quer 
		// repetir (s/n). Caso o usu�rio digite "s", repetir o programa.
		
		//FORMULA:      9C
		//		   F =  --  + 32
		//               5
		
		// EXEMPLO: Digite a temperatura em Celsius: 30.0
		//			Equivalente em fahrenheit: 86.0
		//			Deseja repetir (s/n)? s
		//          .... [ repete o que est� acima ]
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
		
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
		
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while(resp != 'n');
		
		sc.close();

	}

}
