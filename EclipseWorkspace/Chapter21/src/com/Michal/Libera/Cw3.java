package com.Michal.Libera;

import java.util.concurrent.*;

public class Cw3 {

	public static void main(String...args){
		
		ExecutorService exec = Executors.newSingleThreadExecutor(); 
		
		for(int i = 0; i<10; i++){
			
			exec.execute(new Cw1());
		}
	}
	
	
}