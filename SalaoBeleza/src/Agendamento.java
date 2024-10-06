public class Agendamento {

    private CadastroCliente cliente;
    private CadastroServico servico;
    private String data;
    private String horario;

    public Agendamento(CadastroCliente cliente, CadastroServico servico, String data, String horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    //Getters & Setters
    public CadastroCliente getCliente() {
        return cliente;
    }
    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public CadastroServico getServico() {
        return servico;
    }
    public void setServico(CadastroServico servico) {
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
        return "Atendimento: " + cliente.getNome() + " - Serviço: " + servico.getNome() + " - Data: " + data + " - Horário: " + horario;
    }
}
