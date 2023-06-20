import java.util.*;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;


public class MysteryWord {

	private String word;
	private String currentWord;
	boolean isComplete;
	int length;
	int wrongGuesses;
	Letters mysteryWordLetters;
	StickFigurePanel stickFigurePanel;
	
	public MysteryWord(StickFigurePanel panel) {
		stickFigurePanel = panel;
		word = createNewWord();
		isComplete = false;
		length = word.length();
		wrongGuesses = 0;
		currentWord = "_";
		
		
		for (int i = 0; i < word.length() - 1; i++) {
			currentWord = currentWord + " _";
		}
		mysteryWordLetters = new Letters();
		
	}

	private String createNewWord() {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Samanyu\\Downloads\\hangmanGroupOfWords.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List <String> wordBank = new ArrayList<String>();
		while (sc.hasNextLine()) {
			wordBank.add(sc.nextLine());
		}
		
		String[] words = wordBank.toArray(new String[0]);

		//here have it import a word from a text file of words
		int random = (int) (Math.random()*words.length) + 1;
		return words[random];
	}

	//true if something happened, false if they guessed the letter before
	public boolean guess(char guessChar) {
				
		
		
		//if has been guessed already
		String guessString = guessChar + "";
		
		if (mysteryWordLetters.isLetterUsed(guessString) == true) {
			//System.out.println("Used already");
			//open small window saying you've already guessed the word
			return true;
		}
		
		
		//if has not been guessed already

		mysteryWordLetters.setLetterUsed(guessString.toLowerCase());

		guessString = guessString.toLowerCase();
		guessChar = guessString.charAt(0);

		String resultWord = "";
		//System.out.println("Guessing now");
		//if it's in the word
			if (word.contains(guessString.toLowerCase())) {
				//System.out.println(word + " contains " + guessString);
				
				//System.out.println(word + ", " + guessChar);

				int i = 0;
				int j = 0;
				for (i = 0; i < length; i++) {
					
					//System.out.println(i);
					//System.out.println(word.charAt(i) + " : " + currentWord.charAt(i));

					
					if (word.charAt(i) == guessChar) {
						resultWord = resultWord + word.charAt(i) + " ";
						j = j + 2;
					}
					else if (word.charAt(i) == currentWord.charAt(j)) {
						resultWord = resultWord + currentWord.charAt(j) + " ";
						j = j + 2;
					}
					else {
						resultWord = resultWord + "_ ";
						j = j + 2;
					}
					//System.out.println("Word so far: " + resultWord);
					
				}
				//System.out.println("New current word: " + resultWord);
				
				this.currentWord = resultWord;
				return false;

			}
			//was not in the word
						
			else {
			//System.out.println(word + " does not contain " + guessString);
			stickFigurePanel.addStage();
			this.wrongGuesses++;
			//System.out.println(this.wrongGuesses);
			return false;
			}
		}
		
		
		
		
		
	
	
	public String getWord() {
		return word;
	}

	public boolean isComplete() {
		return (word.equals(currentWord));
	}

	public int getLength() {
		return length;
	}

	public int getWrongGuesses() {
		return wrongGuesses;
	}

	public String getCurrentWord() {
		return this.currentWord;
	}

	public void setCurrentWord(String currentWord) {
		this.currentWord = currentWord;
	}
	
	
}
