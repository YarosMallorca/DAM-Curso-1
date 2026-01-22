import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OperacionesTest {
    @Test
    public void testResta() {
        int n1 = 10;
        int n2 = 4;

        Resta operacionResta = new Resta(n1, n2);
        int resultado = operacionResta.restar();
        assertEquals(6, resultado, "La resta de 10 - 4 debería ser 6");
    }

    @Test
    public void testMultiplicacion() {
        int n1 = 5;
        int n2 = 5;

        Multiplicacion operacionMulti = new Multiplicacion(n1, n2);
        int resultado = operacionMulti.multiplicar();
        assertEquals(25, resultado, "La multiplicación de 5 * 5 debería ser 25");
    }

    @Test
    public void testDivision() {
        int n1 = 20;
        int n2 = 2;

        Division operacionDiv = new Division(n1, n2);
        int resultado = operacionDiv.dividir();
        assertEquals(10, resultado, "La división de 20 / 2 debería ser 10");
    }
}