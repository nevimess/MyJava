package com.Michal.Libera;

import javax.swing.*;
import java.util.concurrent.*;

public class HelloLabel {

	public static void main(String...args) throws Exception{
		
		JFrame frame = new JFrame("Ahoj Swing");
		JLabel label = new JLabel("Etykieta");
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
		label.setText("I taki chuj");
		
	}
	
	
}
