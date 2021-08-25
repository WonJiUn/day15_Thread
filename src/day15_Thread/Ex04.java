package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Test");		//시멘트 바닥
		Container c = frame.getContentPane();	//장판
		JLabel label = new JLabel("Hello GUI");
		
		c.add(label);
		
		frame.setLocation(1000,200); 					//창이 실행되는 위치(가로 1000 세로 200씩 떨어져서)
		frame.setPreferredSize(new Dimension(500,200));	//창의 사이즈 변경
		frame.pack();									//변경사항 적용
		
		Font font = new Font(null,Font.ITALIC,32);				//폰트 크기 조절(32)
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임창 X버튼 누르면 같이 종료가 됨
		
		for(int i = 0; ; i++)
			label.setText(i + " : 안녕하세요");
		
	}
}
