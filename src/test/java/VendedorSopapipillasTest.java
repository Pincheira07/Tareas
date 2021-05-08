import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorSopapipillasTest {
    VendedorSopapipillas ejemploSopaipillasTest = new VendedorSopapipillas("Luis", "Gonzales");


    @Test
    public void darVueltoTest(){
        ejemploSopaipillasTest.setDinero(5000);
        ejemploSopaipillasTest.darVuelto(50);
        assertEquals(4950,ejemploSopaipillasTest.getDinero());
    }

    @Test
    public void calcularVueltoTest() {
        int resta = ejemploSopaipillasTest.calcularVuelto(1000,500);
        assertEquals(500,resta);
    }
    @Test
    public void recibirDineroTest(){
        int recibido = ejemploSopaipillasTest.recibirDinero(5000);
        int esperado = ejemploSopaipillasTest.getDinero();
        assertEquals(esperado, recibido);
    }
    @Test
    public void getSopaipillasTest(){
        ejemploSopaipillasTest.setSopaipillas(500);
        ejemploSopaipillasTest.restarSopaipillas(50);
        assertEquals(450,ejemploSopaipillasTest.getSopaipillas());
    }
}