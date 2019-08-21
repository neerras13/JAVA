package EmployeeDB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import net.proteanit.sql.DbUtils;
import service.EmployeeServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class EmployeeForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2184624517469833203L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private RS2XMLCConfig config;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public EmployeeForm() throws SQLException {
		config = new RS2XMLCConfig();
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(27, 30, 69, 14);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(137, 27, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(27, 68, 69, 14);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 65, 146, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(27, 103, 69, 14);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 100, 146, 20);
		contentPane.add(textField_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(27, 138, 69, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 135, 146, 20);
		contentPane.add(textField_3);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				emp.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText(),textField_2.getText(),textField_3.getText()));
				JOptionPane.showMessageDialog(new JFrame(),"Employee added successfully!");
			}
			
		});
		btnAddEmployee.setBounds(64, 201, 110, 23);
		contentPane.add(btnAddEmployee);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnReset.setBounds(255, 201, 103, 23);
		contentPane.add(btnReset);
		
		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Enter ID of the employee");
				try {
					emp.deleteEmployee(Integer.parseInt(textField.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		button_2.setBounds(64, 235, 110, 23);
		contentPane.add(button_2);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp.updateEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText(),textField_2.getText(),textField_3.getText()));
			}
		});
		btnUpdate.setBounds(255, 235, 110, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDisplayData = new JButton("Display Data");
		btnDisplayData.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
				try {
					ResultSet rs= config.getAllEmployee();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				try {
//					new MyFrame2();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		});
		btnDisplayData.setBounds(156, 283, 113, 23);
		contentPane.add(btnDisplayData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 341, 321, 200);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
//		Object[][] data = (Object[][]) emp.getAllEmployees().toArray();
//		String[] columnNames = {"ID","First Name","Last Name","Email"};
//		JTable jt = new JTable(data, columnNames);
//		jt.setBounds(98, 298, 300 , 200);
	}
}
