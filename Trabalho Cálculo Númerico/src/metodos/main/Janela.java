package metodos.main;

import java.awt.Dimension; // criar uma nova dimensão de janela
import java.awt.FlowLayout; // criar um tipo de layout da janela
import javax.swing.JFrame; // a janela
import javax.swing.JScrollPane; // rolagem da janela
import javax.swing.JTable; //criador da tabela
import java.awt.Toolkit; // descobrir a resolução do usuario
import java.awt.Color; // utilizar cores


public class Janela extends JFrame {
	//Color minhaCor1 = new Color(0, 139, 139); // criando uma cor '-'
	//Color minhaCor2 = new Color(178,243,243);
	
	private static final long serialVersionUID = 1L;
	 
    private JTable table;
    
    public Janela() {} //temporario
    
    public Janela(String nomeJanela, String[] coluna, String[][] dados) { //CONSTRUTOR DA CLASSE
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
}
