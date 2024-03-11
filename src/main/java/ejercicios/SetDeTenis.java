package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {   
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        int resta = Math.abs(numVictoriasA-numVictoriasB);
        if(resta>=2 & resta<=2){
            if(numVictoriasA>numVictoriasB){
                System.out.println("Ganó A");
            }
            if (numVictoriasB>numVictoriasA){
                System.out.println("Ganó B");
               }   
        }
        if(resta<=1 ){
                 System.out.println("Aún no termina");
             }
        else{
            System.out.println("Inválido");
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
           
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
