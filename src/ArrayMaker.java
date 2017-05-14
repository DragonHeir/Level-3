import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ArrayMaker implements ActionListener {
	JFrame Hub;
	JPanel HubInterface;
	JButton Add;
	JButton View;
	
	Stack <String> CreatedList = new Stack <String>();
	String input;
	String display = "";
	
	
public static void main(String[] args) {
	ArrayMaker m = new ArrayMaker();
}

ArrayMaker(){
	Hub = new JFrame("Array Maker");
	HubInterface = new JPanel();
	Add = new JButton("Add");
	Add.addActionListener(this);
	View = new JButton("View");
	View.addActionListener(this);
	
	Hub.add(HubInterface);
	HubInterface.add(Add);
	HubInterface.add(View);
	
	Hub.setVisible(true);
	Hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Hub.setSize(200, 60);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == Add){
		input = JOptionPane.showInputDialog("Enter a Name");
		CreatedList.push(input);
	}
	if (e.getSource() == View){
		for (int i = 0; i < CreatedList.size();) {
			display += CreatedList.pop() + "\n";
		}
		JOptionPane.showMessageDialog(null, display);
		display = "";
	}
}
}
//copyright 2017 Evan Wright