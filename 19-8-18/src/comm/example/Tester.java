package comm.example;

import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
//		MapDemo map = new MapDemo();
//		map.createMap();
//		System.out.println(map.getKeys());        //can be set to variable of type Set
//		System.out.println(map.getValues());      //return type is collection
		//VectorDemo v = new VectorDemo();
		
		Set<StudentComp> set=new TreeSet<StudentComp>();
		set.add(new StudentComp(1,"A",4.3));
		set.add(new StudentComp(2,"B",2.9));
		set.add(new StudentComp(3,"C",4));
		set.add(new StudentComp(4,"D",3.9));
		//syso(set) yields the sorted list of students based on gpa
		//Make result pretty
		Object[] obj=set.toArray();   //make into object array
		StudentComp s=null;        
		for(Object o:obj)
		{
			s=(StudentComp)o;		  //set it as obj for StudentComp and display
			System.out.printf("\nname: %s %s GPA: %.1f", s.getId(),s.getName(),s.getGpa());
		}
	}
	
	
}
