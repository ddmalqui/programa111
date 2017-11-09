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
public class Naves extends Posicion{
    private float ancho;
    private float alto;
    
    public Naves(){
        super(); // entra en el contructor sin parametros
        this.ancho = 10;
        this.alto = 10;
    }
    
    public Naves(float posx, float posy,float x,float y){
        super(posx,posy); // entra en el contructor sin parametros
        this.ancho = 10;
        this.alto = 10;
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
