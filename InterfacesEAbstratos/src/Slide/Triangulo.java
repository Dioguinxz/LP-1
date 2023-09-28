package Slide;

public class Triangulo extends FiguraPlana {

	private double lado;
	private double base;
	private double altura;

	Triangulo(double base, double altura, double lado) {
		
		this.base = base;
		this.altura = altura;
		this.lado = lado;

	}

	double area() {
		return (base * altura) / 2;
	}

	double perimetro() {
		return lado * 3;
	}

}
