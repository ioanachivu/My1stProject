package gui;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FormPanel  extends JPanel {

	public FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 100;
		setPreferredSize(dim);
	}
}
