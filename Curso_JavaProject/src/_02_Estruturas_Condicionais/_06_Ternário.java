package _02_Estruturas_Condicionais;

import java.util.Scanner;

public class _06_Tern?rio {

	public static void main(String[] args) {
		
		
		// Express?o condicional TERN?RIA
		
		// TERN?RIO ? uma estrutura opcional ao if-else de quando se deseja decidir um VALOR com base em uma condi??o.
		// OU SEJA: 
		
		
		//SINTAXE:
		
		// ( condi??o ) ? valor_se_verdadeiro : valor_se_falso
		
		// ONDE: inicia pela condi??o/vari?vel entre parenteses, ? [interroga??o] que representa o SE SIM, o valor caso a condi??o 
		//       seja verdadeira, : [dois pontos] que representa o SE N?O e o valor caso a condi??o seja falsa
		
		// Exemplo estrutural
		
		// ( 2 > 4 ) ? 50 : 80   ----------> 80
		// ( 10 != 3 ) ? "Maria" : "Alex"   ----------> "Maria"
		
		
		
		//EXEMPLO PR?TICO
		
		// Escreva um programa que verifique a validade de uma senha fornecida pelo usu?rio. A senha v?lida ? o n? 1234. Devem ser
		// impressas a seguinte mensagem: ACESSO PERMITIDO, caso a senha seja v?lida e ACESSO NEGADO, caso n?o v?lida
		
		
				
		 int senha;
		
		 Scanner sc = new Scanner(System.in);

		 System.out.println("DIGITE A SENHA");
		 senha = sc.nextInt();
		
		 System.out.println((senha == 1234) ? "ACESSO PERMITIDO" : "ACESSO NEGADO" );
			
		
		 sc.close();

	}

}
