package swingToFile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import swingToFile.FileOp;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SaveReadText extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4372325188805954735L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaveReadText frame = new SaveReadText();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public SaveReadText() throws IOException {
		FileOp fo= new FileOp();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 24, 349, 171);
		contentPane.add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try {
					fo.writeToFile(textArea.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
		});
		btnSave.setBounds(81, 216, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		try {
			textArea.setText(fo.readFromFile());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				}
		});
		btnRead.setBounds(259, 216, 89, 23);
		contentPane.add(btnRead);
	}
}
