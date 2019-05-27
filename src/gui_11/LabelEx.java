package gui_11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LabelEx extends JFrame {
	Container contentPane;
	LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon love = new ImageIcon("images/love.jpg");
		JLabel imageLabel = new JLabel(love);
		ImageIcon tele = new 
				ImageIcon("images/tele.jpg");
		JLabel label = new JLabel("보고싶으면 전화하세요", 
				tele, SwingConstants.CENTER);

		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);

		setSize(400,600);
		setVisible(true);
	}
	public static void main(String [] args) {
		new LabelEx();
	} 
} 
