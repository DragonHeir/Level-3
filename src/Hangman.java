import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman {
	static int livesRemaining = 9;
	static int wordsSolved = 0;
	Stack <Word> wordStack = new Stack <Word> ();
	Word currentWord = new Word("test");
public static void main(String[] args) {
	
	
	JFrame frame = new JFrame("Hang Man");
	JPanel panel = new JPanel();
	JLabel labelOne = new JLabel("Guess a letter:");
	JLabel theWord = new JLabel("Insert Word");
	JLabel labelTwo = new JLabel("You have " + livesRemaining + " lives left.");
	JLabel labelThree = new JLabel("You solved " + wordsSolved + " words.");
	
	frame.add(panel);
	panel.add(labelOne);
	panel.add(theWord);
	panel.add(labelTwo);
	panel.add(labelThree);
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
void displayNextWord(){
	currentWord = wordStack.pop();
}
}
