package com.Michal.Libera;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {
    int x = 0;
    int y = 0;
    int formerX = 0;
    int formerY = 0;
    
    boolean xDir = true;
    boolean yDir = true;
    
public void isXCollision(){
    	
    	if((x + 20 > 299) || (x + 20 < 20)){
		
    		xDir = !xDir;
    	}
    }

public void isYCollision(){
	
	if((y + 20 > 399) || (y + 20 < 20)){
		
		yDir = !yDir;
	
	}
}

    private void moveBall() {
    	
    	formerX = x;
    	formerY = y;
    	
    	if((yDir == true) && (xDir == true)){
        x = x + 1;
        y = y + 1;
    	} else if((yDir == false) && (xDir == true)){
    		x = x + 1;
    		y = y - 1;
    	} else if((yDir == true) && (xDir == false)){
    		x = x - 1;
    		y = y + 1;
    	}
    	else if((yDir == false) && (xDir == false)){
    		x = x - 1;
    		y = y - 1;
    		
    	}
    	isXCollision();
    	isYCollision();
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 20, 20);
    }

    
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Frame");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(5);
        }
    }
}