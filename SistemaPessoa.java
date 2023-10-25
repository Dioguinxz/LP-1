package teste;

import java.util.Scanner;

public class SistemaPessoa {

	
	   public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        int opcao = 0;

	        while (opcao != 5) {
	            imprimirMenu();

	            System.out.println("Informe uma opção");
	            opcao = teclado.nextInt();

	            switch (opcao) {
	                case 1:
	                    inserir();
	                    break;
	                   
	                case 3:
	                	
	                	break;
	                	
	                case 4:
	                    
	                    break;
	                case 5:
	                    break;
	            }
	        }
	    }
	
	
	
	public  static  void inserir() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        String nome = teclado.next();

        System.out.println("Informe um sobrenome: ");
        String sobrenome = teclado.next();

        System.out.println("Informe a idade: ");
        int idade = teclado.nextInt();

        System.out.println("Informe o ID: ");
        int id = teclado.nextInt();

        Pessoa pessoa = new Pessoa(id, nome, sobrenome, idade);

        PessoaDB db = new PessoaDB();

        try {
            db.inserir(pessoa);
        } catch (DbExcetion e) {
            System.err.println(e.getMessage());
        }
    }
	
	  public  static  void imprimirMenu(){
	        System.out.println("1 - Inserir");
	        System.out.println("2 - Remover");
	        System.out.println("3 - Listar por nome Aproximado");
	        System.out.println("4 - Listar");
	        System.out.println("5 - Sair");
	    }
}
