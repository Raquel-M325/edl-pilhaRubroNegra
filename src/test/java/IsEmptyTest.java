import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsEmptyTest {

    @Test
    void deveEstarVaziaInicialmente() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        assertTrue(pilha.isEmpty());
    }

    @Test
    void naoDeveEstarVaziaAposInserir() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        pilha.pushR(1);

        assertFalse(pilha.isEmpty());
    }
}