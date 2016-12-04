import java.util.ArrayList;

public class Plane {
	int NumberOfPassangers;
	ArrayList <Snake> Snakes = new ArrayList <Snake>();
public static void main(String[] args) {
	Plane p = new Plane(80);
}
Plane(int Passangers){
	this.NumberOfPassangers = Passangers;
for (int i = 0; i < 100; i++) {
		Snakes.add(new Snake(Randomness.randomInt(), Randomness.randomBoolean()));
}
int TotalVenom = 0;
for (int i = 0; i < Snakes.size(); i++) {
	if (Snakes.get(i).getisVenemous()) {
		TotalVenom = TotalVenom + Snakes.get(i).getViciousness();	
	}
}
int DeathChance = TotalVenom*10/NumberOfPassangers;
if (DeathChance > 100){
	DeathChance = 100;
}
System.out.println("Chance of death is "+ DeathChance + "%");
}
}
