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
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }
    int cociente = 0;
        int residuo = 0;
        int division = dividendo / divisor; 
       
        {
          cociente = cociente + division;
          String respuesta = "La división es exacta. \n"
                + "Cociente: " + cociente + "\n"
                + "Residuo: " + residuo;
        } 
       {
             cociente = cociente + division;
            String respuesta = "La división es no exacta. \n"
                + "Cociente: " + cociente + "\n"
                + "Residuo: " + residuo;
        }
      
    }
    // TODO: Agrega tus otros casos de prueba aquí

