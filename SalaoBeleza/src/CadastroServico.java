public class CadastroServico {

    private String nome;
    private String descricaoservico;
    private String valor;

    //Construtor
    public CadastroServico(String nome, String valor, String descricaoservico) {
        this.nome = nome;
        this.valor = valor;
        this.descricaoservico = descricaoservico;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoservico() {
        return descricaoservico;
    }
    public void setDescricaoservico(String descricaoservico) {
        this.descricaoservico = descricaoservico;
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
