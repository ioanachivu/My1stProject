package headFirstJava.GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		// make a random colored rectangle
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color randomColor = new Color(red, green, blue);
		
		g.setColor(randomColor);
		g.fillRect(100, 100, 50, 80);
	}

}
