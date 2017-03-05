import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener{
	JFrame Frame;
	JPanel Panel;
	JButton Button;
	String RandomWord = "";
	
	HashMap <String, String> WordList = new HashMap <String, String> ();
	
	public static void main(String[] args) {
		RosettaStone r = new RosettaStone();
	}
	String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}	
	RosettaStone(){
		WordList.put("Apple","Manzana");
		WordList.put("Banana","Platanos");
		WordList.put("Corn","Maize");
		WordList.put("Rice","Arroz");
		WordList.put("Sausage","Salchichas");
		WordList.put("Bacon","Tocino");
		WordList.put("Eggs","Huevos");
		WordList.put("Spagetti","Espaguettis");
		WordList.put("Bread","Pan");
		WordList.put("Lettuce","Lechugas");
		WordList.put("Onion","Cebolla");
		WordList.put("Ice Cream","Helado");
		WordList.put("Hamburger","Hamburgesa");
		WordList.put("Hot Dog","Perrito Calliente");
		WordList.put("Peas","Guisantes");
		
		RandomWord = getRandomKey(WordList);
		
		Frame = new JFrame("Translator");
		Panel = new JPanel();
		Button = new JButton(RandomWord);
		
		Frame.setVisible(true);
		Frame.setSize(200, 200);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Frame.add(Panel);
		Panel.add(Button);
		
		Button.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.Button){
			JOptionPane.showMessageDialog(null, WordList.get(RandomWord));
			RandomWord = getRandomKey(WordList);
			Button.setText(RandomWord);;
		}
	}
}
