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

	public boolean adicionarContato(Contato contato) {
		for (Contato c : contatos) {
			if (c.getNome().equalsIgnoreCase(contato.getNome())) {
				System.out.println("Esse contato já existe!");
				return false;
			}
		}
		
		  contatos.add(contato);
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

	public Contato procurarContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				//System.out.println(contato);
				return contato;
			}
		}
		System.out.println("Contato não encontrado.");
		return null;
	}

	public void editarContato(String nome, Contato novoContato) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
				contatos.set(i, novoContato);
				System.out.println("Contato editado.");
				return;
			}
		}
		System.out.println("Contato não encontrado.");
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
				System.out.println("Aniversariante do dia: " + contato.getNome());

			}
		}

		if (!aniversarianteEncontrado) {
			System.out.println("Não há aniversariantes.");
		}

	}

}