import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShrinkTest {

    @Test
    void deveDiminuirQuandoUmTercoOcupadoRubro() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(9);

        // enche bem (vai crescer também)
        for (int i = 1; i <= 9; i++) {
            pilha.pushR(i);
        }

        // remove até ficar <= 1/3
        for (int i = 0; i < 7; i++) {
            pilha.popR();
        }

        // agora deve ter 2 elementos (<= 9/3 = 3)
        assertEquals(2, pilha.size());
        assertEquals(2, pilha.topR());
    }

    @Test
    void deveDiminuirQuandoUmTercoOcupadoMisto() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(12);

        for (int i = 1; i <= 6; i++) {
            pilha.pushR(i);
            pilha.pushN(i);
        }

        // remove bastante
        for (int i = 0; i < 5; i++) {
            pilha.popR();
            pilha.popN();
        }

        // agora tamanho total pequeno (<= 1/3)
        assertTrue(pilha.size() <= 4);

        // ainda consistente
        assertEquals(1, pilha.topR());
        assertEquals(1, pilha.topN());
    }

    @Test
    void naoDevePerderDadosAposShrink() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(6);

        for (int i = 1; i <= 6; i++) {
            pilha.pushR(i);
        }

        for (int i = 0; i < 4; i++) {
            pilha.popR();
        }

        // sobram 2 elementos (<= 6/3 = 2 → shrink)
        assertEquals(2, pilha.size());

        assertEquals(2, pilha.popR());
        assertEquals(1, pilha.popR());
    }
}