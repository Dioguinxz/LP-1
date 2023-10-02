package Ex1;

import java.util.Scanner;
import java.lang.Throwable;

public class ContaBancaria extends Exception {

	private double saldo;
	private double limite;
	private String proprietario;

	public ContaBancaria() {
		this.saldo = saldo;
		this.limite = limite;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {

		this.limite = limite;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor de depósito não pode ser menor que 0.");
		}
		saldo = saldo + valor;
	}

	public void sacar(double valor) throws EstouroDeLimiteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor de depósito não pode ser menor que 0.");
		}

		if (saldo + limite < valor) {
			throw new EstouroDeLimiteException("Estouro de Limite");
		}

		saldo = saldo - valor;
	}

}

//Toda conta deve ter um limite. Quando este for exercido a exceção verificada EstouroDeLimiteException deve ser lançada.
//Quando os valores informados para saque e deposito forem menores que zero a exceção não verificada IllegalArgumentException deve ser lançada.
