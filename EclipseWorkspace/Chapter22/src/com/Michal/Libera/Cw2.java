package com.Michal.Libera;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.*;


public class Cw2 extends JFrame {

	public static void main(String...args) throws Exception{
		
		JFrame frame = new JFrame("Ahoj Swing");
		//JLabel label = new JLabel("Etykieta");
		//frame.add(label);
		
		Random rand = new Random(100);
		long j = rand.nextInt(100);
		
		for(int i = 0; i<j;i++){
			
			
			frame.add(new JLabel("Label numer # "+j));
			
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
		
	}
	
	
}
