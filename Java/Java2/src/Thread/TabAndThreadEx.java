package Thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
	private int barSize = 0; // 바의 크기
	private int maxBarSize;
	
	public MyLabel(int maxBarSize) {
			this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		int width;
		
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		width = (int)(((double)(this.getWidth())) / maxBarSize*barSize);
		
		if(width==0) {
			return;
		}
		
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) { 
				return; 
			}
		}
		
		barSize++;
		repaint();
		notify();
	}
	
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e){
				return;
			}
		}
		
		barSize--;
		repaint();
		notify();
	}
}

class ConsumerThread extends Thread {
	private MyLabel bar;
	
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			} catch (InterruptedException e){ 
				return;
			}
		}		
	}
}

public class TabAndThreadEx extends JFrame{
	private MyLabel bar = new MyLabel(100);
	
	public TabAndThreadEx(String title) {
			super(title);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(null);
			bar.setBackground(Color.ORANGE);
			bar.setOpaque(true);
			bar.setLocation(20, 50);
			bar.setSize(300, 20);
			c.add(bar);
			
			c.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e){
					bar.fill();
				}
			});
			
			setSize(350,200);
			setVisible(true);
			c.setFocusable(true);
			c.requestFocus();
			ConsumerThread th = new ConsumerThread(bar);
			th.start(); // 스레드 시작
	}
	public static void main(String[] args) {
		new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");
	}
}