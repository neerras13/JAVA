package freq.assignment;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LetterSequence ls = new LetterSequence(sc.nextLine());
		ls.computeFrequency();
	}


}
