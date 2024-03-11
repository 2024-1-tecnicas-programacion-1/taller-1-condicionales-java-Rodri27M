
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anno){
        // TODO: Coloca aquí el código del ejercicio 2: Años bisiestos
         int residuo = anno % 4;
        int residuo2 = anno % 400;
        if(residuo==0 ){
            if(residuo2==0){
            System.out.println(anno + " es bisiesto");   
                }
            else{
                System.out.println(anno +" no es bisiesto");
        }
            
        }
        else{
            System.out.println(anno + " no es bisiesto");
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(anno);
        System.out.println(respuesta);
    }
            
}
