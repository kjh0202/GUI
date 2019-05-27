package gui9_10;
import javax.swing.*;

public class FrameTest extends JFrame {
	
	public FrameTest() {	//생성자(클래스이름과같음, 객체의 초기값 담당, 호출x, 자동생성)
		setTitle("병일이의 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);
		setLocation(200, 300);
		setResizable(false); 
		setVisible(true);
			
	}

	public static void main(String[] args) {
		new FrameTest();
	}
	
	

}
