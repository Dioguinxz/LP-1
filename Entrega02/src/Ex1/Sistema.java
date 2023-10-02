package Ex1;

import java.util.Scanner;


public class Sistema {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		ContaBancaria cliente1 = new ContaBancaria();
		
		cliente1.setLimite(500);
		

		System.out.println("Informe seu saldo:");
		cliente1.setSaldo(teclado.nextDouble());
		
		teclado.nextLine();
		
		System.out.println("Informe o nome do proprietário da conta:");
		cliente1.setProprietario(teclado.nextLine());
		
		try {
			System.out.println("Informe o valor de depósito:");
			cliente1.depositar(teclado.nextDouble());
			
			System.out.println("Informe o valor de saque:");
			cliente1.sacar(teclado.nextDouble());
			
		} catch (EstouroDeLimiteException e) {
			System.out.println("Erro de limite " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------");
		System.out.println("Nome: " + cliente1.getProprietario());
		System.out.println("Saldo atual: R$ " + cliente1.getSaldo());
		System.out.println("----------------------------------------");
	}

}
