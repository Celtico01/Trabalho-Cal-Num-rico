package metodos.entidades;

public abstract class Metodo {
	private double interA; // intervalo a
	private double interB; // intervalo b
	private double precisao; // erro minimo
	private long interacoes; // numero de interacoes
	private double raiz; // raiz
	

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
}
