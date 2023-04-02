package metodos.entidades;

public abstract class MetodoEncontrarRaiz {
	private double interA; // intervalo a
	private double interB; // intervalo b
	private double precisao; // precisao do erro
	private long interacoes; // numero de interacoes
	private double raiz; // raiz
	private int contador;
	private double temp; //raiz temporaria
	private double erro;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getErro() {
		return erro;
	}

	public void setErro(double erro) {
		this.erro = erro;
	}

	public double getPrecisao() {
		return precisao;
	}

	public void setPrecisao(double precisao) {
		this.precisao = precisao;
	}

	public double getRaiz() {
		return raiz;
	}

	public void setRaiz(double raiz) {
		this.raiz = raiz;
	}

	public long getInteracoes() {
		return interacoes;
	}

	public void setInteracoes(long interacoes) {
		this.interacoes = interacoes;
	}

	public double getInterA() {
		return interA;
	}

	public void setInterA(double interA) {
		this.interA = interA;
	}

	public double getInterB() {
		return interB;
	}

	public void setInterB(double interB) {
		this.interB = interB;
	}

	protected abstract double funcao(double x);
	
	public static String funcaoUtilizada() {
		return "x^2 - e^2";
	}
}
