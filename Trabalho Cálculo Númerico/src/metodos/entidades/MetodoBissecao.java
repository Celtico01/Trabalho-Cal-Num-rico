package metodos.entidades;

public final class MetodoBissecao extends Metodo{
	String[][] dados = new String[15][9];
	int linha;
	int coluna;


	protected double funcao(double x) { //definindo a funcao do metodo
		return (Math.pow(x, 2)) - (Math.pow(Math.E, x));
	}
	
	protected void guardaDados(double dado, int linha, int coluna){
		dados[linha][coluna] = String.valueOf(dado);
	}
	protected void guardaDados(int dado, int linha, int coluna){
		dados[linha][coluna] = String.valueOf(dado);
	}
	
	public String[][] retornarDados(){ // retornando os dados coletados para gerar a tabela
		return dados;
	}
	
	public double bissecao() {		
		setPrecisao(0.0001);
		setInterA(-1);
		setInterB(0);
		setRaiz(getInterA());
		setInteracoes(100);
		
		double temp; // armazenar a raiz temporaria
		int contador = 1;
		double erro = 1;
		if(funcao(getInterA()) * funcao(getInterB()) < 0 ) {
			linha = 0;
			while(erro > getPrecisao() && getInteracoes() > contador) {
				coluna = 0;
				guardaDados(contador, linha, coluna);
				this.coluna++;
				guardaDados(getInterA(), linha, coluna);
				this.coluna++;
				guardaDados(getInterB(), linha, coluna);
				this.coluna++;
				guardaDados(funcao(getInterA()), linha, coluna);
				this.coluna++;
				guardaDados(funcao(getInterB()), linha, coluna);
				this.coluna++;
				guardaDados(getRaiz(), linha, coluna);
				this.coluna++;
				guardaDados(funcao(getRaiz()), linha, coluna);
				this.coluna++;
				guardaDados(funcao(getInterA()) * funcao(getRaiz()), linha, coluna);
				this.coluna++;
				guardaDados(erro, linha, coluna);
				this.coluna++;		
				this.linha++;
				
				temp = getRaiz();
				setRaiz((getInterA() + getInterB()) / 2);	
				
				erro = Math.abs((getRaiz() - temp) / getRaiz());
				
				if((funcao(getInterA()) * funcao(getRaiz())) < 0) {
					setInterA(getRaiz());
				}
				else {
					setInterB(getRaiz());		
				}
				contador++;
			}
			return getRaiz();
		}
		else {
			System.out.println("A função não possui raiz no intervalo dado");
			return -404;
		}
	}
}
