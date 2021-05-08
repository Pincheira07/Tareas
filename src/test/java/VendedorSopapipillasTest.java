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
}