
package main;

import java.util.Scanner;


public class whilee {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int i=0;
            while(i<5){
            System.out.println("Leer numero ("+ i+ "): ");
            int numero = sc.nextInt();
            if (numero > 0){
                System.out.println("Numero " + numero);
                i++;
            }
            
            
            
        }
    }
}
