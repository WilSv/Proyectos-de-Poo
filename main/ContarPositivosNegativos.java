
package main;

/**
 *
 * @author Karasu
 */
public class ContarPositivosNegativos {
    
    public static void main(String[] args) {
        int[]numeros = new int[10];
        
        numeros[0]=1;
        numeros[1]=-5;
        numeros[2]=7;
        numeros[3]=-8;
        numeros[4]=20;
        numeros[5]=23;
        numeros[6]=-10;
        numeros[7]=20;
        numeros[8]=0;
        numeros[9]=0;
        
        System.out.println(numeros.length);
        int cero=0;
        int positivo=0;
        int negativos=0;
        int sumaNegativos =0;
        int sumaPositivo=0;
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==0){
            cero++;
        }else if(numeros[i]<0){
            negativos++;
            sumaNegativos += numeros[i];
        }else{
            positivo++;
            sumaPositivo+=numeros[i];
        }
        }      
            System.out.println("La cantidad de numeros ceros es: " +cero);
            System.out.println("La cantidad de numeros negativos es: " +negativos);
            System.out.println("La cantidad de numeros psotivos es: " +positivo);
            
            System.out.println("La suma de numeros negativos es: " +sumaNegativos);
            System.out.println("La suma de numeros psotivos es: " +sumaPositivo);
        
        
    }
    
    }

