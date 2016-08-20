package com.Michal.Libera;

import java.util.concurrent.Callable;


public class Fib2 implements Callable<Integer>,Generator {

	private int cnt = 0;
	private int n;
	
	
	private int nCnt = 0;
	private static int a = 0;
	public final int id = a++;
	
	public Fib2(){
		
		System.out.println("Konstruktor domniemany: wartosc n na 5");
		this.n = 5;
	}
	
	public Fib2(int n){
		
		this.n = n;
	}
	
	public static int fib(int n){
		
		if(n <2){
			
			return 1;
		}
		else{
			
			return fib(n-2) + fib(n-1);
			
		}
		
	}
	
	@Override
	public int next(){
		return fib(cnt++);		
	}
	
	@Override
	public Integer call(){
		
		System.out.println("Fib #" + id+" dziala");
		for(int i = 0; i<n; i++){
			
			nCnt++;
			System.out.println("Fib # " + id + " wytworzyl wyraz nr "+ (cnt+1) + " o wartosci " + next());
		}
		System.out.println("Fib # "+ id + " koncze prace");
		return nCnt;

	}
	
	public static void main(String...args){
		
		Fib f = new Fib(5);
		System.out.println();
		for (int i = 0; i< 10; i++){
			System.out.println("Fib # " + f.id + " wytworzyl wyraz nr "+ i + " o wartosci " + f.next());
		}
	}
	
}
