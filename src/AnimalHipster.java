import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals){
		ArrayList<String> AnimalHipsters = new ArrayList<String> ();
		for (String s : network.keySet()) {
			String animal = favoriteAnimals.get(s);
			for (String t : network.keySet()) {
				if (!animal.equals(t)){
					AnimalHipsters.add(s);
				}
				
			}
		}
		return AnimalHipsters;
	}

}
//copyright 2017 Evan Wright