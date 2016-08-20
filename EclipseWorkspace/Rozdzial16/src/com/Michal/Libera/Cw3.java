package com.Michal.Libera;

import java.util.*;

public class Cw3 {

	public static double[][] makeTab(int firstDim, int secondDim, double lBound, double hBound){
		
		int cnt = 100;
		Random rand = new Random(cnt);
		double[][] d = new double[firstDim][secondDim];
		
		for(int i = 0; i<firstDim; i++){
			
			for(int j = 0; j<secondDim; j++){
				
				do{	
				d[i][j] = rand.nextDouble();
				if (d[i][j] < lBound || d[i][j] > hBound){
					
					rand = new Random(cnt++);
				}
				}
				while (d[i][j] < lBound || d[i][j] > hBound);
					
				}

				}
		return d;
			
		}
		
	public static void showTab(double[][] tab){
		
		
		int end = tab.length;
		int end2;
		
		for(int i = 0; i<end; i++){
			
			end2 = tab[i].length;
			
			for(int j = 0; j<end2;j++){
				
				System.out.print(tab[i][j]+" ");
			}
		System.out.println();
		}
		
	}

	public static void main(String...args){
		
		double[][] test = makeTab(2,4,6.7d,11.2d);
		showTab(test);
		
	}
	
	
}
