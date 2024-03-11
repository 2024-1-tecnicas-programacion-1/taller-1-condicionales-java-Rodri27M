
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
         int IMC = (int) (peso / Math.pow(estatura, 2));
        if(edad<45){
        if  (IMC<22.0){
            System.out.println("bajo");
        }
        else if (IMC>=22.0){
            System.out.println("medio");
        }
        }
        else if(edad>=45){
        if(IMC<22.0){
            System.out.println("medio");
        }
        else if(IMC>=22.0){
            System.out.println("alto");
        }
    }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
