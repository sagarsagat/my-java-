package swings;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;



public class Graf  {
	Frame k= new  Frame( );
	
	Graf(){
		
		k.setVisible(true);
		k.setSize(800,500);
		k.setLayout(null);
		
	
	
	}
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.drawLine(200, 200, 400, 200);
		
	}

}
