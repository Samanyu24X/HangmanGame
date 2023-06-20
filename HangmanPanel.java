import java.awt.*;
import javax.swing.*;

public class HangmanPanel extends JPanel {
	
	StickFigurePanel panel;
	
	public HangmanPanel(StickFigurePanel p) {
		panel = p;
		
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		this.setVisible(true);
		
	}
	
	
	

	
}
