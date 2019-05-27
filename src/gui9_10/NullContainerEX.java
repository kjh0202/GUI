package gui9_10;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEX extends JFrame{
	public NullContainerEX() {
		this.setTitle("Null Container Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		for(int k=10; k<=18; k--) {
			JButton g = new JButton(Integer.toString(k));
			g.setLocation(k*55, k*55);
			g.setSize(50, 20);
			c.add(g);
		}

		this.setSize(300, 200);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new NullContainerEX();
	}

}
