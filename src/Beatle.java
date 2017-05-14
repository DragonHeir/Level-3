import java.util.ArrayList;
import java.util.Random;

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();


	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}


	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in")) chips.add(new Chip(10));
		}
	}


	public ArrayList<Chip> getChips() {
		return this.chips;
	}


	public String getName() {
		return this.name;
	}


}
//copyright 2017 Evan Wright