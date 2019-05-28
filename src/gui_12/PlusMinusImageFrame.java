package gui_12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//그래픽 이미지 확대 축소 연습
public class PlusMinusImageFrame extends JFrame {
	public static void main(String[] args) {
		new PlusMinusImageFrame();
	}
	
	public PlusMinusImageFrame() {
		super("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel8());
		setSize(300, 300);
		setVisible(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel8 extends JPanel {
		ImageIcon icon = new ImageIcon("images/apple.jpg");
		Image img = icon.getImage();
		int width;
		int height;
		public MyPanel8() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					System.out.println("하이");
					if(e.getKeyChar() == '+') {
						width = (int)(width*1.1);
						height = (int)(height*1.1);
						repaint();
					}
					else if(e.getKeyChar() == '-') {
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint();
					}
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}
}	

