package Model;

public class Cliente {

    private String nomecliente;
    private String email;
    private int telefone;
    private String endereco;

    //Construtor
    public Cliente(String nomecliente, String email, int telefone, String endereco) {
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
        System.out.println(nomecliente);
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
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
    public boolean isValidClienteTelefoneEmpty(int telefone){
        return telefone == 11; //Telefone pelo minimo 9 numeros (01) 23456-7890
    }
}
