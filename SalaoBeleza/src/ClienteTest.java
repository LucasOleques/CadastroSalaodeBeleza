import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private String nomecliente;
    private String email;
    private String telefone;
    private String endereco;
    Cliente cliente = new Cliente(nomecliente,email,telefone,endereco);

    @Test
    public void testNome(){
        assertTrue(cliente.isValidClienteNameEmpty(cliente.getNomecliente()));
    }
    @Test
    public void testValor(){
        assertTrue(cliente.isValidClienteNameEmpty(cliente.getNomecliente()));
    }
    @Test
    public void testeDescricao(){
        assertTrue(cliente.isValidClienteNameEmpty(cliente.getNomecliente()));
    }
}