import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Copyrighter {
	public static void main(String[] args) {
		String fileName = null;
		String copyright = "copyright 2017 Evan Wright";
		File[] files = new File("/Users/league/Desktop/Level-3/src").listFiles();
		String encrypted = "";
		for (int i = 0; i < files.length; i++) {
			FileWriter fw = null;
			try {
				fw = new FileWriter("/Users/league/Desktop/Level-3/src/" + files[i].getName(), true);
				fw.write(copyright);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
// copyright 2017 Evan Wright