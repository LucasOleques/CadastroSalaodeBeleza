import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<CadastroCliente> cadastroClientes = new ArrayList<>();
    private static ArrayList<CadastroServico> cadastroServicos = new ArrayList<>();
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
            System.out.println("  Escolha uma opção: ");
            opcao = scan.nextInt();     // Opção selecionada
            scan.nextLine();    // Limpar o buffer

            switch (opcao) {
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
            case 5:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 5);
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

    CadastroCliente cliente = new CadastroCliente(nome, email, telefone, endereco);
    cadastroClientes.add(cliente);
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

    CadastroServico servico = new CadastroServico(nome, descricaoservico , valor);
    cadastroServicos.add(servico);
    System.out.println("Serviço cadastrado");
}

// Método para agendar atendimento
private static void agendarAtendimento() {
    if (cadastroClientes.isEmpty()) {
        System.out.println("Não há clientes cadastrados.");
        return;
    }

    if (cadastroServicos.isEmpty()) {
        System.out.println("Não há serviços cadastrados.");
        return;
    }

    System.out.println("--- Agendamento de Atendimento ---");

    // Escolher cliente
    System.out.println("Clientes disponíveis:");
    for (int i = 0; i < cadastroClientes.size(); i++) {
        System.out.println((i + 1) + ". " + cadastroClientes.get(i).getNome());
    }
    System.out.print("Escolha o número do cliente: ");
    int clienteIndex = scan.nextInt() - 1;
    CadastroCliente cliente = cadastroClientes.get(clienteIndex);

    // Escolher serviço
    System.out.println("Serviços disponíveis:");
    for (int i = 0; i < cadastroServicos.size(); i++) {
        System.out.println((i + 1) + ". " + cadastroServicos.get(i).getNome());
    }
    System.out.print("Escolha o número do serviço: ");
    int servicoIndex = scan.nextInt() - 1;      // -1 por fazer a leitura do 'zero'
    CadastroServico servico = cadastroServicos.get(servicoIndex);

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