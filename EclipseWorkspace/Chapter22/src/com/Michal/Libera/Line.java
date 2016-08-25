package com.Michal.Libera;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

public class Line extends JPanel{

	static int x;
	static int y;
	static int formerX;
	static int formerY;
	
	public Line(){
		
		
	}
	
	 @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.drawLine(formerX, formerY, x, y);
	    }
	
	 public void setFormer(int formerX, int formerY){
		 
		 this.formerX = formerX;
		 this.formerY = formerY;
		 
	 }
	
	 public void setActual(int x, int y){
		 
		 this.x = x;
		 this.y = y;
	 }
}
