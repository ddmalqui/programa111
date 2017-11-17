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
   
     Color color0,color1,color2;
    
    public GraphTanque(Posicion pos, float tamx, float tamy, Color[] colors){
        super(pos,tamx,tamy);
        this.color0 = colors[0];
        this.color1 = colors[1];
        this.color2 = colors[2];
    }
    
    @Override
    public void Dibujar(Graphics g) {
        g.setColor(this.color2);
        g.drawRect((int)(this.getX() + this.getAncho()/4), (int)this.getY()-40,(int)((this.getAncho() - this.getAncho()/2)), (int)this.getAlto()+20);
        g.setColor(this.color0);
        g.fillOval((int)this.getX(), (int)this.getY(), (int)this.getAncho(), (int)this.getAlto());
        g.setColor(this.color1);
        g.drawOval((int)this.getX(), (int)this.getY(), (int)this.getAncho(), (int)this.getAlto());
    }

    
}