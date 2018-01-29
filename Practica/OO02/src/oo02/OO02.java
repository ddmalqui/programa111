package oo02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class OO02 extends JFrame {
	private static CirculoGraph panelGrafico;
	
	//Modificar la clase Circulo de forma que ademas de la posicion, el color sea distinto en casa instancia.
	//Agregar 2 botones mas que agreguen tanto rectanculos como triangulos.
	//validar que no se dibuje nada fuera de la pantalla.
	//Agregar un boton que elimine el ultimo objeto insertado.
	//Agregar 3 botones que elimines segun corresponda el ultimo objeto insertado.
	
	public OO02(){
		panelGrafico = new CirculoGraph();
		  JButton crearImagen = new JButton("Agregar Circulo");
		  crearImagen.setSize(60, 60);
			crearImagen.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int dx = 50;
					int dy = 50;
					int x = (int)(panelGrafico.getWidth() * Math.random());
					int y = (int)(panelGrafico.getWidth() * Math.random());
					
					Circulo q = new Circulo(x,y,dx,dy); 
					panelGrafico.addCuadrado(q);
                                        revalidate();
                                        repaint();
				}
				
		  
	  });
			//add(panelGrafico);
                        
                        JButton crearImagen2 = new JButton("Agregar2");
                        JButton crearImagen3 = new JButton("Agregar3");
                        JButton borrarImagen1 = new JButton("borrar1");
                        JButton borrarImagen2 = new JButton("borrar2");
                        JButton borrarImagen3 = new JButton("borrar3");
                        
                        JPanel panelBotones = new JPanel(new GridLayout(3, 2, 5, 5));
                        panelBotones.add(crearImagen);
                        panelBotones.add(crearImagen2);
                        panelBotones.add(crearImagen3);
                        panelBotones.add(borrarImagen1);
                        panelBotones.add(borrarImagen2);
                        panelBotones.add(borrarImagen3);
    
			//add(panelBotones);
                        add(panelBotones, BorderLayout.WEST); //boton a la region oeste
                        add(panelGrafico, BorderLayout.CENTER);
	}
	
	
	  public static void main(String[] args) {
		  JFrame ventana = new OO02();
		  ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  ventana.setSize(700,700);
		  ventana.setVisible(true);
}
}
