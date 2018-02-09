package ejemplobotones;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private Color color;

	public Circulo(int x,int y,int dx,int dy){
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}

	public void Dibujar(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x, y, dx, dy);
	}
	
}
