package main;

/**
 *
 * @author Karasu
 */
public class MayorArreglo {
    public static void main(String[] args) {
        int[]numeros= new int[]{
          1,-9,4,50,-8,63,0,78,-96,62  
        };
        
        int nume=numeros[0];
        int posicion = -1;
        
        for (int i = 0; i < numeros.length; i++) {
        if (nume < numeros[i]) {
            nume=numeros[i];
            posicion=i;
        }
        
        }       
         System.out.println("El numero que es mayor es " + nume + " y su posicion es " + posicion);              
        }
    }

