import java.util.ArrayList;

public class Plane {
	int numberOfPassangers;
	ArrayList <Snake> Snakes = new ArrayList <Snake>();
public static void main(String[] args) {
	Plane p = new Plane();
}
Plane(){
for (int i = 0; i < 100; i++) {
		Snakes.add(new Snake(Randomness.randomInt(), Randomness.randomBoolean()));
}
int TotalVenom = 0;
for (int i = 0; i < Snakes.size(); i++) {
	if (Snakes.get(i).getisVenemous()) {
		TotalVenom = TotalVenom + Snakes.get(i).getViciousness();	
	}
}
System.out.println(TotalVenom);
}
}
