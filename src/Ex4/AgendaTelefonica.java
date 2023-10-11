package Ex4;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class AgendaTelefonica implements Comparable<AgendaTelefonica> {

	private String nome;
	private String telefone;
	private String email;
	private LocalDate dataNascimento;

	AgendaTelefonica(String nome, String telefone, String email, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public int compareTo(AgendaTelefonica o) {
		return getNome().compareTo(getNome());
	}
	
	

	public static void main(String[] args) {
		Set<AgendaTelefonica> agenda = new TreeSet<>();

		AgendaTelefonica a = new AgendaTelefonica("José", "(51) 9999-9999", "jose@gmail.com", LocalDate.of(2000, 10, 15));
		AgendaTelefonica b = new AgendaTelefonica("Maria", "(51) 8888-9999", "maria@gmail.com", LocalDate.of(2006, 8, 05));
		AgendaTelefonica c = new AgendaTelefonica("Bruna", "(51) 1259-4566", "bruna@gmail.com", LocalDate.of(2001, 9, 24));
		AgendaTelefonica d = new AgendaTelefonica("Pedro", "(51) 1111-1111", "pedro@gmail.com", LocalDate.of(1998, 03, 14));

		agenda.add(a);
		agenda.add(b);
		agenda.add(c);
		agenda.add(d);
		System.out.println();

		
	}


	
}
