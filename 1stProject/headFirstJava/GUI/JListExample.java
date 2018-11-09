package headFirstJava.GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionListener;

//JList added to the scroller
//scroller added to the panel
//panel added to the frame

public class JListExample {

	String[] entries = {"alpha", "beta", "gamma","delta","zeta","eta"};
	
	JList list = new JList(entries);
	
	public JListExample() {
		JFrame frame = new JFrame("Example");
		JPanel panel = new JPanel();
		
		JScrollPane scroller = new JScrollPane(list); // adding list to the scroller
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		list.setVisibleRowCount(4); // set the number of lines to show before scroll
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // only one thing at a time can be selected
		
		panel.add(scroller); // adding scroller to panel
		
		frame.add(BorderLayout.CENTER,panel); // adding panel to the frame
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JListExample();
	}

}
