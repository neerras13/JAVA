package emp.assignment;

import java.util.Date;

public class EmployeeBO extends AgeComparator {
	public EmployeeBO() {
	}
	public EmployeeBO(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super(id, name, department, dateOfJoining, age, salary);
		// TODO Auto-generated constructor stub
	}

	public static void printEmployees(Object[] e) {
		System.out.printf("%s %-15s %-30s %-30s %-10s %-10s\n","ID","NAME","DEPT","DOJ","AGE","SALARY");
		Employee ac=null;        
		for(Object o:e)
		{
			ac=(Employee)o;		  //set it as obj for StudentComp and display
			System.out.printf("%d %-15s %-30s %-30s %-10s %-10s\n", ac.getId(),ac.getName(),ac.getDepartment(), ac.getDateOfJoining(),ac.getAge(),ac.getSalary());
		}
		
	}

}
