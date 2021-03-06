package _01_Primeiros_conhecimentos;

import java.util.Locale;

public class _02_Saida_de_dados {

	public static void main(String[] args) {

		// ------------------ Utilizando o println acontece uma quebra de linha ------------------
		
		
		System.out.println("Ol? mundo");
		System.out.println("Bom dia!!");
//====================================================================================================================

		
		// ------------------ Para continuar na mesma linha, usa-se somente o print ------------------
		
		
		System.out.print("Ol? mundo, ");
		System.out.println("Bom dia!!");
//====================================================================================================================
		
		
		// ------------------ Usando vari?veis ------------------
		
		
		int y = 32;
		double x = 10.3547;
		
		System.out.println(y);
		System.out.println(x);
//====================================================================================================================
		
		
		// ------------------ Delimitar casas decimais ------------------
		
		
		// Onde, no print se usa printf. O "f" ? a abrevia??o de formatado. Entre par?nteses e aspas, se usa o %.2 pra definir 2 
		//casas decimais, %.4  pra definir 4 casas decimais etc.. Ap?s isso, usa-se o %n ou \n par quebra de linha.
		
		double a = 12.4523;
		double a1 = 12.4535;
		
		System.out.printf("%.2f%n", a);   
		System.out.printf("%.4f\n", a1);
//====================================================================================================================

		// ------------------ Configurando o delimitador de casas decimais, pra aceitar "." ou "," ------------------
		
		
		// A depender da configura??o da m?quina, ingl?s ou portugu?s, o console ir? ler de uma forma. Sendo a "," pro padr?o
		//portugu?s e o "." no padr?o ingl?s. 
		// Para resolver, se utilizando do ponto ao inv?s de virgula, usa-se o comando [ Locale.setDefault(locale.US); ]
		
		//OBS?:. Para funcionar o comando de localiza??o, ? necess?rio importar esse configurador com [ import java.util.Locale; ]
		
		//OBS?:. O comando de cofigura??o, sempre ser? acima do System.out.printf(...);
		
		
		double b = 13.56478;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", b);
		
	
//====================================================================================================================

		// ------------------ Concatenar v?rios elementos no mesmo comando de escrita ------------------
		
		
		// Regra geral para print e println: elemento1 + elemento2 + elemento3 + ... + elementoN 
		
		//Exemplo: System.out.println("RESULTADO = " + x + " METROS");
		
		double c = 14.564;
		
		System.out.println("RESULTADO = " + c + " METROS");
		
		
		//Exemplo de regra geral para printf: "TEXTO1" %f TEXTO2 %f TEXTO3", vari?vel1, variavel2
		
		System.out.printf("RESULTADO = %.2f Metros\n", c);   // Onde %2f = ponto flutuante e delimita??o de casas decimais
															 // \n = quebra de linha
		
		
		//Exemplo de regra geral para printf e  usando v?rios tipos de vari?veis: 
		//"TEXTO1" %f TEXTO2 %f TEXTO3", vari?vel1, variavel2
		
		// OBS?: Neste espec?fico utilizamos marcadores, onde: %f ? o ponto flutuante, %d numeros inteiros, %s textos \n quebra linha
		
		String nome = "Maria";
		int idade = 29;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		
//====================================================================================================================
		
		// ------------------ Processamento de dados em JAVA, utilizando o Casting ------------------
		
		//O que ? o casting: Casting ? uma convers?o expl?cita de tipos de dados.
		
		//Ex:. No exemplo abaixo a resposta normal serie 2.5. Por aA e bB serem int(inteiros) o compilador vai entender que a 
		// divis?o ser? entre os n?meros inteiros. Por?m, como a resposta seria 2.5, seria necess?rio usar o casting, para que
		// o compilador entendesse que a divis?o seria com o double, para manter as casas decimais.
		
		int aA,bB;
		double resultado;
		
		aA = 5;
		bB = 2;
		
		resultado = aA / bB;
		
		System.out.println(resultado);
		
		// Para resolver, ? necess?rio usar o casting, que ? utilizar o double entre parenteses, ap?s a atribui??o e 
		//antes das vari?veis.
		//Serve tamb?m pro int. Que ocorre quando as casas decimais n?o fazem falta no resultado
		
		//Ex:.
		
		int Aa,Bb;
		double resultado1;
		
		Aa = 5;
		Bb = 2;
		
		resultado1 = (double) Aa / Bb;
		
		System.out.println(resultado1);
		
		
//====================================================================================================================
		
	}

}
