package prova1;

public class Sistema {

	public String nome;
	public int contador;
	public int somaPontos = 0;
	String[] x = new String[10];
	int[] numero = new int[10];
	int[] gabarito = { 3, 4, 4, 4, 1, 4, 4, 4, 1, 1, };
	String[][] alternativas = new String[10][4];

	public int nota() {

		for (int i = 0; i < 10; i++) {

			if (numero[i] == gabarito[i]) {
				this.somaPontos = this.somaPontos + 1;
			}
		}

		return this.somaPontos;

	}

	public String resultado() {

		if (nota() < 7) {
			return "SITUAÇÃO DO ALUNO: REPROVADO\n";
		} else {
			return "SITUAÇÃO DO ALUNO: APROVADO\n";
		}

	}

}
