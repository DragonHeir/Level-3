import java.util.ArrayList;

public class NotMyFault {
public static void main(String[] args) {
	ArrayList<Integer> crash = new ArrayList<Integer>();
	for (int i = 0; true; i++) {
		crash.add(crash.size() + 1);
		System.out.println(crash.get(i));
	}
}
}
