package com.Michal.Libera;

public class Cw1Mult {

	public static void main(String...args){
		
		for(int i = 0; i<10; i++){
			
			new Thread(new Cw1()).start();
		}
	}
	
	
}
