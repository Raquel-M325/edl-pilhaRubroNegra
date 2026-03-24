import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopRTest {

    @Test
    void deveRetornarTopoRubro() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        pilha.pushR(1);
        pilha.pushR(2);

        assertEquals(2, pilha.topR());
    }

    @Test
    void deveLancarErroSeRubroVazio() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        assertThrows(PilhaVaziaExcecao.class, () -> pilha.topR());
    }
}