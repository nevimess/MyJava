package com.Michal.Libera;

import javax.swing.*;
import java.util.concurrent.*;

public class Cw3 extends JFrame {

	JLabel label;
	
	public Cw3(){
		
		super("Ahoj swing");
		label = new JLabel("Etykieta");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
				
	}
	
	static SubmitSwingProgram ssp;
	
	public static void main(String...args) throws Exception{
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() { ssp = new SubmitSwingProgram();}
			
		});
		
		TimeUnit.SECONDS.sleep(1);
		
		SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			
			ssp.label.setText("co innego");
		}
		
		
	});
	
	
}
}