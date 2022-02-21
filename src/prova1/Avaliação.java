package prova1;

import java.util.Scanner;

public class Avalia��o {

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

		sistema.x[0] = "\r\n(QUEST�O 01) - O Git � um sistema de controle de vers�es distribu�do, utilizado principalmente no desenvolvimento de software. "
				+ "\r\nQual dos comandos abaixo pode ser utilizado para enviar as altera��es de um reposit�rio local para um reposit�rio remoto?";

		sistema.x[1] = "\r\n (QUEST�O 02) -  Depois de criar v�rios commits utilizando o Git, um T�cnico em Inform�tica deseja ver o hist�rico de commits"
				+ "\r\n com algumas estat�sticas abreviadas para cada commit. Para isso, ele deve utilizar a instru��o ";

		sistema.x[2] = "\r\n(QUEST�O 03) - O Git � um sistema de controle de vers�o"
				+ "muito utilizado na atualidade. Com ele podemos controlar vers�es de diversos tipos de arquivos, "
				+ "\r\nprincipalmente c�digos fontes de sistemas. "
				+ "Um programador da CASAN executou a seguinte sequ�ncia de comandos no shell do git. Qual foi o objetivo?\r\n"
				+ "\r\n| git add principal.java" + "\r\n| git commit -m 'primeiro commit do arquivo' ";

		sistema.x[3] = "\r\n(QUEST�O 04) - Para Paulo verificar, em linha de comando, quais arquivos est�o em quais estados ele utilizou o comando git status."
				+ "\r\nEm seguida, ele adicionou um novo arquivo chamado trt ao projeto. Qual comando Paulo utilizou? ";

		sistema.x[4] = "\r\n(QUEST�O 05) - Uma desenvolvedora est� trabalhando em um projeto cujo reposit�rio de arquivos est� em um servidor que usa o modelo descentralizado GIT."
				+ "\r\nEla n�o possui internet, mas deseja consolidar as modifica��es que fez para posteriormente envi�-las para grava��o na nuvem assim que tiver conex�o � rede. "
				+ "\r\nPara executar este versionamento, a desenvolvedora deve:";

		sistema.x[5] = "\r\n(QUEST�O 06) - Os comandos da ferramenta Git s�o relativamente simples: para adicionar, por exemplo, um arquivo novo ao reposit�rio no Git, basta:";

		sistema.x[6] = "\r\n(QUEST�O 07) - A cerca da ferramente GIT  e considerando o comando abaixo, assinale a alternativa CORRETA. "
				+ "\r\n" + "\r\n| git push master";

		sistema.x[7] = "\r\n(QUEST�O 08) - Depois de inicializar um novo reposit�rio Git com o comando �git init�, e criar um arquivo chamado git-teste.html, "
				+ "\r\nqual dos seguintes comandos n�o ir� surtir o efeito desejado se for executado? ";

		sistema.x[8] = "\r\n(QUEST�O 09) - Descreva a fun��o dos seguinte comandos:" + "\r\n" + "\r\n| Git add"
				+ "\r\n| Git remote" + "\r\n| Git push" + "\r\n| Git status";

		sistema.x[9] = "\r\n (QUEST�O 10) - O que � GitHub?";

		sistema.alternativas[0][0] = "[1]--" + " [Git add -A]";
		sistema.alternativas[0][1] = "[2]--" + " [Git commit -m 'Altera��es']";
		sistema.alternativas[0][2] = "[3]--" + " [Git push origin master]";
		sistema.alternativas[0][3] = "[4]--" + " [git reset]";

		sistema.alternativas[1][0] = "[1]--" + "[Git log --history]";
		sistema.alternativas[1][1] = "[2]--" + "[Git history --log]";
		sistema.alternativas[1][2] = "[3]--" + "[Git show --snapshot]";
		sistema.alternativas[1][3] = "[4]--" + "[Git log -stat]";

		sistema.alternativas[2][0] = "[1] --"
				+ " [Criar um branch(ramica��o) do reposit�rio atual a partir do arquivo 'principal.java]";
		sistema.alternativas[2][1] = "[2] --" + " [Remover o arquivo 'principal.java' do reposit�rio local ] ";
		sistema.alternativas[2][2] = "[3] --" + " [Enviar o arquivo 'principal.java' para o servidor remoto]";
		sistema.alternativas[2][3] = "[4] --"
				+ " [Criar um commit do arquivo 'principal.java' localmente, para posterior envio ao reposit�rio remoto]";

