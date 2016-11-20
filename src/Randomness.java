import java.util.Random;

public class Randomness {
static boolean randomBoolean(){
	Random r = new Random();
	return r.nextBoolean();	
}
static int randomInt(){
	Random r = new Random();
	return r.nextInt(10)+1;
}
}
