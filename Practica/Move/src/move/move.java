package move;

import java.awt.*;
import java.awt.event.*;


public class move extends Frame implements KeyListener,WindowListener, MouseMotionListener {

	 /**
	 * 
	 */
	int x=40,y=30;
	

	public move(){
		 addKeyListener(this); 
		 addMouseMotionListener(this);
		 addWindowListener(this);
	 }
	 
	 public void paint(Graphics g){
		 g.fillRect(x, y, 50, 50);
		 g.drawString("x= " + x +"; y= " + y, 100, 100);
	 }
	 
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			int keycode = arg0.getKeyCode();
			
			switch(keycode){
			case KeyEvent.VK_LEFT:
				System.out.print("tecla");
				x = x - 1;
				repaint();
				break;	
			}
			
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	 public static void main(String[] args) {
		 move juego = new move();
		 juego.setSize(500,500);
		 juego.setVisible(true);
	 }

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	 @Override
	    public void windowClosing(WindowEvent we) {
	        System.exit(0);
	    }

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		x = arg0.getX();
		System.out.print(x);
		repaint();
		
	}

	
}
