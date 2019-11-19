package swings;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mos implements MouseListener {
	 JFrame f=new JFrame();
	 JLabel l=new JLabel();
	  Mos(){
		  l.setBounds(250, 175, 200, 50);
		  f.setLayout(null);
		  f.add(l);
		  f.setSize(600, 400);
		  f.setVisible(true);
		  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		  f.addMouseListener(this);
		 
	  }
	  
	  
	@Override
	public void mouseClicked(MouseEvent e) {
		l.setText(" mouse clicked");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText(" mouse  Pressed");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText(" mouse  Released");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		f.getContentPane().setBackground(Color.blue);
		l.setText(" mouse  Entered");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		l.setText("mouseExited");
		// TODO Auto-generated method stub
		
			

			
			 
			 
		 }
		 
		 
		 
		 
		
	}


