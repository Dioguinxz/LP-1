package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro implements Comparable<Livro> {
	Scanner teclado = new Scanner(System.in);

	private String titulo;
	private String autor;
	private String isbn;

	Livro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;

	}

	@Override
	public int compareTo(Livro o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		List<Livro> lista = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);

		Livro a = new Livro("O Espelho", "Machado de Assis", "ABC-123");
		Livro b = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "CBA-321");
		Livro c = new Livro("O Alquimista", "Paulo Coelho", "DEF-456");
		Livro d = new Livro("Crepúsculo", "Stephanie Meyer", "JKL-789");

		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);

		Livro livroEncontrado = null;

		System.out.println("Informe o códio desejado:");
		String codigo = teclado.nextLine();
		for (Livro livro : lista) {
			if (livro.getIsbn().equals(codigo)) {
				livroEncontrado = livro;
			}
		}

		if (livroEncontrado != null) {
			System.out.println("Livro: " + livroEncontrado.titulo);

		} else {
			System.err.println("Livro não encontrado!");
		}

	}

}

//Crie uma classe Livro, está deve possuir os seguintes atributos: título, autor e código
//ISBN. Crie uma estrutura de armazenamento onde seja possível guardar os livros e
//recuperar um registro diretamente pelo código ISBN (Utilize o Collection Framework
//para resolver