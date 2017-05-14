import java.util.HashMap;

public class HashMapIntro {
public static void main(String[] args) {
	HashMap<Integer, String> studentList = new HashMap <Integer, String> ();
	studentList.put(1, "Evan");
	studentList.put(7, "Devin");
	studentList.put(5, "Kevin");
	studentList.put(9, "Seven");
	studentList.put(19, "Alec");
	studentList.put(21, "Bob");
	for (String s : studentList.values()) {
		System.out.println(s);
	}
}
}
//copyright 2017 Evan Wright