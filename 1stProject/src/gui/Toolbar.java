package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
		
	private JButton button1 = new JButton("Hello");
	private JButton button2 = new JButton("Goodbye");
	
	private StringListener stringListener;

	public Toolbar () { 
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(button1);
		add(button2);
	}

	public void setStringListener (StringListener listener) {
		this.stringListener = listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == button1) {
			if(stringListener != null) {
				stringListener.stringEmitted("Hello\n");
			}
		} else {
			if(stringListener != null) {
				stringListener.stringEmitted("Goodbye\n");
			}
		}
		
	}
	

}
