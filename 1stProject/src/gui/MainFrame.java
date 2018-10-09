package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {

	private TextPanel textPanel = new TextPanel();
	private Toolbar toolbar = new Toolbar();
	
	// constructor
	public MainFrame() {
		super("Hello World!");
		setLayout(new BorderLayout());
		
		toolbar.setStringListener(new StringListener() {
			@Override
			public void stringEmitted(String text) {
				textPanel.appendText(text);
			}
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.SOUTH);
		
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
}
