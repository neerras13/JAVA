package comm.example;

import java.util.Scanner;

public class Person extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6176562959355119543L;
	private static int i=0;
    private String fName;
    private String lName;
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public Person(){
		super();
	}
	
	public void addPerson(String fname, String lname) throws NameNotValid {
		if(!(Character.isUpperCase(fname.charAt(0)) && Character.isUpperCase(lname.charAt(0)))){
			throw new NameNotValid("Name not valid");
		}
		System.out.println("Valid Name");	
	}
	
//	public void addPersons() throws SameNameException {
//		do{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("First name");
//			fName = sc.next();
//			System.out.println("Last name:");
//			lName = sc.next();
//			if(i>0)
//			{
//				if(fname[i-1]!=fName && lname[i-1]!=lName)
//				{
//					fname[i] = fName;
//					lname[i] = lName;
//					System.out.println("name added");
//				}
//				else
//					throw new SameNameException("Name already exists. enter another name");
//			}
//			else
//			{
//				fname[i] = fName;
//				lname[i] = lName;
//				System.out.println("name added");
//			}
//			i++;
//		}while(i<6);
//	}
}
