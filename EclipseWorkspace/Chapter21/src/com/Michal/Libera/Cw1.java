package com.Michal.Libera;

public class Cw1 implements Runnable {
	
	int cnt = 3;
	public static int taskCnt = 0;
	public final int id = taskCnt++;
	
	
	public Cw1(){
		
		System.out.println("Task #"+id+" zaczyna pracę");
	}
	
	@Override
	public void run(){
		while(cnt-- > 0){
		System.out.println("Działam jako #"+id+" wartosc cnt: "+cnt);
		Thread.yield();
		}
			
			System.out.println("Task #"+id+" konczy prace");
			return;};
		
	}
	
