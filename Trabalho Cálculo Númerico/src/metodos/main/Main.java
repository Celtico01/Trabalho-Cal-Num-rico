package metodos.main;

import metodos.entidades.*; // importando os metodos criados
import constantes.Constantes; //algumas constantes

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;
import java.awt.Color;


public class Main extends JFrame {
	//Color minhaCor1 = new Color(0, 139, 139); // criando uma cor '-'
	//Color minhaCor2 = new Color(178,243,243);
	
	private static final long serialVersionUID = 1L;
	 
    private JTable table;
    
    public Main(String nomeJanela, String[] coluna, String[][] dados) { //CONSTRUTOR DA CLASSE
    	Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); //descobrir o tamalho da tela do usuario
    	 	
        setLayout(new FlowLayout());//tipo de layout
        setSize(tela.getSize());//tamanho do Formulario
        //setSize(new Dimension(1280, 720)); caso precise
        setLocationRelativeTo(null);//centralizado
        setTitle(nomeJanela);//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setando a ação padrão de fechamento do Formulário, neste caso  irá fechar o programa
        setExtendedState(JFrame.MAXIMIZED_BOTH); //setando o programa para começar em tela cheia
        setAlwaysOnTop(true); // sobrepor outras janelas
        
        getContentPane().setBackground(Color.BLACK); //cor de fundo da aba
        
        //instanciando a JTable
        table = new JTable(dados, coluna); // passando os dados da tabela
        table.setPreferredScrollableViewportSize(tela.getSize());//barra de rolagem
        //table.setPreferredScrollableViewportSize(new Dimension(1280,720)); caso precise
        table.setFillsViewportHeight(true);
        table.setBackground(Color.CYAN); //cor de fundo da tabela

        //adicionando a tabela em uma barra de rolagem, ficará envolta , pela mesma 
        JScrollPane scrollPane = new JScrollPane(table);
                 
        //adicionando ao JFrame "Formulário" a JTable "Tabela" 
        add(scrollPane);
    }

	public static void main(String[] args){
		int escolha = -1;
		
		while(true) {
			escolha = Menu.retornarEscolha();
		    if((escolha >= 0) && (escolha <= 4))
		    	break;
		    
		    System.out.println("Tente Novamente!");
		}
		switch(escolha) {
			case 1:
				MetodoBissecao mb = new MetodoBissecao();
				mb.bissecao();
				new Main(Constantes.METODO_BISSECAO, Constantes.COLUNAS_BISSECAO, mb.retornarDados()).setVisible(true);
			break;
			case 2:
				MetodoFalsaPosicao fp = new MetodoFalsaPosicao();
				fp.falsaPosicao();
				new Main(Constantes.METODO_FALSA_POSICAO, Constantes.COLUNAS_FALSA_POSICAO, fp.retornarDados()).setVisible(true);
			break;
			case 3:
				MetodoPontoFixo pf = new MetodoPontoFixo();
				pf.pontoFixo();
				new Main(Constantes.METODO_PONTO_FIXO, Constantes.COLUNAS_PONTO_FIXO, pf.retornarDados()).setVisible(true);
			break;
			case 4:
				//não concluido
			break;
			case 0:
				System.out.println("Fechando programa...");
				System.exit(0);
			break;
			default:
				//provalvelmente não vai acontecer...
			break;
			
		}
	}

}
