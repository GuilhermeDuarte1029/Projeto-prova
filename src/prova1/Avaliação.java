package prova1;

import java.util.Scanner;

public class Avaliação {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Sistema sistema = new Sistema();

		System.out.println(
				"______  ______   _____   _   _    ___             _____   _____   _____    _   _   _   _  ______ \r\n"
						+ "| ___ \\ | ___ \\ |  _  | | | | |  / _ \\           |  __ \\ |_   _| |_   _|  | | | | | | | | | ___ \\\r\n"
						+ "| |_/ / | |_/ / | | | | | | | | / /_\\ \\  ______  | |  \\/   | |     | |    | |_| | | | | | | |_/ /\r\n"
						+ "|  __/  |    /  | | | | | | | | |  _  | |______| | | __    | |     | |    |  _  | | | | | | ___ \\\r\n"
						+ "| |     | |\\ \\  \\ \\_/ / \\ \\_/ / | | | |          | |_\\ \\  _| |_    | |    | | | | | |_| | | |_/ /\r\n"
						+ "\\_|     \\_| \\_|  \\___/   \\___/  \\_| |_/           \\____/  \\___/    \\_/    \\_| |_/  \\___/  \\____/ "
						+ "\r\n------------------------------------------------------------------------------------------------");

		System.out.print("\r\nDIGITE SEU NOME: ");
		sistema.nome = ler.nextLine();

		sistema.x[0] = "\r\n(QUESTÃO 01) - O Git é um sistema de controle de versões distribuído, utilizado principalmente no desenvolvimento de software. "
				+ "\r\nQual dos comandos abaixo pode ser utilizado para enviar as alterações de um repositório local para um repositório remoto?";

		sistema.x[1] = "\r\n (QUESTÃO 02) -  Depois de criar vários commits utilizando o Git, um Técnico em Informática deseja ver o histórico de commits"
				+ "\r\n com algumas estatísticas abreviadas para cada commit. Para isso, ele deve utilizar a instrução ";

		sistema.x[2] = "\r\n(QUESTÃO 03) - O Git é um sistema de controle de versão"
				+ "muito utilizado na atualidade. Com ele podemos controlar versões de diversos tipos de arquivos, "
				+ "\r\nprincipalmente códigos fontes de sistemas. "
				+ "Um programador da CASAN executou a seguinte sequência de comandos no shell do git. Qual foi o objetivo?\r\n"
				+ "\r\n| git add principal.java" + "\r\n| git commit -m 'primeiro commit do arquivo' ";

		sistema.x[3] = "\r\n(QUESTÃO 04) - Para Paulo verificar, em linha de comando, quais arquivos estão em quais estados ele utilizou o comando git status."
				+ "\r\nEm seguida, ele adicionou um novo arquivo chamado trt ao projeto. Qual comando Paulo utilizou? ";

		sistema.x[4] = "\r\n(QUESTÃO 05) - Uma desenvolvedora está trabalhando em um projeto cujo repositório de arquivos está em um servidor que usa o modelo descentralizado GIT."
				+ "\r\nEla não possui internet, mas deseja consolidar as modificações que fez para posteriormente enviá-las para gravação na nuvem assim que tiver conexão à rede. "
				+ "\r\nPara executar este versionamento, a desenvolvedora deve:";

		sistema.x[5] = "\r\n(QUESTÃO 06) - Os comandos da ferramenta Git são relativamente simples: para adicionar, por exemplo, um arquivo novo ao repositório no Git, basta:";

		sistema.x[6] = "\r\n(QUESTÃO 07) - A cerca da ferramente GIT  e considerando o comando abaixo, assinale a alternativa CORRETA. "
				+ "\r\n" + "\r\n| git push master";

		sistema.x[7] = "\r\n(QUESTÃO 08) - Depois de inicializar um novo repositório Git com o comando “git init”, e criar um arquivo chamado git-teste.html, "
				+ "\r\nqual dos seguintes comandos não irá surtir o efeito desejado se for executado? ";

		sistema.x[8] = "\r\n(QUESTÃO 09) - Descreva a função dos seguinte comandos:" + "\r\n" + "\r\n| Git add"
				+ "\r\n| Git remote" + "\r\n| Git push" + "\r\n| Git status";

		sistema.x[9] = "\r\n (QUESTÃO 10) - O que é GitHub?";

		sistema.alternativas[0][0] = "[1]--" + " [Git add -A]";
		sistema.alternativas[0][1] = "[2]--" + " [Git commit -m 'Alterações']";
		sistema.alternativas[0][2] = "[3]--" + " [Git push origin master]";
		sistema.alternativas[0][3] = "[4]--" + " [git reset]";

		sistema.alternativas[1][0] = "[1]--" + "[Git log --history]";
		sistema.alternativas[1][1] = "[2]--" + "[Git history --log]";
		sistema.alternativas[1][2] = "[3]--" + "[Git show --snapshot]";
		sistema.alternativas[1][3] = "[4]--" + "[Git log -stat]";

		sistema.alternativas[2][0] = "[1] --"
				+ " [Criar um branch(ramicação) do repositório atual a partir do arquivo 'principal.java]";
		sistema.alternativas[2][1] = "[2] --" + " [Remover o arquivo 'principal.java' do repositório local ] ";
		sistema.alternativas[2][2] = "[3] --" + " [Enviar o arquivo 'principal.java' para o servidor remoto]";
		sistema.alternativas[2][3] = "[4] --"
				+ " [Criar um commit do arquivo 'principal.java' localmente, para posterior envio ao repositório remoto]";

