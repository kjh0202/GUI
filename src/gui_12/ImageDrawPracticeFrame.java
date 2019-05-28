package gui_12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//패널에 이미지 넣고 그 위에 버튼만들기
public class ImageDrawPracticeFrame extends JFrame {
	public static void main(String[] args) {
		new ImageDrawPracticeFrame();
	}

	public ImageDrawPracticeFrame() {
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel6());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel6 extends JPanel {
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		
		public MyPanel6() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

}
