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
public class Bala extends Posicion {

private float radio;
    
 public Bala(Posicion pos, float radio){
     super(pos);
     this.radio = radio;
 }
 
 public float getRadio(){
     return this.radio;
 }
 
 public void setRadio(float r){
     this.radio = r;
 }
 
 public Posicion getPosicion(){
     Posicion posxy = new Posicion(this.getX(),this.getY());  
     return posxy;
 }
 
 public void getPosicion(float r){
     this.radio = r;
 }

 
}
