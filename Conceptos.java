package conceptos;
/**
 *
 * @author Karasu
 */
public class Conceptos {

    int contador;
    static int suma = 100;
    
    public void contar(){
        contador++;
    }
    
    public static void sumar(){
        suma++;
    }
    public static void main(String[] args) {
        Conceptos main = new Conceptos();
        main.contador = 100;
        
        Conceptos.suma=100;
        Conceptos.sumar();
        
    }
    
}
