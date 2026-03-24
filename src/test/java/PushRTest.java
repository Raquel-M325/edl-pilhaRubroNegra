import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PushRTest {

    @Test
    void deveInserirElementoNaPilhaRubro() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        pilha.pushR(1);
        pilha.pushR(2);

        pilha.pushR(3);

        assertEquals(3, pilha.topR());
        assertEquals(3, pilha.size());
    }
}