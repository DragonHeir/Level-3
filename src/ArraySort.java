import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	Scanner key = new Scanner(System.in);
	//allows console input
public static void main(String[] args) {
	ArraySort j = new ArraySort();
}
ArraySort(){
	int[] inputArray = new int[10];
	//how to make an array
	System.out.println("Input 10 Numbers");
	for (int i = 0; i < inputArray.length; i++) {
		inputArray[i] = key.nextInt();
	}
	//fills in each of the blank array variables with the next thing typed into the console
	Arrays.sort(inputArray);
	//sorts the desired array into numerical order
	for (int i = 0; i < inputArray.length; i++) {
		System.out.println(inputArray[i]);	
	}
}
}
//copyright 2017 Evan Wright