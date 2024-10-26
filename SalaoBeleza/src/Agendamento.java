public class Agendamento {

    private Cliente cliente;
    private Servico servico;
    private String data;
    private String horario;

    public Agendamento(Cliente cliente, Servico servico, String data, String horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    //Getters & Setters
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Atendimento: " + cliente.getNomecliente() + " - Serviço: " + servico.getNome() + " - Data: " + data + " - Horário: " + horario;
    }
    public boolean isValidAgendamentoToStringEmpty(String toString) {
        return toString.isEmpty();
    }
}
