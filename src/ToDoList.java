import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton remove;
	JButton save;
	JButton load;
	ArrayList<String> currentList = new ArrayList<String>();
	JLabel list;
	String labelText = "";
	
public static void main(String[] args) {
	ToDoList t = new ToDoList();
}

ToDoList(){
	
	frame = new JFrame("To Do List");
	panel = new JPanel();
	add = new JButton("Add");
	remove = new JButton("Remove");
	save = new JButton("Save");
	load = new JButton("Load");
	list = new JLabel();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(275, 100);
	
	frame.add(panel);
	panel.add(add);
	panel.add(remove);
	panel.add(save);
	panel.add(load);
	panel.add(list);
	
	add.addActionListener(this);
	remove.addActionListener(this);
	save.addActionListener(this);
	load.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==add){
		String addInput = JOptionPane.showInputDialog("Add To Do Item:") + ", ";
		currentList.add(addInput);
			labelText = "";
		for (int i = 0; i < currentList.size(); i++) {
			labelText += currentList.get(i);
			list.setText(labelText);
		}
	}
	if(e.getSource()==remove){
		String removeInput = JOptionPane.showInputDialog("Enter Number of Task to Remove:");
		int x = Integer.parseInt(removeInput);
		currentList.remove(x);
		labelText = "";
		for (int i = 0; i < currentList.size(); i++) {
			labelText += currentList.get(i);
			list.setText(labelText);
		}
	}
	if(e.getSource()==save){
		FileWriter fw = null;
		try {
			String fullText = "";
			fw = new FileWriter("/Users/league/Desktop/Level-3/src/test.txt");
			labelText = "";
			for (int i = 0; i < currentList.size(); i++) {
				fullText += currentList.get(i) + "\n";
				for (int j = 0; j < currentList.size(); j++) {
					labelText += currentList.get(j);
					list.setText(labelText);
				}
			}
			fw.write(fullText);
			fw.close();
		} catch (IOException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
	}
	if(e.getSource()==load){
		try {
			FileReader fr = new FileReader("/Users/league/Desktop/Level-3/src/test.txt");
			int c = fr.read();
			String d = "";
			while(c != -1){
				if (c == (int)'\n'){
					currentList.add(d);
					d = "";
				}
				else{
					d += (char) c;
				}
				labelText = "";
				for (int i = 0; i < currentList.size(); i++) {
					labelText += currentList.get(i);
					list.setText(labelText);
				}
				c = fr.read();
				
			}
			currentList = null;
			fr.close();
			
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
}
