package headFirstJava.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeClick implements ActionListener {
	JFrame frame = new JFrame("I am changing color");
	JButton button = new JButton("Change color") ;

	public ColorChangeClick() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(this);

		frame.add(BorderLayout.SOUTH, button);
		frame.add(BorderLayout.CENTER, new MyDrawPanel());
	}

	public static void main(String[] args) {
		new ColorChangeClick();
	}

	public void actionPerformed(ActionEvent e) {
		frame.repaint();
	}

}
