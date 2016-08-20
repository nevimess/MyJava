package com.Michal.Libera;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ocean {

	public static void consume(BigFish b, LittleFish l){
		
		System.out.println(b + " zjada " + l);
		
	}
	
	public static void main(String...args){
		
		Random rand = new Random(100);
		Queue<LittleFish> line = new LinkedList<LittleFish>();
		
		for(int i = 0; i<15; i++){
			
			line.add(LittleFish.generator().next());
		}
		
		ArrayList<BigFish> oline = new ArrayList<BigFish>();
		
		for(int i = 0 ; i<4;i++){
			
			oline.add(BigFish.generator().next());
		}
		
	for(LittleFish lf : line){
		
		
		consume(oline.get(rand.nextInt(oline.size())),lf);
	}
		
	}
	
	
}
