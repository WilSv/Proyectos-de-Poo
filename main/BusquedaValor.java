package main;

import java.util.Scanner;

/**
 *
 * @author Karasu
 */
public class BusquedaValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a buscar: ");
        int n = sc.nextInt();
        int[] numeros = new int[5];
        
        numeros[0]=1;
        numeros[1]=10;
        numeros[2]=100;
        numeros[3]=1000;
        numeros[4]=10000;
        
        int posicion = -1;
        
        for (int i = 0; i < numeros.length; i++) {
            if(n == numeros[i]){
                posicion = i;
        }
            
        }
        if(posicion !=-1){
            System.out.println("El numero fue encontrado en: " + posicion);
        }else {
            System.out.println("El numero " + n + " no fue encontrado ");
        }
        
        
    }
    
}
