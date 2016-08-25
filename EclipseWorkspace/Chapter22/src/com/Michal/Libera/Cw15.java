package com.Michal.Libera;

import static com.Michal.Libera.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;

public class Cw15 extends JFrame {
	
	private JButton	b1 = new JButton("Przycisk 1");
	private JButton b2 = new JButton("Przycisk 2");
	private JButton b3 = new JButton("Prycisk 3");
	
	private JTextField l1 = new JTextField(15);

	private JCheckBox cb1 = new JCheckBox("Pole 1");
	private JCheckBox cb2 = new JCheckBox("Pole 2");
	private JCheckBox cb3 = new JCheckBox("Pole 3");
	
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
	
	public void trace(JCheckBox cb, int i){
		
		if(cb.isSelected()){
			
			l1.setText("Checkbox " + i + " is selected");
		}
		else{
			l1.setText("Checkbox " + i+" is unselected");
		}
		
	}
	
	private ActionListener alcb1 = new ActionListener(){
		
		@Override 
		public void actionPerformed(ActionEvent e){
			trace(cb1,1);
			
			
		}
	};
	
private ActionListener alcb2 = new ActionListener(){
		
		@Override 
		public void actionPerformed(ActionEvent e){
			trace(cb2,2);
			
			
		}
	};
	
private ActionListener alcb3 = new ActionListener(){
		
		@Override 
		public void actionPerformed(ActionEvent e){
			trace(cb3,3);
			
			
		}
	};
	
	public Cw15(){
		
		b1.addActionListener(al1);
		b2.addActionListener(al2);
		b3.addActionListener(al3);
		
		cb1.addActionListener(alcb1);
		cb2.addActionListener(alcb2);
		cb3.addActionListener(alcb3);
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		add(cb1);
		add(cb2);
		add(cb3);
		
		add(l1);
		pack();
		
	}
	
	public static void main(String...args){
		
		run(new Cw15(),300,100);
		
	}
	
}
