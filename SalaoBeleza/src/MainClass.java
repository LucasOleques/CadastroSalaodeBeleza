import java.util.Scanner;
import java.util.ArrayList;
public class MainClass {
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Servico> servicos = new ArrayList<>();
    private static ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do{                 //Menu para reserva
            System.out.println("---Reserva Salão de Beleza---");
            System.out.println("  1. Cadastrar Cliente");
            System.out.println("  2. Cadastrar Serviço");
            System.out.println("  3. Agendar Atendimento");
            System.out.println("  4. Listar Atendimentos");
            System.out.println("  0. Exit");
            System.out.print("  Escolha uma opção: ");
            opcao = scan.nextInt();     // Opção selecionada
            scan.nextLine();    // Limpar o buffer

            switch (opcao) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarServico();
                    break;
                case 3:
                    agendarAtendimento();
                    break;
                case 4:
                    listarAtendimentos();
                    break;
                    default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 0);
}

// Método para cadastrar cliente
private static void cadastrarCliente() {
    System.out.println("--- Cadastro de Cliente ---");
    System.out.print("Nome: ");
    String nome = scan.nextLine();
    System.out.print("Email: ");
    String email = scan.nextLine();
    System.out.print("Telefone: ");
    String telefone = scan.nextLine();
    System.out.print("Endereço: ");
    String endereco = scan.nextLine();

    Cliente cliente = new Cliente(nome, email, telefone, endereco);
    clientes.add(cliente);
    System.out.println("Cliente cadastrado");
}

// Método para cadastrar serviço
private static void cadastrarServico() {
    System.out.println("--- Cadastro de Serviço ---");
    System.out.print("Tipo do Serviço: ");      //Ex. corte, pintura, unhas.
    String nome = scan.nextLine();
    System.out.print("Descrição do Serviço: ");     //Ex. Corte de Cabelo, Pintura do Cabelo, Unhas dos pés, Unhas das mãos.
    String descricaoservico = scan.nextLine();
    System.out.print("Valor do Serviço: ");       //Ex. Valor a ser pago do serviço.
    String valor = scan.nextLine();

    Servico servico = new Servico(nome, descricaoservico , valor);
    servicos.add(servico);
    System.out.println("Serviço cadastrado");
}

// Método para agendar atendimento
private static void agendarAtendimento() {
    if (clientes.isEmpty()) {
        System.out.println("Não há clientes cadastrados.");
        return;
    }

    if (servicos.isEmpty()) {
        System.out.println("Não há serviços cadastrados.");
        return;
    }

    System.out.println("--- Agendamento de Atendimento ---");

    // Escolher cliente
    System.out.println("Clientes disponíveis:");
    for (int i = 0; i < clientes.size(); i++) {
        System.out.println((i + 1) + ". " + clientes.get(i).getNomecliente());
    }
    System.out.print("Escolha o número do cliente: ");
    int clienteIndex = scan.nextInt() - 1;
    Cliente cliente = clientes.get(clienteIndex);

    // Escolher serviço
    System.out.println("Serviços disponíveis:");
    for (int i = 0; i < servicos.size(); i++) {
        System.out.println((i + 1) + ". " + servicos.get(i).getNome());
    }
    System.out.print("Escolha o número do serviço: ");
    int servicoIndex = scan.nextInt() - 1;      // -1 por fazer a leitura do 'zero'
    Servico servico = servicos.get(servicoIndex);

    // Data e horário
    System.out.print("Data: ");
    String data = scan.nextLine();
    System.out.print("Horário: ");
    String horario = scan.nextLine();

    Agendamento atendimento = new Agendamento(cliente, servico, data, horario);
    agendamentos.add(atendimento);
    System.out.println("Atendimento agendado.");
}

// Método para listar atendimentos
private static void listarAtendimentos() {
    if (agendamentos.isEmpty()) {
        System.out.println("Não há atendimentos agendados.");
    } else {
        System.out.println("--- Lista de Atendimentos ---");
        for (Agendamento atendimento : agendamentos) {
            System.out.println(atendimento.toString());
            }
        }
    }
}