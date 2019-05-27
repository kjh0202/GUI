package gui_11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon tel1 = new 
				ImageIcon("images/tel1.jpg");
		ImageIcon tel2 = new 
				ImageIcon("images/tel2.jpg");
		ImageIcon tel3 = new 
				ImageIcon("images/tel3.jpg");

		JButton btn = new JButton("call~~", tel1);
		btn.setRolloverIcon(tel2);
		btn.setPressedIcon(tel3);
		contentPane.add(btn);

		setSize(250,200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ButtonImageEx();
	}
} 

