package headFirstJava.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorChangeClick {
	JFrame frame;
	JLabel label;
	JButton colorButton;
	JButton labelButton;

	// constructor
	public ColorChangeClick() {
		frame = new JFrame("I am changing color");
		label = new JLabel("I'm a label");
		
		colorButton = new JButton("Change color");
		colorButton.addActionListener(new ColorListener());
		
		labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());

		frame.add(BorderLayout.SOUTH, colorButton);
		frame.add(BorderLayout.EAST, labelButton);
		frame.add(BorderLayout.CENTER, new MyDrawPanel());
		frame.add(BorderLayout.WEST, label);

		// basic 'can't live without' settings
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ColorChangeClick();
	}

	// nested class
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			label.setText("Ouch!");
		}
	}

	// nested class
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
		}
	}

	// nested class
	class MyDrawPanel extends JPanel {
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
}
