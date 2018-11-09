package headFirstJava.GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {

	int x = 70;
	int y = 70;
	
	// constructor
	public SimpleAnimation () {
		JFrame frame = new JFrame();
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(drawPanel);
		frame.setSize(300, 300);	
		frame.setVisible(true);
		
		for (int i=0; i<=130; i++) {
			x++; y++;
			drawPanel.repaint();
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new SimpleAnimation();
	}
	
	// inner class
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.pink);
			g.fillOval(x, y, 50, 50);
		}
	}
}
