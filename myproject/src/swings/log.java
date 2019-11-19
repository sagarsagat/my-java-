package swings;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class log  {
public	JFrame j=new JFrame();
	JPasswordField p=new JPasswordField();
	JTextField t=new JTextField();
	JLabel l1,l2;
	JButton b=new JButton("Login");
	int	a;
	void lock(){
		j.setSize(1400, 800);
		j.setVisible(true);
		j.setLayout(null);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		l1=new JLabel("userID");
		l2=new JLabel("Password");
		l1.setBounds(200, 250, 200, 30);
		l2.setBounds(200, 290, 200, 30);
		t.setBounds(260, 250, 200, 30);
		p.setBounds(260, 290, 200, 30);
		
		b.setBounds(280, 330, 90, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			if(p.getText().equals("v")==true && t.getText().equals("sagar")==true ) {
			
				
		a=	JOptionPane.showConfirmDialog(j, " Hii "+t.getText()+" your logged in successfully   do you need to open calculator");
				if (a==0) {
					j.setVisible(false);
					Calcod k=new Calcod();
					
					
				} 
				if(a!=0){
				
				Gra o=new Gra(); }
			  
			}
		}
		});
		
		

		j.add(b);
		j.add(t);
		j.add(p);
		j.add(l1);
		j.add(l2);
	}
		
	
		}
		
	
	
 
	
