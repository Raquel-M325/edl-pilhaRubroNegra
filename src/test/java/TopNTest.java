import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopNTest {

    @Test
    void deveRetornarTopoNegro() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        pilha.pushN(1);
        pilha.pushN(2);

        assertEquals(2, pilha.topN());
    }

    @Test
    void deveLancarErroSeNegroVazio() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        assertThrows(PilhaVaziaExcecao.class, () -> pilha.topN());
    }
}