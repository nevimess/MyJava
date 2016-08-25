package com.Michal.Libera;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;


public class Cw11 extends JButton {
	
	public final int SIZE = 5;
	Random rand = new Random(47);
	
	public Cw11(){
		super("Przycisek");
		super.setBackground(Color.BLACK);
	}
	
	public void randomColor(){
		
		int i = rand.nextInt(SIZE);
		Colors c = Colors.values()[i];
		
		switch(c){
			case BLACK: this.setBackground(Color.BLACK);
			break;
			case YELLOW: this.setBackground(Color.YELLOW);
			break;
			case GREEN: this.setBackground(Color.GREEN);
			break;
			case BLUE: this.setBackground(Color.BLUE);
			break;
			case RED: this.setBackground(Color.RED);
			break;
			default : this.setBackground(Color.WHITE);
				
		}
		System.out.println(i);
	}
	
}
