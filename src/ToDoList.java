import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
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
	
	frame.setVisible(true);
	frame.setSize(275, 100);
	
	frame.add(panel);
	panel.add(add);
	panel.add(remove);
	panel.add(save);
	panel.add(load);
	
	add.addActionListener(this);
	remove.addActionListener(this);
	save.addActionListener(this);
	load.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==add){
		String addInput = JOptionPane.showInputDialog("Add To Do Item:");
		currentList.add(addInput);
		System.out.println(currentList);
	}
	if(e.getSource()==remove){
		String removeInput = JOptionPane.showInputDialog("Enter Number of Task to Remove:");
		int x = Integer.parseInt(removeInput);
		currentList.remove(x);
		System.out.println(currentList);
	}
	if(e.getSource()==save){
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/league/Desktop/Level-3/src/junk/ToDo.rtf", true);
			for (int i = 0; i < currentList.size(); i++) {
				fw.write(currentList.get(i));
			}
			fw.close();
		} catch (IOException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
	}
	if(e.getSource()==load){
	
	}
	
}
}
