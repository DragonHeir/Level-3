import java.util.ArrayList;
import java.util.Random;

class Crow {
	private String name;
	private ArrayList<String> stomachContents = new ArrayList<String>();


	public Crow(String name) {
		this.name = name;
		fillCrowsStomach();
	}


	private void fillCrowsStomach() {
		for (int i = 0; i < 10; i++)
			this.stomachContents.add(getRandomCrowFood());
	}


	private String getRandomCrowFood() {
		int randomness = new Random().nextInt(4);
		if (randomness == 0) return "carrion";
		else if (randomness == 1)return "snail";
		else if (randomness == 2)return "acorn";
		else if (randomness == 3)return "spider";
		else return "grub";
	}


	public String getName() {
		return name;
	}


	public ArrayList<String> getStomachContents() {
		return stomachContents;
	}


}