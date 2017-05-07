import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileDecrypter {
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		{
			
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getAbsolutePath();
				System.out.println(fileName);
			}
		}
		String userInput = JOptionPane.showInputDialog("Add Text:");
		String encrypted = "";
		for (int i = 0; i < userInput.length(); i++) {
			encrypted += userInput.charAt(i) + 5 * 3;
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter("inputtofile.txt");
			fw.write(encrypted);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}