package teste;

import java.util.Objects;

public class Pessoa {

	private Integer id;

    private String nome;

    private String sobrenome;

    private  Integer idade;

    public Pessoa(Integer id, String nome, String sobrenome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa Pessoa = (Pessoa) o;
        return Objects.equals(id, Pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
