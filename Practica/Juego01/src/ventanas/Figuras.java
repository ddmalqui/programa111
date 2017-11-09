/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.*;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics;

/**
 *
 * @author Diego
 */
public class Figuras extends JPanel{
    
    ArrayList v;
    
    public Figuras(ArrayList objADibujar){
        this.v = objADibujar;
    }
    
    public void paint(Graphics g){
        Dibujo dibujo;
        
        for (int i=0;i<v.size();i++){
        dibujo = (Dibujo)v.get(i); // No es necesesario castiarlo, pero lo pide sno da error. O sea hay que pasarlo a tipo Dibujo
            }
    }
}
