import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ArrayMaker implements ActionListener {
	JFrame Hub;
	JPanel HubInterface;
	JButton Add;
	JButton View;
	
	ArrayList <String> CreatedList = new ArrayList <String>();
	String input;
	
	
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
		CreatedList.add(input);
	}
}
}
