package Slide;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TesteFigurasPlanas {

	public static void main(String[] args) {

		Quadrado q1 = new Quadrado(10, 10, 10);
		Triangulo t1 = new Triangulo(3, 3, 3);
		Retangulo r1 = new Retangulo(4.5, 4.5, 4.5);
		Circulo c1 = new Circulo(25, 4);

		ArrayList<FiguraPlana> Figuras = new ArrayList<>();
		Figuras.add(q1);
		Figuras.add(t1);
		Figuras.add(r1);
		Figuras.add(c1);
		
		for (FiguraPlana f : Figuras) {
			System.out.println(">>"+f.getClass()+" "+"Area:" + f.area());
			System.out.println("Perimetro: " + f.perimetro() );
			
			
		}

	}

}
