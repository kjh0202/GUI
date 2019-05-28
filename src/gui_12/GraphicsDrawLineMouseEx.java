package gui_12;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
	
	Container contentPane;
	GraphicsDrawLineMouseEx() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel4 panel = new MyPanel4();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel4 extends JPanel {
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		public MyPanel4() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
		});
			
	}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
				for(int i=0; i<vs.size(); i++) {
					Point s = vs.elementAt(i);
					Point e = ve.elementAt(i);
					g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				}
		}
	}
	
}
