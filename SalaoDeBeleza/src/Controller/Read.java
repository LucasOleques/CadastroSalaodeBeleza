package Controller;

import Model.Agendamento;

import static Controller.Create.*;

public class Read {
    // Método para listar atendimentos
    public static void listarAtendimentos() {
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
