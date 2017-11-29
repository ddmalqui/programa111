package oo02;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class CirculoGraph extends JPanel {
	private List<Circulo> circulos;
	
	public CirculoGraph(){
		circulos = new ArrayList<Circulo>();
	}
	
	public void addCuadrado(Circulo c){
		circulos.add(c);
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		for(Circulo q: circulos){
			q.Dibujar(g);
		}
	}
	

}
