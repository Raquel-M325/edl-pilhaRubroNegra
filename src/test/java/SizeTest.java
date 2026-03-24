import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SizeTest {

    @Test
    void tamanhoInicialDeveSerZero() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        assertEquals(0, pilha.size());
    }

    @Test
    void deveContarElementosCorretamente() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        pilha.pushR(1);
        pilha.pushN(2);

        assertEquals(2, pilha.size());
    }
}