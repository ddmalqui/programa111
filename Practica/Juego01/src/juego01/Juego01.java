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
        Ventana juego = new Ventana("Juego 01",Color.BLACK);
        ArrayList ArrgloDeObjetos = new ArrayList();
        //no estoy usando la clase posicion para hacerlo mas rapido
        
        GraphNave[] nave = new GraphNave[500];
        float ancho = 20;
        float alto = 20;
        juego.setSize(700,700);
        int cantNaves = juego.getWidth()/50;
        int ultimai = 0;
        int ultimai2 = 0;
        
            Color[] colors = new Color[3];
            //Initialize the values of the array
            colors[0] = Color.red;
            colors[1] = Color.yellow;
            colors[2] = Color.green; 
        
        for(int i = 0; i <= cantNaves-1; i++){
        nave[i] = new GraphNave((float)(50*i)+ancho/2,(float)10,ancho,alto,colors[i % 3]);
        ArrgloDeObjetos.add(nave[i]);
        ultimai = i;
        System.out.print(i + "--");
        }
        
        for(int i = 0; i <= (cantNaves-2); i++){
        nave[i + ultimai + 1] = new GraphNave((float)(50*i)+(ancho/2) + 25,(float)40,ancho,alto,colors[i % 3]);
        ArrgloDeObjetos.add(nave[i + ultimai + 1]);
        ultimai2 = i + ultimai + 1;
        }
        
        for(int i = 0; i <= (cantNaves-3); i++){
        nave[i + ultimai2 + 1] = new GraphNave((float)(50*i)+(ancho/2) + 50,(float)70,ancho,alto,colors[i % 3]);
        ArrgloDeObjetos.add(nave[i + ultimai2 + 1]);
        ultimai2 = i + ultimai + 1;
        }
        
        Posicion pos = new Posicion(530,juego.getHeight()-175);
        GraphBala bala = new GraphBala(pos,20,Color.red);
        ArrgloDeObjetos.add(bala);
        
        Posicion posTanque = new Posicion(500,juego.getHeight()-150);
        GraphTanque tanque = new GraphTanque(posTanque,80,40,colors);
        ArrgloDeObjetos.add(tanque);
        
        
        Figuras figurasJuego = new Figuras(ArrgloDeObjetos);
       
       juego.add(figurasJuego);
       juego.setVisible(true);
        
    }
    
}
