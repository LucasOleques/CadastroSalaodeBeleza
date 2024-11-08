package Controller;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import static View.Menu.scan;

public class Create {
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Servico> servicos = new ArrayList<>();
    public static ArrayList<Agendamento> agendamentos = new ArrayList<>();

    // Método para cadastrar cliente
    public static void cadastrarCliente() {

        System.out.println("--- Cadastro de Cliente ---");

        System.out.print("Nome: ");
        String nomecliente = scan.nextLine();
        while(nomecliente == null || nomecliente.isEmpty()){
            System.out.println("Nome não pode ser vazio ou nulo!");
            System.out.println("Digite o Nome corretamente: ");
            nomecliente = scan.nextLine();
        }

        System.out.print("Email: ");
        String email = scan.nextLine();
        while(email == null || email.isEmpty()){
            System.out.println("Email não pode ser vazio ou nulo!");
            System.out.println("Digite o Email corretamente: ");
            email = scan.nextLine();
        }

        System.out.print("Telefone: ");
        double telefone = scan.nextInt();
        scan.nextLine();

        System.out.print("Endereço: ");
        String endereco = scan.nextLine();
        while(endereco == null || endereco.isEmpty()){
            System.out.println("Endereço não pode ser vazio ou nulo!");
            System.out.println("Digite o Endereço corretamente: ");
            endereco = scan.nextLine();
        }

        Cliente cliente = new Cliente(nomecliente,email, telefone, endereco);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado");
    }

    // Método para cadastrar serviço
    public static void cadastrarServico() {
        System.out.println("--- Cadastro de Serviço ---");
        System.out.print("Tipo do Serviço: ");      //Ex. corte, pintura, unhas.
        String nome = scan.nextLine();
        while(nome == null || nome.isEmpty()){
            System.out.println("Nome não pode ser vazio ou nulo!");
            System.out.println("Digite o Nome corretamente: ");
            nome = scan.nextLine();
        }

        System.out.print("Descrição do Serviço: ");     //Ex. Corte de Cabelo, Pintura do Cabelo, Unhas dos pés, Unhas das mãos.
        String descricaoservico = scan.nextLine();
        while(descricaoservico == null || descricaoservico.isEmpty()){
            System.out.println("Descrição do Serviço não pode ser vazio ou nulo!");
            System.out.println("Digite a Descrição do Serviço corretamente: ");
            descricaoservico = scan.nextLine();
        }

        System.out.print("Valor do Serviço: ");       //Ex. Valor a ser pago do serviço.
        String valor = scan.nextLine();
        while(valor == null || valor.isEmpty()){
            System.out.println("O Valor não pode ser vazio ou nulo!");
            System.out.println("Digite o Valor corretamente: ");
            valor = scan.nextLine();
        }

        Servico servico = new Servico(nome, descricaoservico , valor);
        servicos.add(servico);
        System.out.println("Serviço cadastrado");
    }
    // Método para agendar atendimento
    public static void agendarAtendimento() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }

        if (servicos.isEmpty()) {
            System.out.println("Não há serviços cadastrados.");
            return;
        }

        System.out.println("--- Agendamento de Atendimento --- ");

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

        // Data Agendamento
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "";
        LocalDate dataFormatada = null;

        do {
            System.out.print("Digite uma data no formato dd/MM/yyyy: "); // Exibido sempre antes da entrada
            data = scan.next().trim();
            scan.nextLine();

            try {
                dataFormatada = LocalDate.parse(data, formatoEntrada);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! Tente novamente.");
            }
        } while (dataFormatada == null); // Repete até que a data seja válida

        System.out.println("Data válida digitada: " + dataFormatada.format(formatoEntrada));
        //Horário Agendamento
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horario = "";
        LocalTime horarioFormatado = null;

        do {
            System.out.print("Digite um horário no formato HH:mm: ");
            horario = scan.next().trim();
            scan.nextLine();

            try {
                horarioFormatado = LocalTime.parse(horario, formatoHora);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido! Tente novamente.");
            }
        } while (horarioFormatado == null); // Repete até que o horário seja válido

        System.out.println("Horário válido digitado: " + horarioFormatado.format(formatoHora));

        Agendamento atendimento = new Agendamento(cliente, servico, data, horario);
        agendamentos.add(atendimento);
        System.out.println("Atendimento agendado.");
    }
}

