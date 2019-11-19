package swings;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;



public class Gra {
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.drawLine(100, 100, 1400, 100);
		
	
	}
	Frame h=new Frame();
	Gra() {
		
	h.setLayout(null);
	
	h.setSize(1400, 800);
	h.setVisible(true);
	h.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		
		
	});
	
	
	
}
	
}