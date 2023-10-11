package Ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Contato implements Comparable <Contato> { 

	private String nome;
	private String telefone;
	private String email;
	private LocalDate dataNascimento;

	Contato(String nome, String telefone, String email, LocalDate dataNascimento) {
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
	public int compareTo(Contato outroContato) {
        return this.nome.compareTo(outroContato.nome);
}
	
}

