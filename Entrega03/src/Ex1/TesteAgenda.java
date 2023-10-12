package Ex1;

import java.util.Scanner;

public class TesteAgenda {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		AgendaTelefonica a1 = new AgendaTelefonica();
		
		int opcao;
		
		
		
		do {
		System.out.println("------------------AGENDA TELEFONICA---------------------");
		System.out.println("(1) - Adicionar um contato"); 
		System.out.println("(2) - Remover um contato");
		System.out.println("(3) - Editar contato: ");
		System.out.println("(4) - Listar os contatos em ordem alfabetica");
		System.out.println("(5) - Listar contatos pela data de nascimento:");
		System.out.println("(6) - Listar contatos pelo email: ");
		System.out.println("(7) - Listar anivesariantes do dia:");
		System.out.println("(8) - Sair");	
		System.out.println("--------------------------------------------------------");
		opcao = teclado.nextInt();	
		
			
		} while (opcao < 8);
		
		
		
		

	}

}
