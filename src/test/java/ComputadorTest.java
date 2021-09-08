import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {
    @Test
    void testeClone() throws CloneNotSupportedException{
        Computador computador = new Computador("asus", "8gb", "500w", "i5", "red");

        Computador computadorClone = computador.clone();
        computadorClone.setPlacaMae("intel");
        computadorClone.setMemoria("16gb");
        computadorClone.setFonte("800w");
        computadorClone.setProcessador("i9");
        computadorClone.setGabinete("blue");

        assertEquals("Computador{placaMae='asus', memoria='8gb', fonte='500w', processador='i5', gabinete='red'}", computador.toString());
        assertEquals("Computador{placaMae='intel', memoria='16gb', fonte='800w', processador='i9', gabinete='blue'}", computadorClone.toString());
    }
}