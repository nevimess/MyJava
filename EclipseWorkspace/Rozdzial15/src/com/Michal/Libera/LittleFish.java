package com.Michal.Libera;

public class LittleFish {

	public static long counter = 1;
	public final long id = counter++;
	
	private LittleFish(){};
	
	public String toString(){
		
		return ("LittleFish: " + id);
	}
	
	public static Generator<LittleFish> generator(){
		
		return new Generator<LittleFish>(){
			
			public LittleFish next(){ return new LittleFish();};
			
		};
		
		
	}
	
	
}
