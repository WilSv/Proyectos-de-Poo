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
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private int ID;
    private int codigo;
    private double sueldo= 400;

    public double Sueldo(){
        return sueldo;
    }

    @Override
    public String toString() {
        return "El pago total que realiza la empresa es: " + sueldo ;
    }
    
}
