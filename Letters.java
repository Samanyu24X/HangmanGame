import java.util.*;
public class Letters {

	
	private ArrayList<String> letterList = new ArrayList<String>();
	//private ArrayList<Boolean> usedList = new ArrayList<Boolean>();
	private boolean[] usedList = new boolean[26];
	
	
	public Letters() {
		
		//adding all the letters to the list
		letterList.clear();
		letterList.add("Q");
		letterList.add("W");
		letterList.add("E");
		letterList.add("R");
		letterList.add("T");
		letterList.add("Y");
		letterList.add("U");
		letterList.add("I");
		letterList.add("O");
		letterList.add("P");
		letterList.add("A");
		letterList.add("S");
		letterList.add("D");
		letterList.add("F");
		letterList.add("G");
		letterList.add("H");
		letterList.add("J");
		letterList.add("K");
		letterList.add("L");
		letterList.add("Z");
		letterList.add("X");
		letterList.add("C");
		letterList.add("V");
		letterList.add("B");
		letterList.add("N");
		letterList.add("M");

		//a list of booleans that determine whether something is used
		for (int i = 0; i < 26; i++) {
			usedList[i] = false;
		}
	}
	
	// returns whether the chosen letter has been guessed already
	public boolean isLetterUsed(String letter) {
		
		//finds index of the letter
		int index = letterList.indexOf(letter);
		//returns whether it is used
		return usedList[index];
		
	}
	
	public void setLetterUsed(String letter) {
		letter = letter.toUpperCase();
		int index = letterList.indexOf(letter);
		//returns whether it is used
		usedList[index] = true;
	}
	
	
	
	
}
