/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataforma;

/**
 *
 * @author Diego
 */
public class Plataforma {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    String color;
    
    // Creo un metodo constructor
    public Plataforma(){
        ruedas = 4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso=500;
    }
    
    public int getRuedas(){
        return ruedas;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
}
