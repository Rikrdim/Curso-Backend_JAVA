package _01_Primeiros_conhecimentos;

import java.util.Scanner;

public class _03_Entrada_de_dados {

	public static void main(String[] args) {
		
		// OBSERVA??O MASTER: Para fazer o System.out.println(); de forma mais eficiente, digita:
		
		//Sysout e aperta Ctlr + barra de espa?o que o compilador auto completa. 
		
		
		
//====================================================================================================================
	
		//Para ser feito a entrada de dados, ? necess?rio criar um objeto do tipo "Scanner", da forma abaixo:
		
		
						//------   Scanner sc = new Scanner(System.in);   -----------------
		
		
//ONDE: sc = vari?vel  | Scanner = tipo de vari?vel pra fazer a entrada de dados  |  = new Scanner(System.in); ? a forma padr?o
	//	                                                                          | pra associar o objeto ao teclado
		
		
		// Para funcionar, ? preciso fazer a importa??o do Scanner, pro sistema entender como entrada de dados da forma abaixo:
		
						//------   import java.util.Scanner;   -----------------
		
		
		// Bem como ao final do uso no c?d. faz-se o fechamento dessa vari?vel, quando n?o precisar mais. Da forma abaixo:
		
		
								//------  sc.close()  -----------------
		
//ONDE: sc = vari?vel  | .close() ? uma fun??o que vai desalocar o recurso criado
		
		
		//Exemplo pr?tico:
		
		
		Scanner sc = new Scanner(System.in);    	 // Objeto de leitura pelo console ( intera??o direta )
		
		String x;                                	 // Tipo de vari?vel com a vari?vel
		
		x = sc.next();                          	 // Vari?vel recebendo a intera??o da leitura do scanner com o que foi digitado
														// no console
		System.out.println("Voc? digitou " + x); 	 // Resposta interativa do console
		
		sc.close();                        			 // Fun??o de encerramento do objeto.
		
		
		
	// O exemplo pr?tico acima ? a forma como o console l? a entrada de dados do tipo String, por?m tem a leitura como Int e Double 
	// tamb?m. 
		
		
		// Com o tipo Int: ::::::::::::::::::::::::::::::::::::::::::
		
			// Scanner sc = new Scanner(System.in);
		
			// Int x;
		
			// x = sc.nextInt();  
		
			// System.out.println("Voc? digitou " + x);
		
			// sc.close(); 
		
//**********************************************************************************************************
		
		// Com o tipo Double: ::::::::::::::::::::::::::::::::::::::::::		
		
		
		// Scanner sc = new Scanner(System.in);
		
		// Int x;
	
		// x = sc.nextDouble();  
	
		// System.out.println("Voc? digitou " + x);
	
		// sc.close(); 
		
		
//**********************************************************************************************************
		
				// Com v?rios tipos de vari?vel: ::::::::::::::::::::::::::::::::::::::::::
		
		
		// Scanner sc = new Scanner(System.in);
		
		// String x;
		// Int y;
		// Double z;
	
		// x = sc.next();  
		// y = sc.nextInt();
		// z = sc.nextDouble();
		
		// System.out.println("Dados digitados");
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);
	
		// sc.close(); 
		
		
		
		
		
	}

}
