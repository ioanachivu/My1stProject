package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {

	private TextPanel textPanel = new TextPanel();
	private JButton button = new JButton("Click me");
	private Toolbar toolbar = new Toolbar();
	
	// constructor
	public MainFrame() {
		super("Hello World!");
		setLayout(new BorderLayout());
		toolbar.setTextPanel(textPanel);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("Hello\n");
				
			}
		});
		
		setLayout(new BorderLayout());
		add(textPanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);

		
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
}
