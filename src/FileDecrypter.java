import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileDecrypter {
	public static void main(String[] args) {
		String fileName = null;
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		{

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				fileName = jfc.getSelectedFile().getAbsolutePath();
			}
		}
		char decrypted = ' ';
		try {
			FileReader fr = new FileReader(fileName);
			int c = fr.read();
			while (c != -1) {
				decrypted = (char) (c - 5);
				System.out.print((char) decrypted);
				c = fr.read();

			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}//copyright 2017 Evan Wright