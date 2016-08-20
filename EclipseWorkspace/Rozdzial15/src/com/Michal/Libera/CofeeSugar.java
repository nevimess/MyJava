package com.Michal.Libera;

public class CofeeSugar extends CofeeDecorator {

	private static String cuk = "Cukier";
	
	public CofeeSugar(BasicCofee basic){
		
		super(basic);
		
	}
	
	@Override
	public String toString(){
		
		return "Cukier + " + basic.toString();
		
	}
	
}
