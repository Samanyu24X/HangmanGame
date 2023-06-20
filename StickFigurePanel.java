import javax.swing.*;
import java.awt.*;

public class StickFigurePanel extends JPanel{
	
	
	public int stage = 3;
	
	public StickFigurePanel() {
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		this.setBackground(Color.DARK_GRAY);
		g.setColor(Color.WHITE);
		
		//checks the stage each time to verify whether the next figure should be drawn
		g.drawLine(150, 300, 250, 300);
		g.drawLine(200, 50, 200, 300);
		g.drawLine(200, 50, 300, 50);
		g.drawLine(300, 50, 300, 75);
		
		
		switch(this.stage) {
			case 4:{
				g.drawOval(285, 78, 30, 30);
				break;
			}
			case 5:{
				g.drawOval(285, 78, 30, 30);
				g.drawLine(300, 108, 300, 200);
				break;
			}
			case 6:{
				g.drawOval(285, 78, 30, 30);
				g.drawLine(300, 108, 300, 200);
				g.drawLine(300, 200, 270, 250);
				break;
			}
			case 7:{
				g.drawOval(285, 78, 30, 30);
				g.drawLine(300, 108, 300, 200);
				g.drawLine(300, 200, 270, 250);
				g.drawLine(300, 200, 330, 250);
				break;
			}
			case 8:{
				g.drawOval(285, 78, 30, 30);
				g.drawLine(300, 108, 300, 200);
				g.drawLine(300, 200, 270, 250);
				g.drawLine(300, 200, 330, 250);
				g.drawLine(300, 135, 330, 180);
				break;
			}
			case 9:{
				g.drawOval(285, 78, 30, 30);
				g.drawLine(300, 108, 300, 200);
				g.drawLine(300, 200, 270, 250);
				g.drawLine(300, 200, 330, 250);
				g.drawLine(300, 135, 330, 180);
				g.drawLine(300, 135, 270, 180);
				break;
			}
			
		}
		
	}
	
	public void addStage () {
		this.stage++;
		this.repaint();
	}
	
}
