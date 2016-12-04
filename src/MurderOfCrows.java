import java.util.ArrayList;
import java.util.Random;


public class MurderOfCrows {


	ArrayList<Crow> theMurder = new ArrayList<Crow>();
	int deadCrows = 0;


	public static void main(String[] args) {
		MurderOfCrows murderOfCrows = new MurderOfCrows();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();
	}


	private void findTheDiamond() {
		/*
		 * 1. One of the Crows has eaten the diamond. You need to search through the stomach of each Crow, 
		 * then print the name of the guilty Crow.
		 */
		
		/* 2. How many innocent crows had to die before the diamond was found? */
		for (int i = 0; i < theMurder.size(); i++) {			
				for (String s : theMurder.get(i).getStomachContents()) {
					if (s.equals("diamond")) {
						System.out.println(theMurder.get(i).getName() +" had eaten the Diamond.");
						System.out.println("you killed "+ deadCrows/10 + " crows to find the Diamond.");
					}
					else {
						deadCrows = deadCrows + 1;
					}
				}			
		}
	}


	private void initializeCrows() {
		theMurder.add(new Crow("Rok"));
		theMurder.add(new Crow("Merle"));
		theMurder.add(new Crow("Poe"));
		theMurder.add(new Crow("Grenwyn"));
		theMurder.add(new Crow("Crawford"));
		hideTheDiamond();
	}


	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("diamond");
	}
}