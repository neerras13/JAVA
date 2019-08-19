package comm.example;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	private Vector<String> vector;
	
	public VectorDemo()
	{
		vector = new Vector<String>();
		vector.add("test");
		vector.add("test1");
		vector.add("test2");
		Enumeration<String> e = vector.elements();   //returns items in the vector as enumeration
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}
	
}
