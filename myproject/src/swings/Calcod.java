package swings;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calcod  {
	JFrame f=new JFrame();


	
	
	
	Calcod(){
		
		
		TextField t=new TextField(10); 
		TextField t1=new TextField(10); 
		Button p= new Button("+");
		Button m= new Button("-");
		Button ma= new Button("*");
		Button d= new Button("/");
		t.setBounds(260, 250, 200, 30);
		t1.setBounds(260, 290, 200, 30);
		p.setBounds(260, 330, 20, 30);
		m.setBounds(285, 330, 20, 30);
		ma.setBounds(310, 330, 20, 30);
		d.setBounds(335, 330, 20, 30);
		
		JLabel l =new JLabel(" Result =");
		f.add(t1);
		f.add(t);
		f.add(p);
		f.add(m);
		f.add(ma);
		f.add(d);
		f.add(l);
		l.setBounds(260, 380, 150, 30);
		
		
		
		p.addActionListener(new  ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int num=0;
					num=	Integer.parseInt(t1.getText());
				int num2=0;
				num2=Integer.parseInt(t.getText());	
				int n=num+num2;
				l.setText(" Result ="+n+"");
				num=0;
				num2=0;
			}
		});
	m.addActionListener(new  ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num=0;
						num=	Integer.parseInt(t1.getText());
					int num2=0;
					num2=Integer.parseInt(t.getText());	
					int n=num-num2;
					l.setText(" Result ="+n+"");
					num=0;
					num2=0;
				}

			
		} );
	ma.addActionListener(new  ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int num=0;
				num=	Integer.parseInt(t1.getText());
			int num2=0;
			num2=Integer.parseInt(t.getText());	
			int n=num*num2;
			l.setText(" Result ="+n+"");
			num=0;
			num2=0;
		}
		
	
} );
	d.addActionListener(new  ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int num=0;
				num=	Integer.parseInt(t1.getText());
			int num2=0;
			num2=Integer.parseInt(t.getText());	
			int n=num/num2;
			l.setText(" Result ="+n+"");
			num=0;
			num2=0;
		}
		

	
} );
	
	
		
		f.setLayout(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(1400, 800);
		f.setVisible(true);
		

	
	

}
	
	}
