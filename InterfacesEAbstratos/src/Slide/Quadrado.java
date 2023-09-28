package Slide;

public class Quadrado extends FiguraPlana {

	private double base;
	private double altura;
	private double lado;

	
	Quadrado (double base, double altura, double lado) {
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	double area() {
		return base * altura;
	}

	double perimetro() {
		
	
		return lado * 4;
	}

}
