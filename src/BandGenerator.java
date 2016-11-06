import java.util.ArrayList;
import java.util.Random;

public class BandGenerator {
public static void main(String[] args) {
	ArrayList<String> Part1 = new ArrayList<String>();
	ArrayList<String> Part2 = new ArrayList<String>();
	Part1.add("Fancy");
	Part1.add("Crazy");
	Part1.add("Silly");
	Part1.add("Awesome");
	Part1.add("Fabulous");
	Part2.add("Pants");
	Part2.add("Heads");
	Part2.add("Bolts");
	Part2.add("Rappers");
	Part2.add("Knuckes");
	
	Random r = new Random();
	int bandname1 = r.nextInt(Part1.size());
	int bandname2 = r.nextInt(Part2.size());
	System.out.println("The " + Part1.get(bandname1) + " " + Part2.get(bandname2));
}
}
