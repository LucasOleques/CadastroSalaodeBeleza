import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoTest {

    private String nome = "";
    private String valor = "";
    private String descricaoservico = "";
    Servico servico = new Servico(nome, valor, descricaoservico);

   @Test
   public void testNome(){
       assertTrue(servico.isValidServicoNameEmpty(servico.getNome()));
   }
   @Test
    public void testValor(){
       assertTrue(servico.isValidServicoNameEmpty(servico.getNome()));
   }
   @Test
   public void testeDescricao(){
       assertTrue(servico.isValidServicoNameEmpty(servico.getNome()));
   }
}