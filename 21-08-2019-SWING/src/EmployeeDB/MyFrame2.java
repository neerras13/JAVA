package EmployeeDB;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import service.EmployeeServiceImpl;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MyFrame2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7644537011821139730L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	private RS2XMLCConfig config=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
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
	public MyFrame2() throws SQLException {
		EmployeeServiceImpl emp=new EmployeeServiceImpl();
		config = new RS2XMLCConfig();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
		
		JButton btnLoadData = new JButton("Load data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs= config.getAllEmployee();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnLoadData, BorderLayout.SOUTH);
		this.setVisible(true);
	}

}
