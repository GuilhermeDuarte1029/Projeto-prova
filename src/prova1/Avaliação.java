package prova1;

import java.util.Scanner;

public class Avalia��o {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Sistema sistema = new Sistema();

		System.out.print("Digite seu nome: ");
		sistema.nome = ler.nextLine();

		System.out.println();

		System.out.println();
		
		sistema.x[0] = "QUEST�O 01";
		sistema.x[1] = "QUEST�O 02";
		sistema.x[2] = "QUEST�O 03"; 
		sistema.x[3] = "QUEST�O 04";
		sistema.x[4] = "QUEST�O 05";
		sistema.x[5] = "QUEST�O 06";
		sistema.x[6] = "QUEST�O 07"; 
		sistema.x[7] = "QUEST�O 08";  
		sistema.x[8] = "QUEST�O 09";
		sistema.x[9] = "QUEST�O 10";

		sistema.alternativas[0][0] = "[1]" + "[120]";
		sistema.alternativas[0][1] = "[2]" + "[250]";
		sistema.alternativas[0][2] = "[3]" + "[2650]";
		sistema.alternativas[0][3] = "[4]" + "[500]";

		sistema.alternativas[1][0] = "[1]" + "[120]";
		sistema.alternativas[1][1] = "[2]" + "[250]";
		sistema.alternativas[1][2] = "[3]" + "[2650]";
		sistema.alternativas[1][3] = "[4]" + "[500]";

		sistema.alternativas[2][0] = "[1]" + "[120]";
		sistema.alternativas[2][1] = "[2]" + "[250]";
		sistema.alternativas[2][2] = "[3]" + "[2650]";
		sistema.alternativas[2][3] = "[4]" + "[500]"; 

		for (int i = 0; i < 10; i++) {
			System.out.println(sistema.x[i]);

			for (int j = 0; j < 4; j++) {
				System.out.println(sistema.alternativas[i][j]);
			}

			System.out.print("Digite sua resposta: ");
			sistema.numero[i] = ler.nextInt();
		}
		
		
		
		

		System.out.println(sistema.nota());
		System.out.println(sistema.resultado());
		
		for (int i = 1; i < 10; i++) {
			System.out.println("GABARITO:" + sistema.gabarito[i]);
		}
		 
		
		

	}

}
