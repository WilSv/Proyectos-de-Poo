
package clase3;

import java.util.Scanner;

/**
 *
 * @author Karasu
 */
public class Cuenta {
    private double saldo;
    private int NumeroC;
    
    public static void main(String[] args) {
        Cuenta cta1 = new Cuenta();
        Cuenta cta2 = new Cuenta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de dinero para la cta1: ");
        double dinero = sc.nextDouble();
        cta1.Deposito(dinero);
        
        System.out.println("Ingrese cantidad de dinero para la cta1: ");
        dinero = sc.nextDouble();
        cta2.Deposito(dinero);
        
        System.out.println(cta1.getSaldo());
        System.out.println(cta2.getSaldo());
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    
    public void Deposito(double dinero){
        saldo= saldo + dinero;
        
    }

    public void Retiro(double dinero){
        saldo= saldo - dinero;
    }
   
}
