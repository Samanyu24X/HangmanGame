import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyListener extends Panel implements ActionListener {
	
	JButton q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, z, x, c, v, b, n, m;
	MysteryWord word;
	HangmanPanel panel;
	SpecialWordPanel specialWordPanel;

	
	public KeyListener(SpecialWordPanel specialWordPanel, HangmanPanel panel, MysteryWord word) {
			
		this.word = word;
		this.panel = panel;
		this.specialWordPanel = specialWordPanel;
		
		JPanel pTop = new JPanel();
		JPanel pMid = new JPanel();
		JPanel pBottom = new JPanel();
		
		pTop.setLayout(new GridLayout(1,10));
		pMid.setLayout(new GridLayout(1,9));
		pBottom.setLayout(new GridLayout(1,7));
		
		
		// creating and adding the first row
		
		q = new JButton("Q");		
		w = new JButton("W");
		e = new JButton("E");
		r = new JButton("R");
		t = new JButton("T");
		y = new JButton("Y");
		u = new JButton("U");
		i = new JButton("I");
		o = new JButton("O");
		p = new JButton("P");
		
		pTop.add(q);
		pTop.add(w);
		pTop.add(e);
		pTop.add(r);
		pTop.add(t);
		pTop.add(y);
		pTop.add(u);
		pTop.add(i);
		pTop.add(o);
		pTop.add(p);

		q.addActionListener(this);
		w.addActionListener(this);
		e.addActionListener(this);
		r.addActionListener(this);
		t.addActionListener(this);
		y.addActionListener(this);
		u.addActionListener(this);
		i.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		
		// creating and adding second row
		
		a = new JButton("A");
		s = new JButton("S");
		d = new JButton("D");
		f = new JButton("F");
		g = new JButton("G");
		h = new JButton("H");
		j = new JButton("J");
		k = new JButton("K");
		l = new JButton("L");

		pMid.add(a);
		pMid.add(s);
		pMid.add(d);
		pMid.add(f);
		pMid.add(g);
		pMid.add(h);
		pMid.add(j);
		pMid.add(k);
		pMid.add(l);

		a.addActionListener(this);
		s.addActionListener(this);
		d.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		
		// creating and adding third row
		
		z = new JButton("Z");
		x = new JButton("X");
		c = new JButton("C");
		v = new JButton("V");
		b = new JButton("B");
		n = new JButton("N");
		m = new JButton("M");
		
		pBottom.add(z);
		pBottom.add(x);
		pBottom.add(c);
		pBottom.add(v);
		pBottom.add(b);
		pBottom.add(n);
		pBottom.add(m);
		
		z.addActionListener(this);
		x.addActionListener(this);
		c.addActionListener(this);
		v.addActionListener(this);
		b.addActionListener(this);
		n.addActionListener(this);
		m.addActionListener(this);

		
		this.setLayout(new BorderLayout());
		
		this.add(pTop, BorderLayout.NORTH);
		this.add(pMid, BorderLayout.CENTER);
		this.add(
		pBottom, BorderLayout.SOUTH);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getActionCommand());
		if (word.guess(e.getActionCommand().charAt(0)) == true) {
			JOptionPane.showMessageDialog(panel, "You have already guessed this letter, "
					+ "please select a different one");
		}
		else {
			if (word.getWrongGuesses() >= 6) {
				JOptionPane.showMessageDialog(panel, "You ran out of guesses! The word was: " 
						+ word.getWord());
				System.exit(0);
				
			}
			//System.out.println("About to update");
			specialWordPanel.update();
			
			if (word.getCurrentWord().contains("_") == false) {
				JOptionPane.showMessageDialog(panel, "You won! You correctly guessed: "
						+ word.getWord());
				System.exit(0);
			}
		}
	}
	


	
	
}

	

