package metodos.main;

import java.io.IOException;
import java.util.Scanner;

public final class Menu {
	public static int retornarEscolha() throws IOException {
		int escolha = -1;
		
		while(escolha != 0) {
			Scanner scan = new Scanner(System.in);
			if(escolha >= 0 && escolha <= 4) {
				estruturaMenu();
				escolha = scan.nextInt();
				Runtime.getRuntime().exec("cls");
				scan.close();
				return escolha;
			}
			else {
				System.out.println("Tente Novamente!");
			}
		}	
		return 0;
	}
	public static void estruturaMenu() {
		System.out.println("[1]Método da Bisseção");
		System.out.println("[2]Método da Falsa Posição");
		System.out.println("[3]Método do Ponto Fixo");
		System.out.println("[4]Método de Newton");
		System.out.println("[0]Fechar Programa");
	}
}