		sistema.alternativas[3][0] = "[1] --" + " [git -mu trt]";
		sistema.alternativas[3][1] = "[2] --" + " [git -a --sx trt] ";
		sistema.alternativas[3][2] = "[3] --" + " [git add -trt]";
		sistema.alternativas[3][3] = "[4] --" + " [git add trt]";

		sistema.alternativas[4][0] = "[1] --"
				+ " [Realizar um commit local e,posteriormente, fazer o envio da versão nova para o servidor principal.]";
		sistema.alternativas[4][1] = "[2] --"
				+ " [Fazer um cópia dos arquivos em uma nova pasta,renomeando esse novo diretório com número de versão acima do atual] ";
		sistema.alternativas[4][2] = "[3] --"
				+ " [Criar uma nova ramificação do repositório local, colocando todos os arquivos da nova versão nas pasta trunk]";
		sistema.alternativas[4][3] = "[4] --"
				+ " [Fazer solicitação de commit para o servidor, de maneira que esta solicitação fique pendente e, assim que existir"
				+ "\r\n conexão à rede, o código será automaticamente para o sistema.]";

		sistema.alternativas[5][0] = "[1] --" + " [Git push origin master]";
		sistema.alternativas[5][1] = "[2] --" + " [Git remote >> Git add] ";
		sistema.alternativas[5][2] = "[3] --" + " [Git commit >> Git add";
		sistema.alternativas[5][3] = "[4] --" + " [Git add    >> Git commit]";

		sistema.alternativas[6][0] = "[1] --"
				+ " [O comanda acima envia alterações para o repositório local, criando uma revisão]";
		sistema.alternativas[6][1] = "[2] --" + " [O comando push não existe na ferramente GIT] ";
		sistema.alternativas[6][2] = "[3] --"
				+ " [O comando acima envia cópia para o repositório local das alterações feitas em um repositório remoto";
		sistema.alternativas[6][3] = "[4] --"
				+ " [O comando acima envia cópia para o repositório remoto das alterações feitas em um repositório local]";

		sistema.alternativas[7][0] = "[1] --" + " [git add]";
		sistema.alternativas[7][1] = "[2] --" + " [git status] ";
		sistema.alternativas[7][2] = "[3] --" + " [git branch -a]";
		sistema.alternativas[7][3] = "[4] --" + " [git commit -m 'arquivo git teste adicionado]";

		sistema.alternativas[8][0] = "[1] --"
				+ " [Adicionar alterações no diretório - usado para especificar em quais terminais remotos os comandos"
				+ "\r\n devem operar - usado para enviar o conteúdo do repositório local para um repositório remoto - exibe as condições do diretório de trabalho]";
		sistema.alternativas[8][1] = "[2] --"
				+ " [Adicionar alterações no diretório - usado para criar terminais remotos - usado para copiar arquivos do repisitório remoto -"
				+ "\r\n usado para exebir alterações no arquivo.] ";
		sistema.alternativas[8][2] = "[3] --"
				+ " [Todos os comandos têm a mesma função dependendo do arquivo no repositório.]";
		sistema.alternativas[8][3] = "[4] --" + " [Todas as alternativas estão incorretas. ]";

		sistema.alternativas[9][0] = "[1] --"
				+ " [GitHub é uma plataforma de hospedagem de código-fonte e arquivos com controle de versão usando o Git.]";
		sistema.alternativas[9][1] = "[2] --" + " [Uma linguagem de programação] ";
		sistema.alternativas[9][2] = "[3] --" + " [Um Script que roda no Prompt de Comando do computador]";
		sistema.alternativas[9][3] = "[4] --" + " [Um sistema operacional ]";

		for (int i = 0; i < 10; i++) {
			System.out.println(sistema.x[i]);
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------");

			for (int j = 0; j < 4; j++) {
				System.out.println();
				System.out.println(sistema.alternativas[i][j]);
				System.out.println();
			}

			System.out.print("\r\nDigite sua resposta(Escolha um número de 1 a 4): ");
			sistema.numero[i] = ler.nextInt();

		}

		System.out.println();

		System.out.println(" _____     ___    ______     ___    ______    _____    _____    _____ \r\n"
				+ "|  __ \\   / _ \\   | ___ \\   / _ \\   | ___ \\  |_   _|  |_   _|  |  _  |\r\n"
				+ "| |  \\/  / /_\\ \\  | |_/ /  / /_\\ \\  | |_/ /    | |      | |    | | | |\r\n"
				+ "| | __   |  _  |  | ___ \\  |  _  |  |    /     | |      | |    | | | |\r\n"
				+ "| |_\\ \\  | | | |  | |_/ /  | | | |  | |\\ \\    _| |_     | |    \\ \\_/ /\r\n"
				+ " \\____/  \\_| |_/  \\____/   \\_| |_/  \\_| \\_|   \\___/     \\_/     \\___/ \r\n"
				+ "-------------------------------------------------------------------");

		System.out.println();

		for (int i = 0; i < 10; i++) { // QUESTÕES DEVEM IR DE 1 A 10, está imprimindo de 0 a 9.

			System.out.println("QUESTÃO " + i + " - " + "[" + sistema.gabarito[i] + "]");
		}

		System.out.println();

		System.out.println("NOTA: " + sistema.nota());
		System.out.println(sistema.resultado());

		ler.close();

	}

}
