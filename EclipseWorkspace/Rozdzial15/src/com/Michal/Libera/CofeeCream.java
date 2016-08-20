package com.Michal.Libera;

public class CofeeCream extends CofeeDecorator {
	
	private String name = "Cream";
	
	public CofeeCream(BasicCofee basic){
		
		super(basic);
	}
	
	@Override
	public String toString(){
		
		return "Cream + " + basic.toString() ;
	}
	
}
