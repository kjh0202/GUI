package gui_12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//이미지 위에 윈 드래깅 연습
public class GraphicsAndMuouseDraggingFrame extends JFrame {
	public static void main(String[] args) {
		new GraphicsAndMuouseDraggingFrame();
	}
	
	public GraphicsAndMuouseDraggingFrame() {
		super("이미지 위에 윈 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel7());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel7 extends JPanel {
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		int ovalX = 100, ovalY = 100;
		public MyPanel7() {
			this.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 20, 20);
		}
	}

}
