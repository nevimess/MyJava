package com.Michal.Libera;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Cw6 implements Runnable {

	private static int cnt = 0;
	public final int id = cnt++;
	
	@Override
	public void run(){
		
		Random rand = new Random(150);
		long i = System.currentTimeMillis()/1000;
		//System.out.println(i);
		try{
		TimeUnit.SECONDS.sleep(rand.nextInt(10));
		return;
		}
		catch(InterruptedException e){
			
			long j = System.currentTimeMillis()/1000;
			System.out.println("Odmierzony czas to " + (i-j));
			System.out.println("Koniec dzialania watku # "+ id);
			
			
		}
		
	}
	
	public static void main(String...args){
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		exec.execute(new Cw6());
		exec.shutdown();
	}
	
}
