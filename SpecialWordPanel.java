import java.awt.*;
import javax.swing.*;

public class SpecialWordPanel extends JPanel {

	String specialWord;
	JLabel wordBlanks;
	JPanel wordPanel;
	MysteryWord mysteryWord;
	
	public SpecialWordPanel(MysteryWord word) {
		mysteryWord = word;
		specialWord = null;
		this.specialWord = mysteryWord.getCurrentWord();
		this.setLayout(new BorderLayout(1,1));
		wordBlanks = new JLabel(specialWord);
		
		wordBlanks.setIgnoreRepaint(true);
		
		wordPanel = new JPanel();
		//wordBlanks = new JLabel(specialWord.getCurrentWord());

		wordPanel.add(wordBlanks, BorderLayout.SOUTH);
		
		this.add(wordPanel, BorderLayout.CENTER);
	}

	public String getSpecialWord() {
		return specialWord;
	}

	public JLabel getWordBlanks() {
		return wordBlanks;
	}
	
	public void update() {
		wordBlanks.setText(mysteryWord.getCurrentWord());
		
		
	}
	
	
	
}

