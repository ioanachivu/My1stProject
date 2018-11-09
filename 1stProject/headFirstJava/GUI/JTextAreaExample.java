package headFirstJava.GUI; 

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

//textArea added to the scroller
//scroller added to the panel
//panel added to the frame

public class JTextAreaExample implements ActionListener {
	
	JTextArea textArea; 
	
	// constructor
	public JTextAreaExample () {
		JFrame frame = new JFrame("Example");
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Just click it");
		button.addActionListener(this);
		
		textArea = new JTextArea(10,20);
		textArea.setLineWrap(true);
		
		JScrollPane scroller = new JScrollPane(textArea); // adding textArea to the scroller
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller); // adding the scroller to the panel
		
		frame.add(BorderLayout.CENTER,panel); // adding panel to the frame
		frame.add(BorderLayout.SOUTH, button); // adding button to the frame
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTextAreaExample();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.append("Button clicked \n");
		
	}

}
