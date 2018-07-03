package applets;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Applet1 extends JApplet {

	public void paint (Graphics g) {
		super.paint(g);
		g.drawString("This is just a line", 25, 25);
	}

}
