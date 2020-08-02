/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author Karasu
 */
public class CuentaAhorro extends CuentaBancaria {
    private String propietario;
    private double saldo;

    @Override
      public double Deposito(){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a depositar: ");
        double dinero = sc.nextDouble();
         
        if(dinero <= 1000){
            double saldoP = (dinero * 2)/100;
            saldo = dinero + saldoP;
        }else{
            saldo = dinero;
            
    }
        }catch(Exception e){
             System.out.println("Error, ingrese un valor valido");
         }
         return saldo;
         
    
}
      @Override
    public double Retiro(){
        try{
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese el valor a retirar:");
            double dinero = sc.nextDouble();
            saldo = saldo - dinero;
        }catch(Exception e){
             System.out.println("Error, ingrese un valor valido");
         }
        return saldo;
    }
    
     public double Saldo(){
        System.out.println(saldo);
        return saldo;
    }
}
