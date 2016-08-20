package com.Michal.Libera;

public class BigFish {

	private static long counter = 1;
	private final long id = counter++;
	
	private BigFish(){};
	
	@Override
	public String toString(){
		
		return "BigFish: " + id;
	}
	
	public static Generator<BigFish> generator(){
		
		return new Generator<BigFish>(){
			
			public BigFish next(){return new BigFish();};
			
		};
		
	}
	
	
}
