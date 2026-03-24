import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PopRTest {

    @Test
    void deveRemoverElementoRubro() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        pilha.pushR(10);

        Object valor = pilha.popR();

        assertEquals(10, valor);
    }

    @Test
    void deveLancarErroSeRubroVazio() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        assertThrows(PilhaVaziaExcecao.class, () -> pilha.popR());
    }
}