package com.Michal.Libera;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Cw7 {

	static String path = "/home/nevimess/Documents/blabla.txt";
	
	public static  String read() throws IOException{
		
		LinkedList<String> ls = new LinkedList();
		BufferedReader in = new BufferedReader(new FileReader(path));
		String s;
		while((s = in.readLine())!= null){
			
			ls.add(s);
			System.out.println(s);
			
		}

		System.out.println("--------------------------------------------------------------");
		printList(ls);
		
		
		
		return "null";
		
		
	}
	
	public static void printList(LinkedList<String> ls){
		
		while(ls.isEmpty() == false){
		System.out.println(ls.getLast());
		ls.removeLast();
		}
		
	}
	
	
	public static void main(String...args){
		
		try{
		read();
		}
		catch (IOException e){
			
			e.printStackTrace();
		}
		
		
	}
	
}
