package clase3;

/**
 *
 * @author Karasu
 */
public class Main5 {
    void sumarContadorMain(){
        CuentaCorriente.contador += 100;
    }
    static void sumarContadorMain1(){
        CuentaCorriente.contador +=100;
    }
    public static void main(String[] args) {
        Main5 main= new Main5();
        main.sumarContadorMain();
        
        Main5.sumarContadorMain1();
        
        CuentaCorriente.contador=  100;
        
        CuentaCorriente cta = new CuentaCorriente();
        cta.saldo=100;
        
        CuentaCorriente cta1 = new CuentaCorriente();
        cta.saldo=1000;
    }
}
