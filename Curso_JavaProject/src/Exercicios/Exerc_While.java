package Exercicios;

import java.util.Scanner;

public class Exerc_While {

	public static void main(String[] args) {


	// Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha incorreta informada,
	// escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
	// e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
		
		
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("DIGITE A SENHA: ");
		int senha = sc.nextInt();
		
		
		while( senha != 2002) {
			System.out.println("Senha Invalida, digite a senha novamente: ");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");
		
		
		System.out.println("******************************************************");
		
		
// *******************************************************************************************************************
		
		// Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
		// Escreva um algoritmo para ler o tipo de combust�vel abastecido codificado da seguinte forma:
		// (1.�lcool 2.Gasolina 3.Diesel 4.Fim).
		// Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4),
		// deve ser solicitado um novo c�digo (at� que seja v�lido). 
		// O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a mensagem:
		// "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme exemplo.
		
		// Em println BASE ENTRADA: 8,1,7,2,2,4
		// Em println BASE SA�DA: MUITO OBRIGADO, Alcool: 1, Gasolina: 2, Diesel: 0
		
		
		
		System.out.println("DIGITE O TIPO DE COMBUST�VEL (1,2,3 ou 4): ");

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		System.out.println("******************************************************");
		
		
// *******************************************************************************************************************
		
		
		// Escreva um aplicativo em Java mostra todos os n�meros �mpares de 1 at� 100.
		
		
		
		
		
		sc.close();
	}

}
