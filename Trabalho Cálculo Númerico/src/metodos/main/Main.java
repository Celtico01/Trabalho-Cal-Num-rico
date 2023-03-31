package metodos.main;

import metodos.entidades.*; // importando os metodos criados


import constantes.Constantes; //algumas constantes

public class Main extends Janela{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		
		switch(Menu.retornarEscolha()) {
		case 1:
			MetodoBissecao mb = new MetodoBissecao();
			mb.bissecao();
			new Janela(Constantes.METODO_BISSECAO, Constantes.COLUNAS_BISSECAO, mb.retornarDados()).setVisible(true);
		break;
		case 2:
			MetodoFalsaPosicao fp = new MetodoFalsaPosicao();
			fp.falsaPosicao();
			new Janela(Constantes.METODO_FALSA_POSICAO, Constantes.COLUNAS_FALSA_POSICAO, fp.retornarDados()).setVisible(true);
		break;
		case 3:
			MetodoPontoFixo pf = new MetodoPontoFixo();
			pf.pontoFixo();
			new Janela(Constantes.METODO_PONTO_FIXO, Constantes.COLUNAS_PONTO_FIXO, pf.retornarDados()).setVisible(true);
		break;
		case 4:
			//não concluido
		break;
		case 0:
			System.out.println("Fechando programa...");
			System.exit(0);
		break;
		
	}

	}

}
