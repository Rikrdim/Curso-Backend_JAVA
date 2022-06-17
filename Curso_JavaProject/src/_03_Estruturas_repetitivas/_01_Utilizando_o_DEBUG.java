package _03_Estruturas_repetitivas;

public class _01_Utilizando_o_DEBUG {

	public static void main(String[] args) {


		// O DEBUG � uma ferramenta que facilita a investiga��o de erros no c�digo. Apontando exatamente o que acontece linha a linha

		
		// _______________ PASSO 1 - MARCANDO UMA LINHA DE BREAKPOINT _______________
		
		
		// O breakpoint serve para marcar uma linha de c�digo espec�fica para que a partir dal�, se inicie a investiga��o do erro.
		
		// EXEMPLO PR�TICO:
		// No exemplo abaixo temos a situa��o, onde o cliente quer um programa que leia a largura, comprimento e metro quadrado e
		// calcule a �rea e o pre�o do terreno para mostrar na tela.
		
		
		// import java.util.Locale;
		// import java.util.Scanner;
		
		
		// public class main {
		// 		public static void main(String[] args) {
		//
		//			Locale.setDefault(Locale.US);
		//			Scanner sc = new Scanner(System.in);
		//			
		//			double largura = sc.nextDouble();
		//			double comprimento = sc.nextDouble();
	//	  �32		double metroQuadrado = sc.nextDouble();      BREAKPOINT NESTA LINHA 32
		//
		//			double area = largura * comprimento;
		//			double preco = area * metroQuadrado;
		//
		//			System.out.printf("�REA = %.2f%n", area);
		//			System.out.printf("PRE�O = %.2f%n", preco);
		//
		//		sc.close();
		// 	}
		//}
		
		
		// Supondo que queremos analisar especificamente a linha 32. Com o breakpoint nessa linha, TUDO o que est� antes, ir� rodar
		// normalmente e quando chegar nesse breakpoint, a ferramente ir� parar para an�lise.
		
		// Para inserir o breakpoint, mantem a marca��o de edi��o na linha a ser analisada, vai em > RUN > TOGGLE BREAKPOINT ou
		//		Ctrl + shift + B ou clica com o bot�o direito do mouse em cima do N� da linha e seleciona TOGGLE BREAKPOINT
		
		// Fazendo esse passo, aparecer� uma marca��o (bolinha) ao lado do N� da linha.
		
		// Para remover, basta repetir o processo de inserir e verificar se a marca��o (bolinha) saiu do lado do N� da linha.
		
// *****************************************************************************************************************
		
		// _______________ PASSO 2 - INICIANDO O DEBUG _______________
		
		
		// 	Para iniciar a execu��o do debug na classe, segue o processo:
		
		// Clica com o bot�o direito do mouse na classe ( a classe em quest�o, � a classe criada nos arquivos que ficam dentro
		//	do package, a esquerda) > DEBUG AS > JAVA APLICATION
		
		// A aplica��o ir� rodar normalmente at� chegar na linha marcada pelo breakpoint.
		//
		// Onde por sua vez a ferramenta de DEBUG do eclipse ir� perguntar, se deseja mudar pra visualiza��o/perspectiva de DEBUG.
		
		// Essa perspectiva � a mais adequada para se trabalhar com o DEBUG, pq nela se encontra vis�vel somente o necess�rio para
		// verificar onde tem erros no c�digo.
		//
		// Essa visualiza��o tras � �rea do c�digo indicando a proxima linha de execu��o, uma �rea de retorno dos dados, o status do
		// DEBUG e a resposta do console.
		
// *****************************************************************************************************************
		
		// _______________ PASSO 3 - EXECUTAR O DEBUG LINHA A LINHA (F6) _______________
				
		
		// Com o breakpoint ativado, precisamos avan�ar a linha do c�digo, para execu��o da aplica��o, desta forma:
		
		//                Bot�o F6 do teclado ou no bot�o STEP OVER dos atalhos do eclipse.
		
		// Desta forma, passamos/analisamos linha a linha de forma manual. Precisando ou n�o da intera��o com o console. 

// *****************************************************************************************************************
		
		// _______________ PASSO 4 - INTERROMPER O DEBUG _______________
		
		
		// Ao chegar no ponto onde foi encontrado o erro e corrigido. Precisamos interromper o DEBUG, para que a aplica��o
		// 	continue com o fluxo natural. Desta forma:
		
		//                Bot�o TERMINATE dos atalhos do eclipse ou Ctrl + F2 do teclado.
		
		// Desta forma o Status do DEBUG vai indicar que a execu��o foi interrompida e o fluxo ir� seguir normalmente.
		
	}

}
