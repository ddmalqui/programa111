/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobotones;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class EjemploBotones {
    
    JPanel panelBotones;//, PanelGraphics;
    JButton btCrear1, btCrear2, btCrear3, btBorrar1, btBorrar2, btBorrar3; 
    private static CirculoGraph panelGrafico;
    
    public EjemploBotones(){
        JFrame frameej = new JFrame("JPanel En Java");  
        frameej.setLayout(null);
        
         panelBotones = new JPanel(new GridLayout(3, 2, 5, 5));
         btCrear1= new JButton("Crear");
         btCrear2= new JButton("Crear");
         btCrear3= new JButton("Crear");
         btBorrar1=new JButton("Borrar");
         btBorrar2=new JButton("Borrar");
         btBorrar3=new JButton("Borrar");
         panelBotones.add(btCrear1);
         panelBotones.add(btCrear2);
         panelBotones.add(btCrear3);
         panelBotones.add(btBorrar1);
         panelBotones.add(btBorrar2);
         panelBotones.add(btBorrar3);
         panelBotones.setVisible(true);
         
         panelGrafico = new CirculoGraph();
         Circulo q = new Circulo(5,5,150,150); 
         panelGrafico.addCuadrado(q);
         panelGrafico.setVisible(true);
         
         frameej.setLayout(null);
         frameej.add(panelBotones);
         //frameej.add(panelGrafico);
         
        frameej.setVisible(true);
        frameej.setSize(800, 600);
        frameej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemploBotones ejb = new EjemploBotones();
    }
    
}
