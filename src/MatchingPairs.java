import java.util.HashMap;

public class MatchingPairs {
public static void main(String[] args) {
	HashMap<String, String> h1 = new HashMap<String,String>();
	HashMap<String, String> h2 = new HashMap<String,String>();
	h1.put("Bob", "Joe");
	h1.put("Dave", "Sid");
	h1.put("Jeff", "Sue");
	h1.put("Paul", "Zoe");
	h2.put("Bob", "Joe");
	h2.put("John", "Sid");
	h2.put("Paul", "Zoe");
	h2.put("Jeff", "Sue");
	int count = getMatchingPairs(h1, h2);
	System.out.println(count);

}

private static int getMatchingPairs(HashMap<String, String> h1, HashMap<String, String> h2) {
	int x = 0;
	for (String s : h1.keySet()) {
		if (h1.get(s).equals(h2.get(s)))
		{
			x += 1;
		}
	}
	return x;
}
}
