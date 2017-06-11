import java.util.ArrayList;

public class Word {
String correctAnswer;
ArrayList<Character> letterList = new ArrayList<Character>();
public Word(String w){
	correctAnswer = w;
	getDisplayedWord();
	for (int i = 0; i < w.length(); i++) {
		letterList.add((char) i);
	}
	} 
	String getDisplayedWord(){
		
		
		return "_ _ _ _";
	}
	
}
