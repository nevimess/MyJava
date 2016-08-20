package com.Michal.Libera;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Cw5 {

	public static void main(String...args){
		
		ExecutorService exec = Executors.newCachedThreadPool();
		Random rand = new Random(100);
		LinkedList<Future<Integer>> result = new LinkedList<Future<Integer>>();
		
		for(int i = 0; i<10; i++){
			
			result.add(exec.submit(new Fib2(rand.nextInt(30))));
		}
		
		for(Future<Integer> fs : result){
			
			try {
				// get() blocks until completion:
				System.out.println(fs.get());
			} catch(InterruptedException e) {
				System.out.println(e);
				return;
			} catch(ExecutionException e) {
				System.out.println(e);	
			} finally {
				exec.shutdown();
			}	
			
		}
	
	
}
}