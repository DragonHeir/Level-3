import java.util.Stack;

public class StackBot {
	public static void main(String[] args) {
		Stack<String> commands = new Stack<String>();
		{
			commands.push("1.15 N");
			commands.push("0.79 S");
			commands.push("0.25 W");
			commands.push("0.15 W");
			commands.push("1.78 S");
			commands.push("0.95 E");
			commands.push("0.75 E");
			commands.push("1.37 N");
			commands.push("0.75 E");
			commands.push("1.85 W");
			commands.push("1.73 W");
			commands.push("0.72 N");
			commands.push("0.75 E");
			commands.push("0.65 E");
			commands.push("1.09 S");
			commands.push("1.75 W");
			commands.push("1.55 N");
			commands.push("0.73 E");
			commands.push("1.05 W");
			commands.push("0.71 E");
			commands.push("1.45 E");
			commands.push("1.75 N");
			commands.push("1.91 S");
			commands.push("0.45 S");
			commands.push("0.11 E");
		}
		double xPos = 0.0;
		double yPos = 0.0;
		int size = commands.size();
		for (int i = 0; i < size; i++) {
			String s = commands.pop();
			Double m = Double.parseDouble(s.substring(0, 4));
			String d = s.substring(5, 6);
			if (d.equals("N")){
				yPos += m;
			}
			if (d.equals("S")){
				yPos -= m;
			}
			if (d.equals("E")){
				xPos += m;
			}
			if (d.equals("W")){
				xPos -= m;
			}
		}
		if (xPos > 0 && yPos > 0){
			System.out.println("Waffle");
		}
		if (xPos < 0 && yPos > 0){
			System.out.println("Taco");
		}
		if (xPos < 0 && yPos < 0){
			System.out.println("Cupcake");
		}
		if (xPos > 0 && yPos < 0){
			System.out.println("Poop");
		}
	}
}
