package Exercicios;

import java.util.Scanner;

public class Exerc_If_Else {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um n?mero inteiro, e depois dizer se este n?mero ? positivo ou negativo.
		
		Scanner sc = new Scanner(System.in);
		
		int prog;
		
		System.out.println("Digite o n?mero");
		prog = sc.nextInt();
		
		if(prog > 0){
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		//Fazer um programa para ler um n?mero inteiro e dizer se este n?mero ? par ou ?mpar.
		
		int prog1;
		
		System.out.println("Digite o n?mero");
		prog1 = sc.nextInt();
		
		if(prog1 % 2 == 0) {             //A forma de verificar se o n?mero ? par ou impar, usa o %2. Geralmente ? igualado a 0
			System.out.println("Par");
		}
		else {
			System.out.println("?mpar");
		}
		
				
		sc.close();
	
		}

}
