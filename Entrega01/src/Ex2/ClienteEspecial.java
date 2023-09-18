package Ex2;
import java.util.Scanner;

public class ClienteEspecial extends ContaBancaria  {
	

//	public double sacar(double quantia) {
//		// System.out.println("Informe o valor que será sacado:");
//		//double valorSaque = teclado.nextDouble() - quantia + (quantia * 0.05);
//
//		// System.out.println("Saldo sacado: " + valorSaque);
//		// System.out.println("Saldo atual: " + (valorSaque + saldo));
//		//this.saldo = this.saldo - quantia + (quantia * 0.05);
//		
//		
//		return quantia;

	//}
	
	public double sacar(double quantia) {
		this.saldo = this.saldo - quantia + (quantia * 0.01);
		return quantia;
	
	}
	
	
	

}
