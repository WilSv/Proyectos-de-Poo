
package main;

import java.util.Scanner;


public class Positivos {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Leer numero ("+ i+ "): ");
            Scanner sc = new Scanner (System.in);
            int numero = sc.nextInt();
            if (numero > 0){
                System.out.println("Numero " + numero);
            }
            
            
            
        }
    }
}
