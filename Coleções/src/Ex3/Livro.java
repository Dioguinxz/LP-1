package Ex3;

public class Livro {

	private String titulo;
	private String autor;
	private String codigo;
	private String isbn;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	
	
}


//Crie uma classe Livro, está deve possuir os seguintes atributos: título, autor e código
//ISBN. Crie uma estrutura de armazenamento onde seja possível guardar os livros e
//recuperar um registro diretamente pelo código ISBN (Utilize o Collection Framework
//para resolver