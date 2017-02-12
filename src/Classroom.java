import java.util.ArrayList;

public class Classroom {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student Evan = new Student("Evan", "Brown");
		Student Alec = new Student("Alec", "Brown");
		Student Joseph = new Student("Joseph", "Green");
		Student Ryan = new Student("Ryan", "Blue");
		Student Lucy = new Student("Lucy", "Green");
		Student Joe = new Student("Joe", "Brown");
		Student Eustace = new Student("Eustace", "Blue");
		Student Mary = new Student("Mary", "Green");
		Student Sophie = new Student("Sophie", "Green");
		Student John = new Student("John", "Green");

		students.add(Evan);
		students.add(Alec);
		students.add(Joseph);
		students.add(Ryan);
		students.add(Lucy);
		students.add(Joe);
		students.add(Eustace);
		students.add(Mary);
		students.add(Sophie);
		students.add(John);

		int averageIQ;
		FindCommonEyeColor(students);

	}

	private static void FindCommonEyeColor(ArrayList<Student> students) {
		int brownNum = 0;
		int greenNum = 0;
		int blueNum = 0;
		for (Student s : students) {
			if (s.eyeColor.equals("Brown")) {
				brownNum += 1;
			}
			if (s.eyeColor.equals("Green")) {
				greenNum += 1;
			}
			if (s.eyeColor.equals("Blue")) {
				blueNum += 1;
			}
		}
		System.out.println(brownNum);
		System.out.println(blueNum);
		System.out.println(greenNum);
		if (brownNum > blueNum && brownNum > greenNum) {
			System.out.println("Brown");
		}
		if (blueNum > brownNum && blueNum > greenNum) {
			System.out.println("Blue");
		}
		if (greenNum > brownNum && greenNum > blueNum) {
			System.out.println("Green");
		}
	}

	private static int findAverage(ArrayList<Student> students) {
		int temp = 0;
		for (Student s : students) {
			temp += s.iq;
		}
		int average = temp / students.size();
		System.out.println(average);
		return average;

	}
}

class Student {
	int iq;
	String name;
	String eyeColor;

	Student(String n, String e) {

		eyeColor = e;
		name = n;

	}
}
