package Ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AgendaTelefonica {

	private ArrayList<Contato> contatos = new ArrayList<>();

	public boolean adicionarContato(String nome, String telefone, String email, LocalDate dataNascimento) {
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				System.out.println("Nome duplicado. O contato não foi adicionado.");
				return false;
			}
		}

		contatos.add(new Contato(nome, telefone, email, dataNascimento));
		return true;
	}

	public boolean removerContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				contatos.remove(contato);
				System.out.println("Contato removido.");
				return true;
			}
		}
		System.out.println("Contato não encontrado.");
		return false;
	}

	public void listarContatosOrdemAlfabetica() {
		Collections.sort(contatos);
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento());
			System.out.println();
		}
	}

	public void listarContatosDataNascimento() {
		ComparaContato c1 = new ComparaContato();
		Collections.sort(contatos, c1);
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento());
			System.out.println();
		}
	}

	public void listarContatosEmail() {
		ComparaContato c2 = new ComparaContato();
		Collections.sort(contatos, c2);
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento());
			System.out.println();
		}

	}

	public void listarAniversariantesDoDia() {
		LocalDate dataAtual = LocalDate.now();
		boolean aniversarianteEncontrado = false;

		for (Contato contato : contatos) {
			if (contato.getDataNascimento().getDayOfMonth() == dataAtual.getDayOfMonth()
					&& contato.getDataNascimento().getMonth() == dataAtual.getMonth()) {
				aniversarianteEncontrado = true;

			}
		}

		if (!aniversarianteEncontrado) {
			System.out.println("Não há aniversariantes.");
		}
		
	}
}
