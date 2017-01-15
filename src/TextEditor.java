import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextEditor implements KeyListener {
	JFrame steframe;
	JPanel stepanel;
	JLabel text;
	String typed = "";
	Stack<Character> typedletters = new Stack<Character>();

	public static void main(String[] args) {
		TextEditor t = new TextEditor();
	}

	TextEditor() {
		steframe = new JFrame("Simple Text Editor");
		steframe.setVisible(true);
		steframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		steframe.addKeyListener(this);
		stepanel = new JPanel();
		text = new JLabel();

		steframe.add(stepanel);
		stepanel.add(text);
		steframe.setSize(200, 200);
	}

	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		typed += c;
		text.setText(typed);

	}

	int ctr = 0;

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (typed.length() > 0) {
				char c = typed.charAt(typed.length() - 1);
				typedletters.push(c);
				typed = typed.substring(0, typed.length() - 1);

				text.setText(typed);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("hhhh");
			typed += typedletters.pop();
			text.setText(typed);
		}

	}

	public void keyReleased(KeyEvent e) {

	}
}
