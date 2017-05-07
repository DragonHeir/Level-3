import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIntro {
public static void main(String[] args) {
	FileWriter fw = null;
	try {
		fw = new FileWriter("file.txt");
		fw.write("We are having chicken and mashed potatoes with gravy for dinner tonight!");
		fw.close();
		FileReader fr = new FileReader("file.txt");
		int c = fr.read();
		while (c != -1){
			System.out.print((char)c);
			c = fr.read();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
