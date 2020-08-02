/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
public class Promedio {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la primera nota");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese la segunda nota");
        double n2 = sc.nextDouble();
        System.out.println("Ingrese la tercera nota");
        double n3 = sc.nextDouble();
        
        Double  promedio = (n1 + n2 +n3) /3;
        
        if (promedio >= 70){
            System.out.println("Aprobo la materia con " + promedio );
            
        }else{
            System.out.println("Reprobo la materia con " + promedio );
        }
    }
}
