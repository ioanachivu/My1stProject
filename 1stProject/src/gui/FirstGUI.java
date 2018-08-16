package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FirstGUI {

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Hello World!");
				frame.setSize(400,500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);				
			}
		});

	}

}
