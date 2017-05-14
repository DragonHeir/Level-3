import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DataBase implements ActionListener{
	JFrame Hub;
	JPanel HubPanel;
	JButton Add;
	JButton SearchID;
	JButton SearchName;
	JButton ViewList;
	HashMap <Integer, String> dataBase = new HashMap <Integer, String> ();
public static void main(String[] args) {
	DataBase d = new DataBase();
}
DataBase(){
	Hub = new JFrame("Database");
	HubPanel = new JPanel();
	Add = new JButton("Add");
	SearchID = new JButton("Search ID");
	SearchName = new JButton("Search Name");
	ViewList = new JButton("View List");
	
	Hub.add(HubPanel);
	HubPanel.add(Add);
	HubPanel.add(SearchID);
	HubPanel.add(SearchName);
	HubPanel.add(ViewList);
	
	Hub.setVisible(true);
	Hub.setSize(150, 200);
	Hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Add.addActionListener(this);
	SearchID.addActionListener(this);
	SearchName.addActionListener(this);
	ViewList.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==Add){
		String nameInput = JOptionPane.showInputDialog("Name:");
		String idInput = JOptionPane.showInputDialog("ID:");
		int whatever = Integer.parseInt(idInput);
		dataBase.put(whatever, nameInput);
	}
	if (e.getSource()==SearchID){
		String nameInput = JOptionPane.showInputDialog("Search Name:");
		for (Integer i : dataBase.keySet()) {
			if(dataBase.get(i).equals(nameInput)){
				JOptionPane.showMessageDialog(null, nameInput + "'s ID is " + i);
			}
		}
	}
	if (e.getSource()==SearchName){
		String idInput = JOptionPane.showInputDialog("Search ID");
		int whatever = Integer.parseInt(idInput);
		for (Integer i : dataBase.keySet()){
			if(dataBase.get(i) != null)equals(idInput);{
				
			}
		}
	}
}
}
//copyright 2017 Evan Wright