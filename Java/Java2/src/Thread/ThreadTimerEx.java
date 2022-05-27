package Thread;

import java.awt.*;
import javax.swing.*;

class TimerThread_Sec extends Thread {
	private JLabel timerLabel;
	
	public TimerThread_Sec(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				return;
			}
		}
	}
}


public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread_Sec th = new TimerThread_Sec(timerLabel);
		setSize(250, 250);
		setVisible(true);
		
		long id = th.getId();
		String name = th.getName();
		int priority = th.getPriority();
		Thread.State s = th.getState();
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);
		
		th.start();
	}
	
	public static void main(String[] args) {
		ThreadTimerEx ex = new ThreadTimerEx();
	}
}