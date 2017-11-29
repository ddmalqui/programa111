package oo02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


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
				}
				
		  
	  });
			add(panelGrafico);
			add(crearImagen,BorderLayout.NORTH);
	}
	
	
	  public static void main(String[] args) {
		  JFrame ventana = new OO02();
		  ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  ventana.setSize(700,700);
		  ventana.setVisible(true);
}
}
