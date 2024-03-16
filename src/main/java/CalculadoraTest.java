import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(-1, calculadora.restar(2, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        calculadora.dividir(1, 0);
    }
}
