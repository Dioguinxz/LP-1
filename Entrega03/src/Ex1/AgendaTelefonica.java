package Ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Criação da classe AgendaTelefonica

public class AgendaTelefonica {

	//Criação de um ArrayList de contatos
	
	private ArrayList<Contato> contatos = new ArrayList<>();

	
	//Método para adicionar contatos na lista
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

	//Método para remover contatos da lista
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

	//Método para procurar um contato na lista
	public Contato procurarContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				return contato;
			}
		}
		System.out.println("Contato não encontrado.");
		return null;
	}

	//Método para editar contatos na lista
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

	
	//Método para listar contatos por ordem alfabática na lista
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

	//Método para listar contatos por data de nascimento na lista
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

	
	//Método para listar contatos por ordem de email na lista
	public void listarContatosEmail() {
		ComparaEmail c2 = new ComparaEmail();
		Collections.sort(contatos);
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento());
			System.out.println();
		}

	}

	//Método para listar aniversariantes do dia na lista
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