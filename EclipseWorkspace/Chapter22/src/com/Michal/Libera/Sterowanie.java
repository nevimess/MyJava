package com.Michal.Libera;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sterowanie extends JPanel implements KeyListener {
	
	int x = 0;
	int y = 0;
	
	@Override
	public void keyPressed(KeyEvent evt){
		
		int keyCode = evt.getKeyCode();
		
		switch( keyCode ) { 
        case KeyEvent.VK_UP:
            y = y + 1; 
            break;
        case KeyEvent.VK_DOWN:
            y = y - 1;
            break;
        case KeyEvent.VK_LEFT:
            x = x - 1;
            break;
        case KeyEvent.VK_RIGHT :
            x = x + 1;
            break;
     }
	}
	
	public Sterowanie(){
		addKeyListener(this);
	}
	@Override
	public void keyReleased(KeyEvent evt){
		
		
	}
	
	@Override
	public void keyTyped(KeyEvent evt){
		
		
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
            //game.moveBall();
            game.repaint();
            Thread.sleep(5);
        }
    }
	

}