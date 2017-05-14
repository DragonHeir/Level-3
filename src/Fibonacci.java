
public class Fibonacci {
public static void main(String[] args) {
	int total = 100;
	printFibonacci(total);
}

private static void printFibonacci(int total) {
	int f = 0;
	int s = 1;
	int t = 1;
	System.out.println(1);
	for (int i = 0; i < total-1; i++) {
		t = f + s;
		f = s;
		s = t;
		System.out.println(t);
	}
}
}
//copyright 2017 Evan Wright