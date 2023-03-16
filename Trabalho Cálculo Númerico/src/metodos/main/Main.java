package metodos.main;

import metodos.entidades.*; // importando os metodos criados
import constantes.*;
import java.util.Scanner;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;
import java.io.IOException;
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
        setLocationRelativeTo(null);//centralizado
        setTitle(nomeJanela);//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setando a ação padrão de fechamento do Formulário, neste caso  irá fechar o programa
        setExtendedState(JFrame.MAXIMIZED_BOTH); //setando o programa para começar em tela cheia
        
        getContentPane().setBackground(Color.BLACK); //cor de fundo da aba
        
        //instanciando a JTable
        table = new JTable(dados, coluna); // passando os dados da tabela
        table.setPreferredScrollableViewportSize(tela.getSize());//barra de rolagem
        table.setFillsViewportHeight(true);
        table.setBackground(Color.CYAN); //cor de fundo da tabela

        //adicionando a tabela em uma barra de rolagem, ficará envolta , pela mesma 
        JScrollPane scrollPane = new JScrollPane(table);
                 
        //adicionando ao JFrame "Formulário" a JTable "Tabela" 
        add(scrollPane);
    }

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		//MetodoBissecao mb = new MetodoBissecao();
		//MetodoFalsaPosicao fp = new MetodoFalsaPosicao();
		
		//mb.bissecao();
		
		//fp.falsaPosicao();
		
		//new Main(Constantes.METODO_FALSA_POSICAO, Constantes.COLUNAS_FALSA_POSICAO, fp.retornarDados()).setVisible(true);
			
		//new Main(Constantes.METODO_BISSECAO, Constantes.COLUNAS_BISSECAO, mb.retornarDados()).setVisible(true);
		
		System.out.println(menu.retornarEscolha());
		/*switch(Menu.retornarEscolha()) {
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
			//não concluido
		break;
		case 4:
			//não concluido
		break;
		case 0:
			System.exit(0);
		break;
		default:
			//provalvelmente não vai acontecer...
		break;
			
		}
		*/
		
		scan.close();
	}

}
