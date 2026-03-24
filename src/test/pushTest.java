import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PushTest {

    @Test
    public void testPushR() {
        PilhaArrayRN pilha = new PilhaArrayRN(5);

        pilha.pushR(10);
        pilha.pushR(20);

        assertEquals(20, pilha.topR());
    }

    @Test
    public void testPushN() {
        PilhaArrayRN pilha = new PilhaArrayRN(5);

        pilha.pushN(30);
        pilha.pushN(40);

        assertEquals(40, pilha.topN());
    }

    @Test
    public void testPushAmbas() {
        PilhaArrayRN pilha = new PilhaArrayRN(5);

        pilha.pushR(1);
        pilha.pushN(2);

        assertEquals(1, pilha.topR());
        assertEquals(2, pilha.topN());
    }
}