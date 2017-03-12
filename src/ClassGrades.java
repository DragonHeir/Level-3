import java.util.HashMap;
import java.util.Random;

public class ClassGrades {
public static void main(String[] args) {
	HashMap <String, Integer> classScores = new HashMap <String, Integer> ();
	Random r = new Random();
	for (int i = 0; i < 100; i++) {
		int k = r.nextInt(5);
		String key = "";
		int value = r.nextInt(101);
		if (k==0){
			key = "English";
		}
		else if (k==1){
			key = "Math";
		}
		else if (k==2){
			key = "Science";
		}
		else if (k==3){
			key = "Art";
		}
		else {
			key = "History";
		}
		if (classScores.keySet().contains(key)){
			int g = classScores.get(key);
			int gradeAverage = (g + value)/2;
			classScores.put(key, gradeAverage);
		}
		else {
			classScores.put(key, value);
		}
	}
	System.out.println(classScores);
}
}
