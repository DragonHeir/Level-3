import java.util.ArrayList;

public class HexCode {
public static void main(String[] args) {
	ArrayList <Character> Code = new ArrayList <Character>();
	Code.add((char) 0x68);
	Code.add((char) 0x74);
	Code.add((char) 0x74);
	Code.add((char) 0x70);
	Code.add((char) 0x3a);
	Code.add((char) 0x2f);
	Code.add((char) 0x2f);
	Code.add((char) 0x62);
	Code.add((char) 0x69);
	Code.add((char) 0x74);
	Code.add((char) 0x2e);
	Code.add((char) 0x6c);
	Code.add((char) 0x79);
	Code.add((char) 0x2f);
	Code.add((char) 0x31);
	Code.add((char) 0x34);
	Code.add((char) 0x66);
	Code.add((char) 0x6b);
	Code.add((char) 0x55);
	Code.add((char) 0x53);
	Code.add((char) 0x62);
	
	for (int i = 0; i < Code.size(); i++) {
		System.out.print(Code.get(i));
	}
}
}
