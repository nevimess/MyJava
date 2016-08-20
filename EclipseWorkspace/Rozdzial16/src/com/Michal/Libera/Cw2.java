package com.Michal.Libera;

import java.util.Random;


public class Cw2 {

	public static Integer[] makeTab(int i){
		
		Random rand = new Random();
		Integer[] integ = new Integer[i];
		
		for(int j = 0; j<i; j++){
			
			integ[j] = Integer.valueOf(rand.nextInt(100));
			
			
		}
		
		return integ;
		
	}
	
	
	public static void main(String...args){
		
		Integer[] aw = makeTab(10);
		
		for(int i = 0; i<aw.length;i++){
			
			System.out.println(aw[i].toString());
			
		}
		
		
	}
	
	
}
