package metodos.entidades;

public final class MetodoPontoFixo extends MetodoEncontrarRaiz{
	private String[][] dados = new String[20][9];
	private int linha;
	private int coluna;

	protected double funcao(double x) { //definindo a funcao do metodo
		return (Math.pow(x, 2)) - (Math.pow(Math.E, x));
	}
	
	protected double funcaoG(double x) {
		return -Math.sqrt(Math.pow(Math.E, x));
	}
	
	private void guardaDados(double dado, int linha, int coluna){
		dados[linha][coluna] = String.valueOf(dado);
	}
	private void guardaDados(int dado, int linha, int coluna){
		dados[linha][coluna] = String.valueOf(dado);
	}
	
	public String[][] retornarDados(){ // retornando os dados coletados para gerar a tabela
		return dados;
	}
	public double pontoFixo() {
		setPrecisao(0.0001);
		setInterA(-1);
		setInterB(0);
		setRaiz(getInterA());
		setInteracoes(100);
		setContador(1);
		setErro(1);
		
		this.linha = 0;
		while(getErro() > getPrecisao() && getInteracoes() > getContador()) {
			this.coluna = 0;
			guardaDados(getContador(), linha, coluna);
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
			guardaDados(getErro(), linha, coluna);
			this.coluna++;
			this.linha++;
				
			setTemp(getRaiz());
			setRaiz(funcaoG(getTemp()));
			
			setErro(Math.abs((getRaiz() - getTemp())));
				
			if(funcao(getInterA()) * funcao(getRaiz()) < 0) {
				setInterB(getRaiz());
			}
			else {
				setInterA(getRaiz());
			}	
			setContador(getContador() + 1);
		}
		return getRaiz();	
	}
	
}
