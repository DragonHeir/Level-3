import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ComedyCentral {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	
	ArrayList<String> Setup = new ArrayList<String>();
	Setup.add("Are you feeling grizzly right now?");
	Setup.add("Are you a drawer?");
	Setup.add("Are you a red light?");
	Setup.add("Are you an automobile?");
	Setup.add("Do you have Auto Imunodeficiency Disorder?");
	
	ArrayList<String> Joke = new ArrayList<String>();
	Joke.add("Because you can't seem to bear these puns.");
	Joke.add("Because you obviously can't handle these puns.");
	Joke.add("Because you seriously want me to stop.");
	Joke.add("Because you are getting tired of these puns.");
	Joke.add("Because you are easily getting sick of my puns.");
	
		Random r = new Random();
		int jokechoice = r.nextInt(Joke.size());
		System.out.println(Setup.get(jokechoice));
		kb.next();
		System.out.println(Joke.get(jokechoice));
}
}