package gui;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javafx.scene.layout.Border;

public class FormPanel  extends JPanel {

	public FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 200;
		setPreferredSize(dim);

		TitledBorder innerBorder = new TitledBorder("New Account");
		EmptyBorder outerBorder = new EmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
	}
}
