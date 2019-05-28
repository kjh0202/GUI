package gui_11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxPracticeFrame extends JFrame {
	public static void main(String[] args) {
		new CheckBoxPracticeFrame();
	}
	JButton btn = new JButton("text button");
	public CheckBoxPracticeFrame() {
		super("CheckBox Practice Frame");
		setTitle("테스트버튼 비활성화 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JCheckBox a = new JCheckBox("버튼 비활성화");
		JCheckBox b = new JCheckBox("버튼감추기");
		add(a);
		add(b);
		add(btn);
		
		a.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		
		b.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		setSize(250,200);
		setVisible(true);
	}
	
}
