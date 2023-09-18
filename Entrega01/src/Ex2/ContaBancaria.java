package Ex2;

import java.util.Scanner;

public class ContaBancaria {

	public double quantia;
	public double saldo;

	Scanner teclado = new Scanner(System.in);

	public double getQuantia() {
		return quantia;
	}

	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double quantia) {

		this.saldo = this.saldo + quantia;
		return quantia;

	}

	public double sacar(double quantia) {
		// System.out.println("Informe o valor que será sacado:");
		//double valorSaque = teclado.nextDouble() - quantia + (quantia * 0.05);

		// System.out.println("Saldo sacado: " + valorSaque);
		// System.out.println("Saldo atual: " + (valorSaque + saldo));
		this.saldo = this.saldo - quantia + (quantia * 0.05);

		return quantia;

	}

	public double obterSaldo() {
//		double saldoAtual = saldo;
//		System.out.println("Saldo atual: " + saldoAtual);
		return this.saldo;

	}

}

//Crie uma classe para representar uma conta bancária, com métodos para depositar uma quantia, sacar uma quantia e obter o saldo.

//Para cada saque será debitada também uma taxa de operação equivalente à 0,5% do valor sacado.

//Crie, em seguida, uma subclasse desta classe anterior para representar uma conta corrente de um cliente especial.

//Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. Faça testes com as duas classes e verifique seus resultados.
