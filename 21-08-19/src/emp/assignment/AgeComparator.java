package emp.assignment;

import java.util.Comparator;
import java.util.Date;

public class AgeComparator extends Employee implements Comparator<Object> {
	
	public AgeComparator() {
		
	}
	public AgeComparator(String name, String department, Date dateOfJoining, int age, int salary) {
		super(name, department, dateOfJoining, age, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		Employee ac=(Employee)ob1;
		Employee ac1=(Employee)ob2;
		if(ac.getAge() == ac1.getAge()) {
			if((ac.getDateOfJoining().compareTo(ac1.getDateOfJoining()))==0)
				return 0;
			else if((ac.getDateOfJoining().compareTo(ac1.getDateOfJoining()))>0)
				return -1;
			else
				return 1;
			}
		else if(ac.getSalary() > ac1.getSalary())
			return -1;
		else
			return 1;
	}
	

}
