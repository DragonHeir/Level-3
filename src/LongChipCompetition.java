import java.util.ArrayList;


public class LongChipCompetition {


	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest chip. (In England, french fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 * **/


	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
public static void main(String[] args) {
LongChipCompetition l = new LongChipCompetition();
}

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");


		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
	LongChipCompetition(){
		initializeBeatles();
		double longestChip = 0;
		String winningBeatle = null;
		for (int i = 0; i < theBeatles.size(); i++) {
			for (int j = 0; j < theBeatles.get(i).getChips().size(); j++) {
				if (theBeatles.get(i).getChips().get(j).getLength() > longestChip){
					longestChip = theBeatles.get(i).getChips().get(j).getLength();
					winningBeatle = theBeatles.get(i).getName();
				}
			}
		}
		System.out.println("The Beatle with the longest chip is " + winningBeatle + ".");
	}
}
