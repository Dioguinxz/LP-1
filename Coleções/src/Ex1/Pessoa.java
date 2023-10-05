package Ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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

		List<String> lista = new ArrayList<>();

		lista.add("Pedro");
		lista.add("João");
		lista.add("Bruna");
		lista.add("Luiz");

		
		Collections.sort(lista);
		System.out.println(lista);
		
		
		
		
		
	}

	
}

//Crie uma classe Pessoa, está classe deve conter os seguintes atributos nome e
//idade. Adicione as pessoas a uma Lista (java.util.List), em seguida ordene a lista em
//ordem decrescente de nome e imprima os resultados.
