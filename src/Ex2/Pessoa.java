package Ex2;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;

	
	Pessoa(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}


	public static void main(String[] args) {

		Set<String> lista = new TreeSet<>();

		String a = new String ("Pedro");
		String b = new String ("José");
		String c = new String ("Carlos");
		String d = new String ("Bruna");
		String e = new String ("Carlos");
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		System.out.println(lista);
		
		
		
		
	}

	
}

//Crie uma classe Pessoa, está classe deve conter os seguintes atributos nome e
//idade. Adicione as pessoas a uma Lista (java.util.List), em seguida ordene a lista em
//ordem decrescente de nome e imprima os resultados.
