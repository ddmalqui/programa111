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
public class Posicion {
    
    private float x;
    private float y;
    
    public Posicion(){
        this.x = 0;
        this.y = 0;
    }
    
    public Posicion(float x, float y){ // por si quiero arrancar de una posicion particular
        this.x = x;
        this.y = y;
    }
    
    public Posicion(Posicion pos){ // por si quiero arrancar de una posicion particular
        this.x = pos.x;
        this.y = pos.y;
    }
    
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    
}
