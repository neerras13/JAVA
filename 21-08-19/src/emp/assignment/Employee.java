package emp.assignment;

import java.util.Date;

public class Employee implements Comparable<Object>{
	protected int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id ;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(int id,String name, String department,Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " " + id + " " + name + " " + department + " "
				+ dateOfJoining + " " + age + " " + salary+"\n";
	}

	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)ob;
		if(this.getSalary() == emp.getSalary())
			return 0;
		else if(this.getSalary() > emp.getSalary())
			return 1;
		else
			return -1;
	}
	


}
