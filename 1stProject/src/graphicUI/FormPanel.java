package graphicUI;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javafx.scene.layout.Border;

public class FormPanel  extends JPanel {

	private JLabel nameLabel = new JLabel("Name: ");
	private JLabel occupationLabel = new JLabel("Occupation: ");
	private JTextField nameField = new JTextField(10);
	private JTextField occupationField = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	private FormListener formListener;
	
	
	public FormPanel() {
		// setting the preferred size of the panel
		Dimension dim = getPreferredSize();
		dim.width = 300;
		setPreferredSize(dim);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String occupation = occupationField.getText();
				
				FormEvent ev = new FormEvent(this, name, occupation);
				
				if (formListener != null) {
					formListener.formEventOccured(ev);
				}
			}
		});

		// creating a very visible border 
		TitledBorder innerBorder = new TitledBorder("New Account");
		EmptyBorder outerBorder = new EmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		// creating the grid visualization 
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//////////////////////////// First row /////////////////////////////////////
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		add(nameLabel, gc);
		
		// changing coordinates to place name field
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);
		
		
		//////////////////////////// Second row ///////////////////////////////////////
		// changing coordinates to place occupation label
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		add(occupationLabel, gc);
		
		// changing coordinates to place occupation field
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(occupationField, gc);
		
		///////////////////////////// Adding the OK button ///////////////////////////////
		gc.weightx = 1;
		gc.weighty = 3;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(okButton, gc);
		
	}
	
	public void setFormListener (FormListener listener) {
		this.formListener = formListener;
	}
}
