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
public class GraphNave extends Naves implements Dibujo{
    Color color;
    
    public GraphNave(float posx, float posy, float tamx, float tamy, Color naveColor){
        super(posx,posy,tamx,tamy);
        this.color = naveColor;
    }
    
    @Override
    public void Dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect((int)this.getX(), (int)this.getY(), (int)this.getAncho(), (int)this.getAlto());
       
    }
    
    
}
