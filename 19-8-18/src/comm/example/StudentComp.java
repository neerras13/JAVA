package comm.example;

public class StudentComp implements Comparable<Object> {

	private int Id;
	private String name;
	private double gpa;
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public StudentComp() {
		super();
	}
	public StudentComp(int id, String name, double gpa) {
		super();
		Id = id;
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "StudentComp [Id=" + Id + ", name=" + name + ", gpa=" + gpa + "]";
	}
	
	public int compareTo(Object o) {
		
		StudentComp s=(StudentComp)o;
		if(this.getGpa() == s.getGpa())
			return 0;
		else if(this.getGpa() > s.getGpa())
			return -1;
		else
			return 1;
	}
}
