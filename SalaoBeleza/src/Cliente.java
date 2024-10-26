public class Cliente {

    private String nomecliente;
    private String email;
    private String telefone;
    private String endereco;

    //Construtor
    public Cliente(String nomecliente, String email, String telefone, String endereco) {
        this.nomecliente = nomecliente;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //Getters & Setters
    public String getNomecliente() {
        return nomecliente;
    }
    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean isValidClienteNameEmpty(String nomecliente){
            return nomecliente.isEmpty();
    }
}
