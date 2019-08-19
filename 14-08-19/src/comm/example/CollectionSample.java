package comm.example;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionSample {
	static Scanner sc = new Scanner(System.in);

	private String str[];
	private Set set;

	public CollectionSample() {
		System.out.println("Number of elements in array..");
		str = new String[sc.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Name: ");
			str[i] = sc.next().toString();
		}
		set = new HashSet();       //<String> after HashSet   ---- <Generics>
		for (String s : str) {
			if (!set.add(s)) 
			{
				System.out.println("Duplicate! Not added"+s);
			}
		}
	}

	public void displayCollection() {
     Iterator i = set.iterator();          //iterator<String>
     while(i.hasNext())
     {
    	 System.out.println(i.next().toString());
     }
	}

}
