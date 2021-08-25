package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Time{
	static long time = System.currentTimeMillis();
	private Date date;
	private SimpleDateFormat simpl;
	
	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("aa hh시 mm분 ss초");
		
	}
	public String getDate() {
		return simpl.format(date);
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("clock");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		frame.setLocation(1000,200); 
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		
		Font font = new Font(null,0,32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Time t = new Time();
		
		while(true) {
			t.setDate();
			String s = t.getDate();
			label.setText(s);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
		
		//13일차의 win7 -> 13일차 login의 메인클래스->13일차의 timer 메인클래스
		
	}
}
