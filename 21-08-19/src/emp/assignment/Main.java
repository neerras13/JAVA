package emp.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int emps,choice,i=1;;
		Scanner sc = new Scanner(System.in);
		Date d;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Set<Employee> set=new TreeSet<Employee>();
		ArrayList<Employee> list=new ArrayList<Employee>();
		System.out.println("Input the number of employees: ");
        emps=sc.nextInt();
        
		while(emps!=0)
		{
			System.out.println("Enter the details for employee"+i);
			String name=sc.next();
			String dept=sc.next();
			d=sdf.parse(sc.next());
			int age=sc.nextInt();
			int salary=sc.nextInt();
			set.add(new Employee(name,dept,d,age,salary));
			list.add(new Employee(name,dept,d,age,salary));
			//Collections.sort(list, new AgeComparator(name,dept,d,age,salary));
			i++;
			emps--;
		}
		
		System.out.println("1.Sort employees by salary\r\n" + 
				"2.Sort employees by age and by date of joining\r\n" + 
				"Enter your choice\r\n" + 
				"");
		choice=sc.nextInt();
		if(choice==1) {	
			Object[] obj=set.toArray();   
			EmployeeBO.printEmployees(obj);
		}
		else if(choice == 2) {
			Collections.sort(list, new AgeComparator());
			Object[] obj=list.toArray();   
			EmployeeBO.printEmployees(obj);
		}
		else
		{
			System.out.println("Invalid option");
		}
			

	}

}
