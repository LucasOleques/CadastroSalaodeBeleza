import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private String nomecliente = "";
    private String email = "";
    private long telefone = ' ';
    private String endereco = "";

    Cliente cliente = new Cliente( nomecliente , email , telefone , endereco);

    @Test
    public void testeNomeCliente(){
        assertTrue(cliente.isValidClienteNameEmpty(cliente.getNomecliente()));
        System.out.println(nomecliente);
    }
    @Test
    public void testEmail(){
        assertTrue(cliente.isValidClienteNameEmpty(cliente.getEmail()));
    }
    @Test
    public void testeTelefone(){
        assertTrue(cliente.isValidClienteTelefoneEmpty(cliente.getTelefone()));
    }
    @Test
    public void testeEndereco(){
        assertTrue(cliente.isValidClienteNameEmpty(cliente.getEndereco()));
    }
}