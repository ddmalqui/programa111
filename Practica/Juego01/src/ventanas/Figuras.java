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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Diego
 */
public class Figuras extends JPanel implements KeyListener{
    
    ArrayList v;
    Tanque tanque;
    int x = 0;
    int y = 0;
    int it = 0;
    
    public Figuras(ArrayList objADibujar){
        this.v = objADibujar;
        addKeyListener(this); 
        setFocusable(true);
     //   setFocusableTransversalKeyEnabled(true);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
      //System.out.print("paint  --  \n");
        Dibujo dibujo;
        for (int i=0;i<v.size();i++){
        dibujo = (Dibujo)v.get(i); // No es necesesario castiarlo, pero lo pide sno da error. O sea hay que pasarlo a tipo Dibujo
        dibujo.Dibujar(g);
        }
    }
    
   // @Override
   /* public void paint(Graphics g){
        //System.out.print("paint  --  \n");
        Dibujo dibujo;
        for (int i=0;i<v.size();i++){
        dibujo = (Dibujo)v.get(i); // No es necesesario castiarlo, pero lo pide sno da error. O sea hay que pasarlo a tipo Dibujo
        dibujo.Dibujar(g);
            }
    }*/

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
			switch(keycode){
			case KeyEvent.VK_LEFT:
				System.out.print(it+"\n");
                tanque.setX(tanque.getX() - 10);
				repaint();
				break;	
    		case KeyEvent.VK_RIGHT:
    				System.out.print(it+"\n");
    				tanque.setX(tanque.getX() + 10);
    				repaint();
    				break;	
			}   
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void setiTanque(int iTanque) {
       tanque = (Tanque) v.get(iTanque - 1);
       //v.remove(iTanque - 1);
       it = iTanque - 1;
    }
    
    

   
}
