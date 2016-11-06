import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
public static void main(String[] args) {
	ArrayList<String> DinnerType = new ArrayList<String>();
	DinnerType.add("steak");
	DinnerType.add("hamburger");
	DinnerType.add("spaghetti");
	DinnerType.add("pasta");
	DinnerType.add("meatloaves");
	
	Random r = new Random();
	int foodchoice = r.nextInt(DinnerType.size());
	System.out.println("You should eat " + DinnerType.get(foodchoice) + " today!");
	
	
}
}
