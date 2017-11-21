/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
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
    
    public Figuras(ArrayList objADibujar){
        this.v = objADibujar;
        addKeyListener(this); 
        setFocusable(true);
     //   setFocusableTransversalKeyEnabled(true);
    }
    
    public void repintar(Graphics g,ArrayList objADibujar){
        this.v = objADibujar;
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        System.out.print("en paint de Jpanel  --  ");
        Dibujo dibujo;
        for (int i=0;i<v.size();i++){
        dibujo = (Dibujo)v.get(i); // No es necesesario castiarlo, pero lo pide sno da error. O sea hay que pasarlo a tipo Dibujo
        dibujo.Dibujar(g);
            }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
			switch(keycode){
			case KeyEvent.VK_LEFT:
				System.out.print(x);
				x = x + 1;
                                tanque.setX(x);
				repaint();
				break;	
			}   
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void setiTanque(int iTanque) {
       tanque = (Tanque) v.get(iTanque - 1);
    }
    
    

   
}
