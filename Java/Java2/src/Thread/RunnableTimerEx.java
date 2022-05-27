package Thread;

import java.awt.*;
import javax.swing.*;

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread_Sec th = new TimerThread_Sec(timerLabel);
		setSize(250, 150);
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
		new RunnableTimerEx();
	}
}