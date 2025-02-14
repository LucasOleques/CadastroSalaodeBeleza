package View;

import Controller.*;
import Model.Cliente;

import java.util.Scanner;

public class Menu {
    public static Scanner scan = new Scanner(System.in);

    public static void ViewMenu() {
        int opcao;

        do {                 //Menu para reserva
            System.out.println("---Reserva Salão de Beleza---");
            System.out.println("  1. Cadastrar Cliente");
            System.out.println("  2. Cadastrar Serviço");
            System.out.println("  3. Agendar Atendimento");
            System.out.println("  4. Listar Atendimentos");
            System.out.println("  0. Exit");
            System.out.print("  Escolha uma opção: \n");
            opcao = scan.nextInt();     // Opção selecionada
            scan.nextLine();    // Limpar o buffer

            switch (opcao) {
                case 1:
                    Create.cadastrarCliente();
                    break;
                case 2:
                    Create.cadastrarServico();
                    break;
                case 3:
                    Create.agendarAtendimento();
                    break;
                case 4:
                    Read.listarAtendimentos();
                    break;
                case 5:
                    System.out.println("Digite o nome do usuário a ser deletado: ");
                    String nomeUsuario = scan.nextLine();
                    Delete.deletandoUsuario(nomeUsuario);
                case 6:
                    System.out.println("Digite o serviço a ser deletado: ");
                    String nomeServico = scan.nextLine();
                    Delete.deletandoServico(nomeServico);
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
