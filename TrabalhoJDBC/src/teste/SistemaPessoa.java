package teste;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.h2.message.DbException;

public class SistemaPessoa {

	public static void main(String[] args) throws DbExcetion {
		Scanner teclado = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 9) {
			imprimirMenu();

			System.out.println("Informe uma opção");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				inserir();
				break;
			case 2:
				listarNome();
				break;

			case 3:
				listarSobrenome();
				break;

			case 4:
				listarEmail();
				break;
				
			case 5:
				remover();
				break;
			}
		}
	}

	public static void inserir() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um nome: ");
		String nome = teclado.next();

		System.out.println("Informe um sobrenome: ");
		String sobrenome = teclado.next();

		System.out.println("Informe a idade: ");
		int idade = teclado.nextInt();

		teclado.nextLine();

		System.out.println("Informe o email: ");
		String email = teclado.nextLine();

		System.out.println("Informe o telefone: ");
		String telefone = teclado.nextLine();

		System.out.println("Informe o ID: ");
		int id = teclado.nextInt();

		Pessoa pessoa = new Pessoa(id, nome, sobrenome, idade, email, telefone);

		PessoaDB db = new PessoaDB();

		try {
			db.inserir(pessoa);
		} catch (DbExcetion e) {
			System.err.println(e.getMessage());
		}
	}

	public static void listarNome() throws DbExcetion {

		List<Pessoa> pessoas = PessoaDB.listarNome();

		try {
			for (Pessoa pessoa : pessoas) {
				System.out.println(">> " + pessoa.getNome());
			}

		} catch (DbException e) {
			System.err.println(e.getMessage());

		}

	}

	public static void listarSobrenome() throws DbExcetion {

		List<Pessoa> pessoas = PessoaDB.listarNome();

		try {
			for (Pessoa pessoa : pessoas) {
				System.out.println(">> " + pessoa.getSobrenome());
			}

		} catch (DbException e) {
			System.err.println(e.getMessage());

		}

	}

	public static void listarEmail() throws DbExcetion {

		List<Pessoa> pessoas = PessoaDB.listarEmail();

		try {
			for (Pessoa pessoa : pessoas) {
				System.out.println(">> " + pessoa.getEmail());
			}

		} catch (DbException e) {
			System.err.println(e.getMessage());

		}

	}

	public static void remover() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o ID: ");
		int id = teclado.nextInt();
		
		try {
			PessoaDB.remover(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void imprimirMenu() {
		System.out.println("1 - Inserir");
		System.out.println("2 - Listar por nome:");
		System.out.println("3 - Listar por sobrenome:");
		System.out.println("4 - Listar por email: ");
		System.out.println("5 - Remover Pessoa: ");

	}
}
