<<<<<<< HEAD
package clase3;
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

import java.util.Scanner;
>>>>>>> eb62749a59ef851b9b10b3a5c4030e1ba87b7484

/**
 *
 * @author Karasu
 */
<<<<<<< HEAD
public class CuentaCorriente {
    public static int contador=1000;
    
    public static void sumarContador(){
        contador+=100;
    }
    
    public double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    
    public void retirar(double dinero){
                saldo-=dinero;
    }
    
    public void depositar(double dinero){
        saldo += dinero;
    }
=======
public class CuentaCorriente  extends CuentaBancaria{
     private String propietario;
    private double saldo;

    public CuentaCorriente(String propietario, double saldo) {
        this.propietario = propietario;
        this.saldo = saldo;
    }

    public CuentaCorriente() {
        
    }
    
     @Override
    public double Deposito(){
        try{
        Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el valor a depositar: ");
        double dinero = sc.nextDouble();
        if(dinero <= 1000){
            double saldoP = (dinero * 1)/100;
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
    
>>>>>>> eb62749a59ef851b9b10b3a5c4030e1ba87b7484
    
}
