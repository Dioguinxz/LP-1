package Ex1;

import java.util.List;

public class Pais {

	private String nome;
	private String codigo;
	private double populacao;
	private double dimensao;
	private List<Pais> fronteiras;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPopulacao() {
		return populacao;
	}

	public List<Pais> getFronteiras() {
		return fronteiras;
	}

	public void setFronteiras(List<Pais> fronteiras) {
		this.fronteiras = fronteiras;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	Pais(String codigo, String nome, double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;

	}

	public void verificarPaisIgual() {

		if (codigo.equals(codigo)) {
			System.out.println("Países sao iguais");
		} else {
			System.out.println("Países são diferentes");
		}

	}
	
	public double densidadePopulacional () {
		 double densidade = populacao / dimensao;
		System.out.println("Densidade populacional: " + densidade);
		return densidade;
	
	}
	
	
	
	
	}



//Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.:Brasil), 
//população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.:8.515.767,049). 
//Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira.
//
//Escreva a classe em Java eforneça os seus membros a seguir:

//a) Construtor que inicialize o código ISO, o nome e a dimensão do país;

//b) Métodos de acesso (getter/setter) para as propriedades código ISO, nome, população e dimensão do país;

//c) Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;

//d) 0

//e) Um método que retorne a densidade populacional do país;

//f) Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países.

//Considere que um país tem no máximo 10 outros países com os quais ele faz fronteira ().

