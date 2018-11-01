package headFirstJava.GUI;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Drawing extends JFrame {
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(300, 300, 50, 50);
		
		g.setColor(Color.CYAN);
		g.fillOval(350, 350, 50, 50);
		
		// make a random colored rectangle
		int red = (int) (Math.random()*256);
		int green = (int) (Math.random()*256);
		int blue = (int) (Math.random()*256);
		Color randomColor = new Color(red, green, blue);
		
		g.setColor(randomColor);
		g.fillRect(400, 400, 50, 80);
		
		// add an image to the frame
		Image img = new ImageIcon("D://My Pictures//diferite//apus.jpg").getImage();
		g.drawImage(img,0,0,400,250,this);
		
		//make a gradient oval
		GradientPaint gradient = new GradientPaint(500,500,Color.CYAN,600,600,Color.DARK_GRAY);
		((Graphics2D) g).setPaint(gradient);
		g.fillOval(500, 500, 100, 100);
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
