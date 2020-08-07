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
public class Tv {
    public boolean encendido;
    public int volumen;
    public int canal;
    
    public void Apagar(){
        encendido= false;
    }
    public void Encender(){
        encendido = true;
    }
    
    public void avanzarCanal(){
        if(encendido)
        canal++;
    }
    public void disminuirCanal(){
        if(encendido && canal>0)
            canal--;
    }
    
    public void subirVolumen(){
        if(encendido && volumen <=100)
            volumen++;
    }
    public void bajarVolumen(){
        if(encendido && volumen >0)
            volumen--;
    }

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.Encender();
        System.out.println("Encendido: " + tv1.encendido);
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        System.out.println("Volumen: " + tv1.volumen);
        
        tv1.avanzarCanal();
        tv1.avanzarCanal();
        tv1.avanzarCanal();
        tv1.Apagar();
        tv1.avanzarCanal();
        tv1.avanzarCanal();
        System.out.println("Canal: " + tv1.canal);
        
        Tv tv2 = new Tv();
        tv2.Encender();
        tv2.subirVolumen();
        tv2.subirVolumen();
        tv2.subirVolumen();
        
        System.out.println("Volumen: " + tv2.volumen);
    }
    
}
