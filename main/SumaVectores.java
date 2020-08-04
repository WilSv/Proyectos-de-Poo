package main;

/**
 *
 * @author Karasu
 */
public class SumaVectores {
    public static void main(String[] args) {
        
    int[]v1= new int[]{
          1,-9,4,50,-8,63,0,78,-96,62  
        };
    int[]v2= new int[]{
          1,-9,4,23,-8,3,0,80,-96,69
        };
    
    int suma1=0;
    int suma2=0;
    
         for (int contador = 0; contador < v1.length; contador++) {
            suma1 += v1[contador];
        
         }
         System.out.println("La suma total del vector 1 es:: " +suma1);
         
         for (int contador = 0; contador < v2.length; contador++) {
            suma2 += v2[contador];
         }
         
         System.out.println("La suma total del vector 2 es: " +suma2);
         
         if(suma1>suma2){
             System.out.println("El vector 1 es mayor que el vector 2");
         }else if(suma2>suma1){
             System.out.println("El vector 2 es mayor que el vector 1");
         }else if(suma1==suma2){
             System.out.println("Ambos vectores son iguales");
         }
}
}
