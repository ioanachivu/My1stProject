package gui;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	
	private JButton button1 = new JButton("Hello");
	private JButton button2 = new JButton("Goodbye");

	public Toolbar () { 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(button1);
		add(button2);
	}
}
