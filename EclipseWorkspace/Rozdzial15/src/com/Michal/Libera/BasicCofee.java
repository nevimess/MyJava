package com.Michal.Libera;

public class BasicCofee {

	private static long cnt = 1;
	private long id = cnt++;
	private static String name = "Basic Cofee";
	
	@Override
	public String toString(){
		
		return name;
		
	}
	
	public int getId(){
		
		return (int)id;
	}
}
