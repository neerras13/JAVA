package swingToServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	Socket client = null;
    int portnumber = 1234;
    int i=10;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JButton btnViewRow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientSwing frame = new ClientSwing();
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
	 * @throws UnknownHostException 
	 */
	public ClientSwing() throws UnknownHostException, IOException {
		
	
        
        // Create a client socket
        
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(218, 43, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter employee details");
		lblNewLabel.setBounds(51, 43, 143, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnSendRequest = new JButton("Send request");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					client = new Socket(InetAddress.getLocalHost(), portnumber);
			        OutputStream clientOut = client.getOutputStream();
			        PrintWriter pw = new PrintWriter(clientOut, true);
			        
			        InputStream clientIn = client.getInputStream();
			        BufferedReader br = new BufferedReader(new
			                InputStreamReader(clientIn));
				String msg = "";
				msg = textField.getText();
                pw.println(msg);
                String[] arr = br.readLine().split(" ");
                textField_1.setText(arr[0]);
                textField_2.setText(arr[1]);
                textField_3.setText(arr[2]);
                textField_4.setText(arr[3]);
        
                pw.close();
                br.close();
                client.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSendRequest.setBounds(70, 101, 124, 23);
		contentPane.add(btnSendRequest);
		
		textField_1 = new JTextField();
		textField_1.setBounds(36, 180, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblServerResponse = new JLabel("Server response");
		lblServerResponse.setBounds(157, 135, 86, 20);
		contentPane.add(lblServerResponse);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 180, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(237, 180, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(338, 180, 86, 20);
		contentPane.add(textField_4);
		
		btnViewRow = new JButton("View row");
		btnViewRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				try {
//				client = new Socket(InetAddress.getLocalHost(), portnumber);
//		        OutputStream clientOut = client.getOutputStream();
//		        PrintWriter pw = new PrintWriter(clientOut, true);
//		        
//		        InputStream clientIn = client.getInputStream();
//		        BufferedReader br = new BufferedReader(new
//		                InputStreamReader(clientIn));
//				String msg = "";
//				msg = textField.getText();
//	            pw.print(Integer.parseInt(msg));
//			    
//	            String[] arr = br.readLine().split(" ");
//                textField_1.setText(arr[0]);
//                textField_2.setText(arr[1]);
//                textField_3.setText(arr[2]);
//                textField_4.setText(arr[3]);
//			}
//			catch(Exception e) {
//				System.out.println("error!");
//			}
			}
		});
		btnViewRow.setBounds(218, 101, 89, 23);
		contentPane.add(btnViewRow);
	}

}
