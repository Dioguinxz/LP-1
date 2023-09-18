package Ex2;

import java.util.Scanner;

public class TesteContaBancaria {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao;

		ContaBancaria cliente1 = new ContaBancaria();

		System.out.println("Informe seu saldo:");
		cliente1.setSaldo(teclado.nextDouble());

		do {

			System.out.println("Informe (1) para depositar, (2) para sacar, (3) para obter saldo ou (4) para sair: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o valor que será depositado:");
				double valorDeposito = teclado.nextDouble();

				cliente1.depositar(valorDeposito);
				System.out.println("Saldo depositado: " + valorDeposito);
				System.out.println("Saldo atual: " + cliente1.obterSaldo());
				break;

			case 2:
				System.out.println("Informe o valor que será sacado:");
				double valorSaque = teclado.nextDouble();

				cliente1.sacar(valorSaque);
				System.out.println("Saldo depositado: " + valorSaque);
				System.out.println("Saldo atual: " + cliente1.obterSaldo());
				break;

			case 3:
				System.out.println("Saldo atual: " + cliente1.obterSaldo());
				break;

			case 4:
				System.out.println("Programa Finalizado");
				System.exit(0);

			default:
				System.err.println("Opcão inválida!");
				break;
			}

		} while (opcao < 5);

	}

}
