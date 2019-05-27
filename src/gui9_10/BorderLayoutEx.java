package gui9_10;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx() {
		//this.
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		contentPane.add(new JButton("Calculate"),BorderLayout.CENTER);
		
		setSize(350, 150);
		setVisible(true);
	}

		
	public static void main(String[] args) {
		new BorderLayoutEx(); 
	}

}


