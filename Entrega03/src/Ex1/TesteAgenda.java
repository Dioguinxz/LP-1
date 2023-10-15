package Ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

//Criação da classe de teste
public class TesteAgenda {
	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		AgendaTelefonica a1 = new AgendaTelefonica();

		int opcao;

		// Criação do menu da agenda telefonica
		do {
			System.out.println("------------------AGENDA TELEFONICA---------------------");
			System.out.println("(1) - Adicionar um contato");
			System.out.println("(2) - Remover um contato");
			System.out.println("(3) - Procurar contato: ");
			System.out.println("(4) - Editar contato: ");
			System.out.println("(5) - Listar os contatos em ordem alfabetica:");
			System.out.println("(6) - Listar contatos pela data de nascimento:");
			System.out.println("(7) - Listar contatos pelo email: ");
			System.out.println("(8) - Listar anivesariantes do dia:");
			System.out.println("(9) - Sair");
			System.out.println("--------------------------------------------------------");
			opcao = teclado.nextInt();
			teclado.nextLine();

			// Criação dos casos correspondentes a cada opção do menu
			switch (opcao) {
			case 1:
				System.out.println("Nome: ");
				String nome = teclado.nextLine();
				System.out.println("Telefone: ");
				String telefone = teclado.nextLine();
				System.out.println("Email: ");
				String email = teclado.nextLine();
				System.out.println("Data de nascimento: (DIA-MÊS-ANO)");
				int dia = teclado.nextInt();
				int mes = teclado.nextInt();
				int ano = teclado.nextInt();
				// Tratamento de excessão caso o formato de data seja inválido
				try {
					LocalDate data = LocalDate.of(ano, mes, dia);
					Contato contato = new Contato(nome, telefone, email, data);
					a1.adicionarContato(contato);
					System.out.println("Contato adicionado com sucesso!");
				} catch (DateTimeException e) {
					System.err.println("Erro: Verifique se você digitou corretamente a data de naxcimento!");
				}
				break;

			case 2:
				System.out.println("Informe o nome do contato que você deseja remover: ");
				String nomeRemover = teclado.nextLine();
				a1.removerContato(nomeRemover);
				break;

			case 3:
				System.out.println("Informe o nome do contato que você deseja procurar: ");
				String nomeProcurar = teclado.nextLine();
				Contato ContatoProcurado = a1.procurarContato(nomeProcurar);
				;
				if (ContatoProcurado != null) {
					System.out.println("Contato encontrado: " + ContatoProcurado);
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;

			case 4:
				System.out.println("Informe o nome do contato que você deseja editar: ");
				String nomeEditar = teclado.nextLine();
				Contato contatoParaEditar = a1.procurarContato(nomeEditar);
				if (contatoParaEditar != null) {
					System.out.println("Novo Nome: ");
					String novoNome = teclado.nextLine();
					System.out.println("Novo Telefone: ");
					String novoTelefone = teclado.nextLine();
					System.out.println("Novo Email: ");
					String novoEmail = teclado.nextLine();
					System.out.println("Nova Data de Nascimento (DD-MM-AAAA): ");
					int diaNovo = teclado.nextInt();
					int mesNovo = teclado.nextInt();
					int anoNovo = teclado.nextInt();
					// Tratamento de excessão caso o formato de data seja inválido
					try {
						LocalDate dataNova = LocalDate.of(anoNovo, mesNovo, diaNovo);
						Contato contato = new Contato(novoNome, novoTelefone, novoEmail, dataNova);

						contatoParaEditar.setNome(novoNome);
						contatoParaEditar.setTelefone(novoTelefone);
						contatoParaEditar.setEmail(novoEmail);
						contatoParaEditar.setDataNascimento(dataNova);

						System.out.println("Registro editado com sucesso.");
					} catch (DateTimeException e) {
						System.out.println(
								"Erro ao editar registro. Certifique-se de que a data está no formato correto (DD-MM-AAAA).");
					}
				} else {
					System.out.println("Contato não encontrado.");
				}

				break;

			case 5:
				System.out.println("Lista de contatos em ordem alfabética:");
				a1.listarContatosOrdemAlfabetica();
				break;

			case 6:
				System.out.println("Lista de contatos por ordem de nascimento:");
				a1.listarContatosDataNascimento();
				break;

			case 7:
				System.out.println("Lista de contatos por ordem de email:");
				a1.listarContatosEmail();
				break;

			case 8:
				a1.listarAniversariantesDoDia();
				break;

			case 9:
				System.out.println("Agenda telefonica encerrada!");
				System.exit(0);
				break;

			default:
				System.err.println("Opção inválida!");
			}

		} while (opcao < 10);

	}

}