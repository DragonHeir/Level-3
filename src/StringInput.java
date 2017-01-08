import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StringInput {
public static void main(String[] args) {
	ArrayList <String> wordList = new ArrayList <String> ();
	String userInput = JOptionPane.showInputDialog("Enter Something");
	while (!userInput.equals("")){
		wordList.add(userInput);
		userInput = JOptionPane.showInputDialog("Enter Something");
	}
	for (String s : wordList){
		System.out.println(s);		
	}
}
}
