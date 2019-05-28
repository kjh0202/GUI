package gui_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx1 extends JFrame {
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
	
	Container contentPane;
	public GraphicsDrawImageEx1() {
		setTitle("drawImage 사용 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		Mypanel2 panel = new Mypanel2();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class Mypanel2 extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/baseball.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			System.out.println("하이");
			g.drawImage(image, 20,20,250,100,100,50,200,200, this);

			//g.drawImage(image, 0, 0, this.getWidth(), 
					//this.getHeight(), this);
			//g.drawImage(image, 20,20, this);
		}

	}

}
