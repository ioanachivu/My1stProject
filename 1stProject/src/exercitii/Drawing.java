package exercitii;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Drawing();
	}
	
	public Drawing() {
		setSize(300, 300);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		
		g.drawRect(50, 50, 50, 50);
		
		g.setColor(Color.CYAN);
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.ORANGE);
		g.fillRect(150, 150, 50, 80);
	}
}
