package gui;
import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private JTextArea textArea = new JTextArea();
	private JButton button = new JButton("Click me");
	
	public MainFrame() {
		super("Hello World!");
		
		setLayout(new BorderLayout());
		
		add(textArea, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
}
