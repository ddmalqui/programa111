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
public class Coche {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plataforma Renault = new Plataforma(); //Instalcio la clase Plataforma
        Renault.setColor("rojo");
        System.out.println("La plataforma tiene: " + Renault.getRuedas() + " ruedas");
        System.out.println("La plataforma tiene: " + Renault.getColor() + " ruedas");
        
        
    }
    
    
}
