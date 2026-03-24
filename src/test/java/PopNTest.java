import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PopNTest {

    @Test
    void deveRemoverElementoNegro() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        pilha.pushN(20);

        Object valor = pilha.popN();

        assertEquals(20, valor);
    }

    @Test
    void deveLancarErroSeNegroVazio() {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(5);

        assertThrows(PilhaVaziaExcecao.class, () -> pilha.popN());
    }
}