package Slide;

public class Retangulo extends FiguraPlana {

	private double lado;
	private double base;
	private double altura;

	Retangulo(double base, double altura, double lado) {
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}

	double area() {
		return (base * altura);
	}

	double perimetro() {
		return lado * 4;
	}

}
