<<<<<<< HEAD
package fundamentospoo;

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;
import java.io.*;
import java.util.Scanner;
>>>>>>> b18b08aa1f98fced4b822ab8ce0125898f02e9b4
/**
 *
 * @author Karasu
 */
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Jugador j1 = new Jugador();
        j1.nombre = "Cesar";
        
        Jugador j2 = new Jugador();
        j2.nombre = "Galor";
        
        
        System.out.println("Vida j1: " + j1.vida);
        System.out.println("Vida j2: " + j2.vida);
        
        j1.golpear(j2);
        
        System.out.println("Vida j1: " + j1.vida);
        System.out.println("Vida j2: " + j2.vida);
        
        j1.mover();
        j2.mover();
        
        j2.golpear(j1);
        
        System.out.println("Vida j1: " + j1.vida);
        System.out.println("Vida j2: " + j2.vida);
    }
    
}
=======
        CuentaAhorro  ca = new CuentaAhorro();
        CuentaCorriente  c = new CuentaCorriente();
        int op =0 ;
         do{         
        Scanner sc = new Scanner(System.in);

     System.out.println("-----ELIGA DONDE DESEA DEPOSITAR---");

     System.out.println("1:Depositar en cuenta corriente ");
     System.out.println("2:Deposiar en cuenta de ahorros ");
     System.out.println("3:Retirar de cuenta corriente ");
     System.out.println("4:Retirar de cuenta de ahorros ");
     System.out.println("5: mostrar saldo actual en Cuenta Corriente: ");
     System.out.println("6: mostrar saldo actual en Cuenta de Ahorro: ");
     System.out.println("7. Salir");
        
        try{
        System.out.println("Ingresar valor: ");
        op = sc.nextInt();
        }catch(Exception e){
             System.out.println("Error, ingrese un valor valido");
         }
     switch(op){
         case 1: c.Deposito();
    break;
         case 2:ca.Deposito();

   break;
         case 3: c.Retiro();
         
    break;
         case 4: ca.Retiro();
         
    break;
    case 5: c.Saldo();
            
    break; 
    case 6: ca.Saldo();
        break;
    case 7:
        System.out.println("Salio del programa"); 
        break;
    default:
                System.out.println("No Existe la opcion");
      }
    }while(op!=7);   
    }
    }
    
>>>>>>> b18b08aa1f98fced4b822ab8ce0125898f02e9b4
