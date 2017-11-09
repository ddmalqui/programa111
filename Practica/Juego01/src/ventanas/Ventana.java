/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Diego
 */
public class Ventana extends JFrame implements WindowListener{

    public Ventana(String title){
    super(title);
    setBackground(Color.black);// TODO: NO FUNCA
    setSize(500,500);
     
    addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet1."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet2."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet3."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet4."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet5."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet.6"); //To change body of generated methods, choose Tools | Templates.
    }

    
}
