package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
  https://openjfx.io/
  자바 GUI를 사용할때 편하게 사용할 수 있음
 
  scene builder 검색해서 참고 
	
  집을 지을때 장판을 깐다 >> container
  frame안에 container을 깔고 그안에 디자인을 한다
  

 
 */


public class MainClass03 {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("label example");
		// 집의 틀을 만들고
		
		Container con = frame.getContentPane();
		// 그 안에 장판을 깔았다
		
		JLabel label = new JLabel("test label");
		con.add(label);
		// 그 장판에 글자를 올리겠다
		Font font = new Font(null, Font.ITALIC, 32);
							// (글씨체, 기울임, 크기)
		label.setFont(font);
		
		// label.setText("aaaaaaA");
		// setText를 통해 안에있는 내용 수정 가능
		
		
		frame.setLocation(1000,200);
		// frame 시작위치
		
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		// 기본적으로 Dimension 타입으로 넣어야됨
		// pack()으로 기본사이즈 설정
		
		
		
		
		frame.setVisible(true);
		// 설정한 프레임 값을 보여주게 함
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X 버튼을 누르면 프로그램도 같이 종료
		// JFrame으로 접근이 가능 >> static으로 만들어짐
		// ctrl키를 누르고 EXIT_ON_CLOSE 클릭시 이동되는데 3으로 설정되어있음
		// 숫자는 의미를 한번에 알 수 없어서 문자열에 숫자를 담아두고 사용함
		
		
		for(int i=0; ;i++) {
			label.setText(i+".변경");
		}
		
		
	}
}





























