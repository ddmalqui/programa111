/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego01;
import java.awt.*;
import java.util.ArrayList;
import ventanas.*;

/**
 *
 * @author Diego
 */
public class Juego01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana juego = new Ventana("Juego 01");
        ArrayList ArrgloDeObjetos = new ArrayList();
        Posicion pos = new Posicion(50,0);
        //no estoy usando la clase posicion para hacerlo mas rapido
        
        GraphNave nave01 = new GraphNave((float)50,(float)5,(float)20,(float)50,Color.green); 
        
        ArrgloDeObjetos.add(nave01);
        Figuras figurasJuego = new Figuras(ArrgloDeObjetos);
       
       juego.add(figurasJuego);
       juego.setSize(700,400);
       juego.setVisible(true);
        
    }
    
}
