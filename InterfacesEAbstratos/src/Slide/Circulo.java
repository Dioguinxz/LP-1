package Slide;

public class Circulo extends FiguraPlana {

	private double raio;
	private double comprimento;

	Circulo(double raio, double comprimento) {
		this.raio = raio;
		this.comprimento = comprimento;
	}

	double area() {
		return Math.PI * (raio * raio);
	}

	double perimetro() {
		return comprimento * 2 * Math.PI * raio;
	}

}
