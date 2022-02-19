package prova1;

public class Sistema {

	public String nome;
	public int somaPontos;
	String[] x = new String[10];
	int[] numero = new int[10];
	int[] gabarito = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
	String[][] alternativas = new String[10][4];

	public int nota() {

		if (numero[0] == gabarito[0]) {
			this.somaPontos += 1;
		}

		if (numero[1] == gabarito[1]) {
			this.somaPontos += 1;
		}

		if (numero[2] == gabarito[2]) {
			this.somaPontos += 1;
		}

		if (numero[3] == gabarito[3]) {
			this.somaPontos += 1;
		}

		if (numero[4] == gabarito[4]) {
			this.somaPontos += 1;
		}
		if (numero[5] == gabarito[5]) {
			this.somaPontos += 1;
		}
		if (numero[6] == gabarito[6]) {
			this.somaPontos += 1;
		}
		if (numero[7] == gabarito[7]) {
			this.somaPontos += 1;
		}
		if (numero[8] == gabarito[8]) {
			this.somaPontos += 1;
		}
		if (numero[9] == gabarito[9]) {
			this.somaPontos += 1;
		}

		return this.somaPontos;

	}

	public String resultado() {

		if (somaPontos < 7) {
			return "REPROVADO";
		} else {
			return "APROVADO";
		}

	}


}
