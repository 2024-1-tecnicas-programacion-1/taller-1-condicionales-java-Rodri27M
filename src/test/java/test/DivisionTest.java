package test;

import ejercicios.Division;
import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class DivisionTest {

    private int dividendo;
    private int divisor;
    @Test
    public void testDivisionExacta() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 7);
        assertEquals(valorEsperado, valorActual);
    }
   @Test
    public void testDivisionNoExacta() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }
     @Test
    public void testDivisioneroa() {
        String valorEsperado = "Error. No se puede dividir en cero.";
                
        String valorActual = Division.evaluar(14, 0);
        assertEquals(valorEsperado, valorActual);
    } 
    }
    // TODO: Agrega tus otros casos de prueba aquí

