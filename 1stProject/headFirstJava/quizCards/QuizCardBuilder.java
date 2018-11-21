package headFirstJava.quizCards;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class QuizCardBuilder {

	private JTextArea question;
	private JTextArea answer;
	private JPanel mainPanel;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;

	public static void main(String[] args) {
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
	}

	private void go() {
		frame = new JFrame("Quiz Card Builder");
		mainPanel = new JPanel();
		question = new JTextArea(6, 20);
		answer = new JTextArea(6, 20);
		cardList = new ArrayList<>();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);

		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);

		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);

		JScrollPane aScroller = new JScrollPane(question);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JButton nextButton = new JButton("Next Card");
		nextButton.addActionListener(new NextCardListener());

		JLabel qLabel = new JLabel("Question");
		JLabel aLabel = new JLabel("Answer");

		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextButton);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");

		newMenuItem.addActionListener(new NewMenuListener());
		saveMenuItem.addActionListener(new SaveMenuListener());

		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);

		frame.setJMenuBar(menuBar);
		frame.add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}

	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}
	}

	public class SaveMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);

			// brings up a file dialog box and waits on this line until the user chooses
			// "SAve"
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}
	}

	public class NewMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cardList.clear();
			clearCard();
		}

	}

	private void saveFile(File selectedFile) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
			for (QuizCard card : cardList) {
				writer.write(card.getQuestion() + "/");
				writer.write(card.getAnswer() + "\n");
			}
			writer.close();
		} catch (IOException ex) {
			System.out.println("couldn't write the cardList out");
			ex.printStackTrace();
		}
	}

	private void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
}
