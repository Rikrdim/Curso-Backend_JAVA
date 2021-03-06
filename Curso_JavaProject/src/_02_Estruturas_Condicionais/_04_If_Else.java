package _02_Estruturas_Condicionais;

import java.util.Scanner;

public class _04_If_Else {

	public static void main(String[] args) {
		
	//  Estrutura SIMPLES: para uso do If e Else: Inicia com o if (tradu??o: SE), entre PARENTESES() inclui a condi??o, que pode 
		// ser uma express?o comparativa ou l?gica e entre CHAVES{} o bloco de comando a ser executado, se acondi??o for verdadeira.
		// Se a condi??o for falsa, o bloco de comando ? pulado.
		
		
		// REGRA GERAL: Trata apenas 1 possibilidade
		//              Se a condi??o for VERDADEIRA, ser? executado o comando que estiver entre chaves.
		//              Se a condi??o for FALSA, o bloco de comando ou a condi??o falsa ser? pulada.
		
		
		//FORMATO
		
		// if ( <condi??o1> ) {      
		//    <comando1>      
        //	  <comando2>      TUDO O QUE ESTIVER DENTRO DAS CHAVES ? UM BLOCO DE COMANDO
		// }                       
		
		//Exemplo pr?tico
		int x_eco = 5;
		
		System.out.println("Bom dia");
		
		if(x_eco < 0) {                      
			System.out.println("Boa tarde");   // condi??o falsa, pois 5 ? maior que zero. Logo esta condi??o n?o ser? executada.
		}
		
		System.out.println("Boa noite");
		
		
		
	//  Estrutura COMPOSTA: Se inicia igual a estrutura simples, mas nesta tem o acrescimo do ELSE(tradu??o: se N?O).
		
		// REGRA GERAL: Trata 2 poss?veis possibilidades
		//              Verdadeiro executa somente o bloco IF
		//              FALSO executa somente o bloco ELSE
		
		
		//FORMATO
		
		// if ( <condi??o1> ) {      
		//    <comando1>      
        //	  <comando2>     
		// }
		// else {
		//	  <comando3>      
        //	  <comando4>
		// }
		
		//Exemplo pr?tico [ Utilizando o Scanner, que ? uma estrutura de entrada de dados]
		
		Scanner sc = new Scanner(System.in);  //Sanner para perguntar Quantas horas, antes de executar a condi??o      
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12){                        //IF pra executar a condi??o verdadeira
			System.out.println("Bom dia");
		}
		else {                                //ELSE pra executar a condi??o falsa
			System.out.println("Boa tarde");
		}
		sc.close();
		
		
		
	//  Estrutura COMPOSTA tratando com 3 possibilidades : Mesmo formato do if(){}else{}. Mas acrescenta dentro do else{} 
		//outra condi??o if(){}
		
		// Essa tratativa, se chama ENCADEAMENTO DE ESTRUTURA.
		
			// REGRA GERAL: Trata 3 ou mais poss?veis possibilidades
			//              Executa as condi??es de verdadeiro e falso e dentro da condi??o falsa, executa a terceira condi??o
			//                                                                                                        verdadeira
		
		//FORMATO
		
		// if ( <condi??o1> ) {                        abre chave1
				//    <comando1>      
		        //	  <comando2>     
				// }                                   fecha chave1
				// else {                              abre chave2
				//	    if(condi??o2){                 abre chave3
		        //	  		<comando3>
		     	//    		<comando4>                                      //atentar para abertura e fechamento de chaves
				//		 }                             fecha chave2
				//		 else{                         abre chave4
				//			<comando5>
				//			<comando6>
				//  	 }                             fecha chave3
				// }                                   fecha chave4
		
		
		//Exemplo pr?tico
		
		Scanner sc_1 = new Scanner(System.in);      
		int hora1;
		
		System.out.println("Quantas horas?");
		hora1 = sc_1.nextInt();
		
		if(hora1 < 12){                       
			System.out.println("Bom dia");
		}
		else {                                
			if(hora1 < 18){
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
		sc_1.close();
		
		
		// OBSERVA??O: No encadeamento a outra op??o de montar a estrutura, ? mantendo o if da terceira condi??o, na mesma linha do
		// else. Desta forma:
		
		
		// if ( <condi??o1> ) {                       
		//    <comando1>      
        //	  <comando2>     
		// }                                   
		// else if(condi??o2){                                         
        //	  <comando3>
     	//    <comando4>                                     
		//		 }                            
		//	else{                         
		//	  <comando5>
		//	  <comando6>
		//  	 }                             
		// }              Desta forma, a estrutura de comando, se manter? sempre numa mesma linha e organizada.                     
		
	}

}
