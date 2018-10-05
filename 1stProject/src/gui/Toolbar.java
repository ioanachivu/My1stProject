package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
		
	private JButton button1 = new JButton("Hello");
	private JButton button2 = new JButton("Goodbye");
	private TextPanel textPanel;

	public Toolbar () { 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(button1);
		add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == button1) {
			textPanel.appendText("Hello\n");
		} else {
			textPanel.appendText("Goodbye\n");
		}
		
	}
	
	public void setTextPanel (TextPanel textPanel) {
		this.textPanel = textPanel;
	}
}
