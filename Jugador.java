/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentospoo;

/**
 *
 * @author Karasu
 */
public class Jugador {
    public String nombre;
    public int vida = 10;
    private int localizacion;
    private int[]inventario = new int[12];
    
    public void AtaqueRecibido(){
        if(vida>0){
        vida = vida-1;
        }else{
        System.out.println("El jugador esta muerto");
        }
    } 
    
    public void Saltar(){
        System.out.println("Saltando");
    }
    
    public void mover(){
        System.out.println("Moviendose");
    }
    
    public void comer(){
        System.out.println("Comiendo");
    }

    public void golpear(Jugador jugador){
        jugador.AtaqueRecibido();
        System.out.println("Golpeando a " +jugador);
    }
    
    public void nadar(){
        System.out.println("Nadando");
    }
    
    
}
