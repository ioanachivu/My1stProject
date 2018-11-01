package graphicUI;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextPanel extends JPanel {

	private JTextArea textArea = new JTextArea();
	
	// constructor
	public TextPanel () {
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}

	public void appendText(String string) {
		textArea.append(string);
	}
}
