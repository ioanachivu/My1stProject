package graphicUI;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends JFrame {

	@Override
	public void paint(Graphics g) {
		g.drawRect(50, 50, 50, 50);
		
		g.setColor(Color.CYAN);
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.ORANGE);
		g.fillRect(150, 150, 50, 80);
	}
	
	public Drawing() {
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Drawing();
	}
	
	
}
