package emp.assignment;

import java.util.Date;

public class EmployeeBO extends AgeComparator {
	public EmployeeBO() {
	}
	public EmployeeBO(String name, String department, Date dateOfJoining, int age, int salary) {
		super(name, department, dateOfJoining, age, salary);
		// TODO Auto-generated constructor stub
	}

	public static void printEmployees(Object[] e) {
		System.out.println("ID NAME DEPT DOJ AGE SALARY");
		Employee ac=null;        
		for(Object o:e)
		{
			ac=(Employee)o;		  //set it as obj for StudentComp and display
			System.out.printf("\n%d %s %s %s %d %d", ac.getId(),ac.getName(),ac.getDepartment(), ac.getDateOfJoining(),ac.getAge(),ac.getSalary());
		}
		
	}

}
