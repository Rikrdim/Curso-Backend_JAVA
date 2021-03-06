package _02_Estruturas_Condicionais;

public class _02_Expressoes_Logicas {

	public static void main(String[] args) {
		// Express?es L?gicas
		//                                                              |                          |
		                                       // Tabela operador E   | |    Tabela operador OU    |    Tabela operador N?O
		//                                                              |                          |
		// OPERADOR        SIGNIFICADO         |__    A   B   A&&B  __| | |__    A   B   A||B  __| | |__    A  !A  __|
		//                                      _____             _____ |  _____             _____ |  _____       ___
		//    &&               E               |      F   F     F     | | |      F   F     F     | | |      F   V    |
		//	  ||               OU              |      F   V     F     | | |      F   V     V     | | |      V   F    |
		//	  !                N?O             |      V   F     F     | | |      V   F     V     | | 
        //                                     |      V   V     V     | | |      V   V     V     | |
        //                                     |                        |                          |
//*****************************************************************************************************************************
		
		//EXEMPLO [ x_ele|ou|nao = variavel x + express?o l?gica ]
		
// Supondo que x_ele = 5 Responda: x_ele <= 20 && x_ele == 10 | x_ele > 0 && x_ele != 3 | x_ele <=20 && x_ele == 10 && x_ele != 3
		
		int x_ele = 5;
		
		System.out.println(x_ele <= 20 && x_ele == 10);
		System.out.println(x_ele > 0 && x_ele != 3);
		System.out.println(x_ele <=20 && x_ele == 10 && x_ele != 3);
		System.out.println();
		
	
	// Responda x_elou == 10 || x_elou <= 20 | x_elou > 0 || x_elou != 3 | x_elou <= 0 || x_elou != 3 || x_elou != 5 
		
		int x_elou = 5;
		
		System.out.println(x_elou == 10 || x_elou <= 20);
		System.out.println(x_elou > 0 || x_elou != 3);
		System.out.println(x_elou <= 0 || x_elou != 3 || x_elou != 5);
		System.out.println();
		
	// Responda !(x_elnao == 10) | !(x_elnao <= 2) | !(x_elnao <= 20 && x_elnao == 10)
		
		int x_elnao = 5;
		
		System.out.println(!(x_elnao == 10));
		System.out.println(!(x_elnao <= 2));
		System.out.println(!(x_elnao <= 20 && x_elnao == 10));
	}

}
