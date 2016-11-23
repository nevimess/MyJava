package com.Michal.Libera;
//IBM HO Confidential xD
//M.Libera
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HomeOfficeBot extends JFrame implements KeyListener, Runnable {
	Robot HomeOffice;	//reflections
	Random rand;
	JLabel label;
	
	public HomeOfficeBot(){	//constructor
		super("HomeOfficeBot");
		rand = new Random();
		
		setPreferredSize(new Dimension(300, 100));
        addKeyListener(this);
 
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(225,100);
        setLocation(400,400);
        setResizable(false);
        
       
        label = new JLabel();
        label.setText("Bot is running! Press 'k' key to kill!");
        add(label);
        
		try{
			HomeOffice = new Robot();
		}
		catch(AWTException e){
			JOptionPane.showMessageDialog(this, "Couldn't create robot class!");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public void mouseMovement(int x, int y){
		HomeOffice.mouseMove(x, y);
	}
	
	@Override
    public void keyPressed(KeyEvent evt) {
		char c = evt.getKeyChar();
		if(c == 'k'){
			System.exit(0);
		}
    }
 
    @Override
    public void keyReleased(KeyEvent evt) {
    }
 
    @Override
    public void keyTyped(KeyEvent evt) {
    }
	
    @Override
    public void run() {
        while(true) {
            try {
            	mouseMovement(rand.nextInt(50), rand.nextInt(75));
    			HomeOffice.delay(500);
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
