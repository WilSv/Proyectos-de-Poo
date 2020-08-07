package clase3;

import java.util.Scanner;

/**
 *
 * @author Karasu
 */
public class Punto {
    double x;
    double y;
    
    public double Distancia(Punto punto){
        double distancia = Math.sqrt(Math.pow((x - punto.x),2) + Math.pow((y - punto.y),2));
        return distancia;
    }
    
    public Punto suma(Punto punto){
       Punto result= new Punto();
       result.x = x + punto.x;
       result.y = y + punto.y;
       return result;
    }
     public double vector(Punto punto){
       return x * punto.x + y * punto.y;
    }
    
    public static void main(String[] args) {
   
            
            Punto p1 = new Punto();
            p1.x=1;
            p1.y=2;
            
            Punto p2 = new Punto();
            p2.x=10;
            p2.y=5;
            
            double distancia = p1.Distancia(p2);
            System.out.println(distancia);
            
            p1.x=1;
            p1.y=2;
            p2.x=3;
            p2.y=3;
            Punto r = p1.suma(p2);
            System.out.println(r.x + " " + r.y);
                  
            
            p1.x=1;
            p1.y=2;
            p2.x=3;
            p2.y=3;
            System.out.println(p1.vector(p2));
           
        }
    
    
}