		sistema.alternativas[3][0] = "[1] --" + " [git -mu trt]";
		sistema.alternativas[3][1] = "[2] --" + " [git -a --sx trt] ";
		sistema.alternativas[3][2] = "[3] --" + " [git add -trt]";
		sistema.alternativas[3][3] = "[4] --" + " [git add trt]";

		sistema.alternativas[4][0] = "[1] --"
				+ " [Realizar um commit local e,posteriormente, fazer o envio da vers�o nova para o servidor principal.]";
		sistema.alternativas[4][1] = "[2] --"
				+ " [Fazer um c�pia dos arquivos em uma nova pasta,renomeando esse novo diret�rio com n�mero de vers�o acima do atual] ";
		sistema.alternativas[4][2] = "[3] --"
				+ " [Criar uma nova ramifica��o do reposit�rio local, colocando todos os arquivos da nova vers�o nas pasta trunk]";
		sistema.alternativas[4][3] = "[4] --"
				+ " [Fazer solicita��o de commit para o servidor, de maneira que esta solicita��o fique pendente e, assim que existir"
				+ "\r\n conex�o � rede, o c�digo ser� automaticamente para o sistema.]";

		sistema.alternativas[5][0] = "[1] --" + " [Git push origin master]";
		sistema.alternativas[5][1] = "[2] --" + " [Git remote >> Git add] ";
		sistema.alternativas[5][2] = "[3] --" + " [Git commit >> Git add";
		sistema.alternativas[5][3] = "[4] --" + " [Git add    >> Git commit]";

		sistema.alternativas[6][0] = "[1] --"
				+ " [O comanda acima envia altera��es para o reposit�rio local, criando uma revis�o]";
		sistema.alternativas[6][1] = "[2] --" + " [O comando push n�o existe na ferramente GIT] ";
		sistema.alternativas[6][2] = "[3] --"
				+ " [O comando acima envia c�pia para o reposit�rio local das altera��es feitas em um reposit�rio remoto";
		sistema.alternativas[6][3] = "[4] --"
				+ " [O comando acima envia c�pia para o reposit�rio remoto das altera��es feitas em um reposit�rio local]";

		sistema.alternativas[7][0] = "[1] --" + " [git add]";
		sistema.alternativas[7][1] = "[2] --" + " [git status] ";
		sistema.alternativas[7][2] = "[3] --" + " [git branch -a]";
		sistema.alternativas[7][3] = "[4] --" + " [git commit -m 'arquivo git teste adicionado]";

		sistema.alternativas[8][0] = "[1] --"
				+ " [Adicionar altera��es no diret�rio - usado para especificar em quais terminais remotos os comandos"
				+ "\r\n devem operar - usado para enviar o conte�do do reposit�rio local para um reposit�rio remoto - exibe as condi��es do diret�rio de trabalho]";
		sistema.alternativas[8][1] = "[2] --"
				+ " [Adicionar altera��es no diret�rio - usado para criar terminais remotos - usado para copiar arquivos do repisit�rio remoto -"
				+ "\r\n usado para exebir altera��es no arquivo.] ";
		sistema.alternativas[8][2] = "[3] --"
				+ " [Todos os comandos t�m a mesma fun��o dependendo do arquivo no reposit�rio.]";
		sistema.alternativas[8][3] = "[4] --" + " [Todas as alternativas est�o incorretas. ]";

		sistema.alternativas[9][0] = "[1] --"
				+ " [GitHub � uma plataforma de hospedagem de c�digo-fonte e arquivos com controle de vers�o usando o Git.]";
		sistema.alternativas[9][1] = "[2] --" + " [Uma linguagem de programa��o] ";
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

			System.out.print("\r\nDigite sua resposta(Escolha um n�mero de 1 a 4): ");
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

		for (int i = 0; i < 10; i++) { // QUEST�ES DEVEM IR DE 1 A 10, est� imprimindo de 0 a 9.

			System.out.println("QUEST�O " + i + " - " + "[" + sistema.gabarito[i] + "]");
		}

		System.out.println();

		System.out.println("NOTA: " + sistema.nota());
		System.out.println(sistema.resultado());

		ler.close();

	}

}
