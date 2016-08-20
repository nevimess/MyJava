package com.Michal.Libera;

public class CofeeDecorator {

	protected BasicCofee basic;
	
	public CofeeDecorator(BasicCofee basic){
		
		this.basic = basic;
		
	}
	
	@Override
	public String toString(){
		return basic.toString();
	}
	
	public int getId(){
		
		return basic.getId();
		
	}
	
}
