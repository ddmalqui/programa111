/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Diego
 */

public class GraphTanque extends Tanque implements Dibujo {
   
     Color color;
    
    public GraphTanque(Posicion pos, float tamx, float tamy, Color naveColor){
        super(pos,tamx,tamy);
        this.color = naveColor;
    }
    
    @Override
    public void Dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect((int)this.getX(), (int)this.getY(), (int)this.getAncho(), (int)this.getAlto());
        g.drawRect((int)this.getX() + (int)this.getAncho()/4, (int)this.getY()-30,(int)this.getAncho()/2, (int)this.getAlto());
    }

    
}
