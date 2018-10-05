package gui;
import javax.swing.*;

public class FirstApp {

	public static void main(String[] args) {
	
		//new MainFrame();
		
		// creating new thread for the main frame
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();			
			}
		});
	}
}
