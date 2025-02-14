package Controller;

import java.util.ArrayList;
import Model.Cliente;
import Model.Servico;

import static Controller.Create.clientes;
import static Controller.Create.servicos;

public class Delete {

    public static ArrayList<Cliente> deletandoUsuario(String nomeCliente) {
        Cliente clienteDeletar = null;

        for(Cliente cliente : clientes){
            if(cliente.getNomecliente().equals(nomeCliente)){
                clienteDeletar = cliente;
                break;
            }
        }

        if(clienteDeletar != null) {
            clientes.remove(clienteDeletar);
            System.out.println("Cliente deletado.");
        } else {
            System.out.println("Cliente não encontrado.");
        }

        return clientes;
    }

    public static ArrayList<Servico> deletandoServico(String nomeServico) {
        Servico servicoDeletar = null;

        for(Servico servico : servicos){
            if(servico.getNome().equals(nomeServico)){
                servicoDeletar = servico;
                break;
            }
        }

        if(servicoDeletar != null) {
            clientes.remove(servicoDeletar);
            System.out.println("Cliente deletado.");
        } else {
            System.out.println("Cliente não encontrado.");
        }

        return servicos;
    }
}
