import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorSopapipillasTest {
    VendedorSopapipillas ejemploSopaipillasTest = new VendedorSopapipillas("Luis", "Gonzales");



    @Test
    public void leerCantidadTest() {

    }

    @Test
    public void hacerSopaipillasTest() {
        ejemploSopaipillasTest.hacerSopaipillas();
        assertEquals(50,ejemploSopaipillasTest.getSopaipillas());

    }

    @Test
    public void getSopaipillasTest() {
        ejemploSopaipillasTest.restarSopaipillas(50);


    }
    @Test
    public void calcularVueltoTest() {
        int resta = ejemploSopaipillasTest.calcularVuelto(1000,500);
        assertEquals(500,resta);


    }
}