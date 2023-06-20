import java.awt.*;
import javax.swing.*;



public class HangmanMain {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Hangman");
		
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		//container.setBackground(Color.DARK_GRAY);

		
		
		StickFigurePanel figurePanel = new StickFigurePanel();

		MysteryWord word = new MysteryWord(figurePanel);
		//System.out.println(word.getWord());
		
		SpecialWordPanel specialWordPanel = new SpecialWordPanel(word);
		HangmanPanel manHang = new HangmanPanel(figurePanel);
		KeyListener keys = new KeyListener(specialWordPanel, manHang, word);
		
		specialWordPanel.setIgnoreRepaint(true);
		manHang.setIgnoreRepaint(true);

		
		container.add(specialWordPanel, BorderLayout.NORTH);
		container.add(keys, BorderLayout.SOUTH);
		container.add(manHang, BorderLayout.CENTER);
		
		
		window.setContentPane(container);
	     
	    window.setSize(600,480);
	    window.setLocation(100,100);
	    window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    window.setResizable(false);  // User can't change the window's size.
	    window.setVisible(true);
	}

}
