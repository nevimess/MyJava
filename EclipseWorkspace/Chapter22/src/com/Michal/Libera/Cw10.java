package com.Michal.Libera;

import static com.Michal.Libera.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cw10 extends JFrame {
	
	private JButton b1 = new JButton("Przycisek");
	private JTextField tf1 = new JTextField(15);
	private JLabel jl1 = new JLabel();
	
	class MEnter extends MouseAdapter{
		
		@Override
		public void mouseEntered(MouseEvent e){
			jl1.setText(tf1.getText());
			
		}
		
	}
	
	MEnter me = new MEnter();
	
	public Cw10(){
		
		setLayout(new BorderLayout());
		add(BorderLayout.WEST,b1);
		add(BorderLayout.CENTER,jl1);
		add(BorderLayout.EAST,tf1);
		
		b1.addMouseListener(me);
		
		pack();
	}
	
	public static void main(String...args){
		
		run(new Cw10(),300,100);
		
		
	}
	

}
