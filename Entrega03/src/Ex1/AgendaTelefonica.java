package Ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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

}