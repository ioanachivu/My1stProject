package gui;
import javax.swing.*;

public class FirstApp {

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();			
			}
		});
	}
}
