package com.Michal.Libera;

public class CofeeDecoratorDemo {

	
	public static void main(String...args){
		
		CofeeSugar cf1 = new CofeeSugar(new BasicCofee());
		CofeeSugar cf = new CofeeSugar(new CofeeCream(new BasicCofee()));
		
		
		
	}
	
	
}
