import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileEncrypter {
	public static void main(String[] args) {
		String fileName = null;
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		{

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				fileName = jfc.getSelectedFile().getAbsolutePath();
				System.out.println(fileName);
			}
		}
		String userInput = JOptionPane.showInputDialog("Add Text:");
		String encrypted = "";
		for (int i = 0; i < userInput.length(); i++) {
			encrypted += (char) (userInput.charAt(i) + 5);
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(encrypted);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}//copyright 2017 Evan Wright