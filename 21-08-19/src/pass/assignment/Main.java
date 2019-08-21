package pass.assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		Boolean b = (new UserMainCode()).checkPassword(str);
		if(b == true)
			System.out.println("Output: Valid Password");
		else
			System.out.println("Output: Invalid Password");

	}
}
