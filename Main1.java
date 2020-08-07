/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Karasu
 */
public class Main1 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        
       tv1.Encender();
       tv1.subirVolumen();
       tv1.subirVolumen();
       tv1.subirVolumen();
       tv1.subirVolumen();
       
       tv2= tv1;
       tv2.subirVolumen();
       tv2.subirVolumen();
       
        System.out.println("Tv1 volumen: " + tv1.volumen);
        System.out.println("Tv2 volumen: " + tv2.volumen);
    }
    
}
