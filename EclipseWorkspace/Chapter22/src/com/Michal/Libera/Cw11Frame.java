package com.Michal.Libera;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import static com.Michal.Libera.SwingConsole.*;

public class Cw11Frame extends JFrame {

	Cw11 jb1 = new Cw11();
	
	ActionListener al = new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			jb1.randomColor();
			
		}
		
	};
	
	Cw11Frame(){
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER,jb1);
		jb1.addActionListener(al);
	}
	
	public static void main(String...args){
		
		run(new Cw11Frame(),300,200);
		
	}
	
}
