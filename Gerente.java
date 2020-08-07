/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoenclase;

/**
 *
 * @author Karasu
 */
public class Gerente extends Tecnicos {
    private String nombre;
    private String apellido;
    private int edad;
    private int ID;
    private int codigo;
    private double sueldo= 500;
    private int años = 5;
    private double bono = 200;
    
    
    @Override
    public double sueldo(){
        double porciento = ((sueldo) *(años * 5))/100;
        sueldo = sueldo + porciento;
        sueldo = sueldo + bono;
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + sueldo ;
    }
    
    
}
