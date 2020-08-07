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
public class Empresa {
    
    public static void main(String[] args) {
        Empleado em = new Empleado();
        Tecnicos tc = new Tecnicos();
        Gerente ge = new Gerente();
        Empresa pa = new Empresa();
        
        
        System.out.println("El sueldo de los oficinistas es de: " + em.Sueldo());
        System.out.println("El sueldo de los tecnicos es de: " + tc.sueldo());
        System.out.println("El sueldo de los gerentes es de: " + ge.sueldo());
   
    }
    
    public void diaDePago(Empleado em, Tecnicos tc, Gerente ge){
        double total = em.Sueldo() + tc.sueldo() + ge.sueldo();
        System.out.println("El pago total que debe realizar la empresa es de : " + total);
    }
    
    
}
