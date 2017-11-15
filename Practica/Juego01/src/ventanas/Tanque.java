/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


/**
 *
 * @author Diego
 */
public class Tanque extends Posicion {
     private float ancho;
    private float alto;
    
     public Tanque(Posicion pos,float ancho,float alto){
        super(pos.getX(),pos.getY()); // entra en el contructor sin parametros
        this.ancho = ancho;
        this.alto = alto;
    }
     
    public float getAncho(){
        return this.ancho;
    }
    public float getAlto(){
        return this.alto;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }
    
     
}
