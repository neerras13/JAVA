package objectIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputstream {

	public static void main(String args[]) {
		Employee emp = new Employee("10","sachin",2000,"mumbai");
		System.out.println("Employee to write is:"+emp);
		
		try {
			FileOutputStream out = new FileOutputStream("employee.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(emp);
			oos.flush();
			oos.close();
		}catch(Exception e) {
			System.out.println("Problem in serialization: "+e);
		}
		
		try {
			FileInputStream in = new FileInputStream("employee.out");
			ObjectInputStream ois = new ObjectInputStream(in);
			emp=(Employee)(ois.readObject());
			ois.close();
		}catch(Exception e) {
			System.out.println("Problem in serialization:  "+e);
		}
		System.out.println("Employee read is: "+emp);
	}
}
