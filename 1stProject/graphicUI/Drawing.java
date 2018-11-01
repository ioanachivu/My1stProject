package graphicUI;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Drawing extends JFrame {

	@Override
	public void paint(Graphics g) {
		g.drawRect(300, 300, 50, 50);
		
		g.setColor(Color.CYAN);
		g.fillOval(350, 350, 50, 50);
		
		g.setColor(Color.ORANGE);
		g.fillRect(400, 400, 50, 80);
		
		Image img = new ImageIcon("D://My Pictures//diferite//apus.jpg").getImage();
		g.drawImage(img,0,0,400,250,this);
	}
	
	public Drawing() {
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Drawing();
	}
	
	
}
