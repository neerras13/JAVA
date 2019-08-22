package employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import employee.service.ServiceImpl;

public class Employee {
	
	public static void main(String[] args) throws IOException, SQLException {
		
	ServiceImpl emp =new ServiceImpl();
	BufferedReader reader = new BufferedReader(new FileReader("details.txt"));
	String line;
	int i=1;
	while((line = reader.readLine()) != null) {
		String[] arr=line.split(" ");
		int a=Integer.parseInt(arr[1]);
		emp.createEmployee(new EModel(i,arr[0],a,arr[2]));
		i++;
		
	}
	}
}