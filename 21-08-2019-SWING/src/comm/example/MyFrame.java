package comm.example;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JLabel label1;
	private JTextField text1;
	private JButton button1;
	
	//constructor
	public MyFrame() throws HeadlessException{
		super();
		label1=new JLabel();
		label1.setText("Label is here");
		text1= new JTextField(25);
		button1 = new JButton();
		button1.setText("hello");
		this.setTitle("Frame Example");
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		this.add(label1);
		this.add(button1);
		this.add(text1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
