package metodos.main;

import java.util.Scanner;

public final class Menu {
	public static int retornarEscolha() {
		int escolha = -1;
		Scanner scan = new Scanner(System.in);
		
		estruturaMenu();
		escolha = scan.nextInt();
		if((escolha >= 0) && (escolha <= 4))
			scan.close();
		
		return escolha;
	}
	private static void estruturaMenu() {
		System.out.println("[1]Método da Bisseção");
		System.out.println("[2]Método da Falsa Posição");
		System.out.println("[3]Método do Ponto Fixo");
		System.out.println("[4]Método de Newton");
		System.out.println("[0]Fechar Programa");
	}
}
