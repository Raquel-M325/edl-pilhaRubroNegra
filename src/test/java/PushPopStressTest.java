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
    void deveAlternarPushPopForcandoGrowEShrink() throws Exception {
        PilhaArrayRubroNegra pilha = new PilhaArrayRubroNegra(2);

        for (int i = 1; i <= 30; i++) {
            pilha.pushR(i);
        }

        for (int i = 0; i < 15; i++) {
            pilha.popR();
        }

        for (int i = 31; i <= 60; i++) {
            pilha.pushR(i);
        }

        assertEquals(45, pilha.size());
        assertEquals(60, pilha.topR());

        for (int i = 60; i >= 16; i--) {
            assertEquals(i, pilha.popR());
        }

        assertTrue(pilha.isEmpty());
    }
}