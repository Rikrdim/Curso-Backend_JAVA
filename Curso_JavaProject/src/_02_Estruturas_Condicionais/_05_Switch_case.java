package _02_Estruturas_Condicionais;

import java.util.Scanner;

public class _05_Switch_case {

	public static void main(String[] args) {
		
		// A estrutura switch-case ? usada quando se tem v?rias op??es de fluxo a serem tratadas com base no valor de uma vari?vel,
		// ao inv?s de v?rias estruturas if-else encadeadas.
		
		// Ou seja, o Switch-case funciona parecido como o if e else, por?m ele ? baseado no valor de uma express?o, que vir?
		// entre parentese. No caso, a vari?vel a ser utilizada. Conforme exemplo abaixo
		
		
		// Exemplo estrutural 
		
				// switch ( express?o/vari?vel ) {
				// case valor1:
				// 		comando1
				// 		comando2
				// 		break;  ----------->     No uso do switch o "BREAK" ao final de cada opera??o ? obrigat?rio.
				// case valor2:
				// 		comando3
				// 		comando4
				// 		break;
				// 
				// default:      ----------|->   Default funciona como estabelecimento de valor padr?o, caso todas as verifica??es
				// 		comando5           |-->   de case tenham falhado. OU SEJA, qualquer valor, diferente dos valores padr?o,
				// 		comando6           |-->   estabelecido anterior ao default, ser? incorreto, ou invalido, conforme mensagem
				// 		break;             |-->   usada no exemplo pr?tico.
				// 
				// }
		
		
		// EXEMPLO PR?TICO
		
		// Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana ( sendo 1= domingo, 2= segunda e 
		// assim por diante). Escreva na tela o dia da semana correspondente.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n?mero do dia da semana");
		int x = sc.nextInt();
		String dia;
		
		switch (x) {                     // O (x) ? o valor da express?o 
		case 1:
			dia = "Domingo";
			break;                       
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter?a";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:                           
			dia = "Valor inv?lido";        	
			break;                             
		}                                       
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
