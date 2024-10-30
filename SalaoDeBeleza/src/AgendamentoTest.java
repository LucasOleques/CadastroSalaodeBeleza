import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgendamentoTest {

    private Cliente nomecliente;
    private Servico servico;
    private String data = "";
    private String horario = "";

    Agendamento agendamento = new Agendamento(nomecliente,servico,data,horario);

    @Test
    public void testData(){
        assertTrue(agendamento.isValidAgendamentoDataEmpty(agendamento.getData()));
    }
    @Test
    public void testHorario(){
        assertTrue(agendamento.isValidAgendamentoDataEmpty(agendamento.getHorario()));
    }
}