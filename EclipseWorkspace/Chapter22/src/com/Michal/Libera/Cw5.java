package com.Michal.Libera;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import static com.Michal.Libera.SwingConsole.*;

public class Cw5 extends JFrame {
	
	private JButton	b1 = new JButton("Przycisk 1");
	private JButton b2 = new JButton("Przycisk 2");
	private JButton b3 = new JButton("Prycisk 3");
	
	private JTextField l1 = new JTextField(15);

	private ActionListener al1 = new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e){
			String name = ((JButton)e.getSource()).getText();
			l1.setText("Raz raz # " + name);
			
		}
	};
	
	private ActionListener al2 = new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e){
			String name = ((JButton)e.getSource()).getText();
			l1.setText("Dwa dwa # "+name);
			
		}
		
	};
	
	private ActionListener al3 = new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e){
			String name = ((JButton)e.getSource()).getText();
			l1.setText("Trzy trzy # "+ name);
		}
	};
	
	public Cw5(){
		
		b1.addActionListener(al1);
		b2.addActionListener(al2);
		b3.addActionListener(al3);
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		
	}
	
	public static void main(String...args){
		
		run(new Cw5(),300,100);
		
	}
	
}
