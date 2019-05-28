package gui_12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//예제 12-1 : JPanel을 상속받아 도형 그리기
public class paintJPanelEx extends JFrame {
	public static void main(String[] args) {
		new paintJPanelEx();
	}

	Container contentPane;
	public paintJPanelEx() {
		setTitle("JPanel paintComponent예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.drawRect(90, 90, 50, 50);
		}
	}
	
}
