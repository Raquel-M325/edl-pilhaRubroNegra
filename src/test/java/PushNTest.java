import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PushNTest {

    @Test
    void deveInserirElementoNaPilhaNegra() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        pilha.pushN(1);
        pilha.pushN(2);

        pilha.pushN(3);

        assertEquals(3, pilha.topN());
        assertEquals(3, pilha.size());
    }
}