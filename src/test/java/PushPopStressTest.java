import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PushPopStressTest {

    @Test
    void deveCrescerVariasVezesComPushR() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        for (int i = 1; i <= 50; i++) {
            pilha.pushR(i);
        }

        assertEquals(50, pilha.size());
        assertEquals(50, pilha.topR());

        for (int i = 50; i >= 1; i--) {
            assertEquals(i, pilha.popR());
        }

        assertTrue(pilha.isEmpty());
    }

    @Test
    void deveCrescerVariasVezesComPushN() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        for (int i = 1; i <= 50; i++) {
            pilha.pushN(i);
        }

        assertEquals(50, pilha.size());
        assertEquals(50, pilha.topN());

        for (int i = 50; i >= 1; i--) {
            assertEquals(i, pilha.popN());
        }

        assertTrue(pilha.isEmpty());
    }

    @Test
    void deveCrescerComUsoMisto() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        for (int i = 1; i <= 25; i++) {
            pilha.pushR(i);
            pilha.pushN(i * 10);
        }

        assertEquals(50, pilha.size());
        assertEquals(25, pilha.topR());
        assertEquals(250, pilha.topN());

        for (int i = 25; i >= 1; i--) {
            assertEquals(i, pilha.popR());
            assertEquals(i * 10, pilha.popN());
        }

        assertTrue(pilha.isEmpty());
    }

    @Test
    void deveManterIntegridadeAposMultiplosGrows() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        for (int i = 1; i <= 100; i++) {
            pilha.pushR(i);
        }

        for (int i = 1; i <= 100; i++) {
            pilha.pushN(i);
        }

        assertEquals(200, pilha.size());

        for (int i = 100; i >= 1; i--) {
            assertEquals(i, pilha.popR());
        }

        for (int i = 100; i >= 1; i--) {
            assertEquals(i, pilha.popN());
        }

        assertTrue(pilha.isEmpty());
    }

    @Test
    void deveFazerShrinkQuandoUsoMenorOuIgualUmTerco() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(10);

        // adiciona poucos elementos (já fica < 1/3)
        pilha.pushR(1);
        pilha.pushR(2);
        pilha.pushR(3);

        assertEquals(3, pilha.size());

        // força crescimento primeiro
        for (int i = 4; i <= 10; i++) {
            pilha.pushR(i);
        }

        assertEquals(10, pilha.size());

        // agora remove até ficar <= 1/3
        for (int i = 0; i < 7; i++) {
            pilha.popR();
        }

        // agora deve ter 3 elementos
        assertEquals(3, pilha.size());

        // valida integridade
        assertEquals(3, pilha.topR());
        assertEquals(3, pilha.popR());
        assertEquals(2, pilha.popR());
        assertEquals(1, pilha.popR());

        assertTrue(pilha.isEmpty());
        
    }
}