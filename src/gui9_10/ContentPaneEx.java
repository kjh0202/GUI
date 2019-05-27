package gui9_10;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		//this.
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
