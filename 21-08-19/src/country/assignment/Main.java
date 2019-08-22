package country.assignment;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,i=0;
		System.out.println("Enter the input count\n");
		Scanner sc = new Scanner(System.in);
		Country[] c = new Country[5];
//		List<Country> list=new ArrayList<Country>();
		count = sc.nextInt();
		
		System.out.println("Enter input\n");
		while(count>0) 
		{
			String str=sc.next();
			new Country(str);
	    	int len=str.length();
	    	while(len>0 && i<count) {
	    		if(str.charAt(i)=='|')
	    		{
	    			c[i]=new Country();
	    			c[i].setCname(str.substring(0,str.length()-i));
	    		    c[i].addState(str.substring(i));
	    			}
	    		i++;
	    		len--;
	    	}
	    	count--;
		}
		System.out.println(c[0].stateList.get(0));
//		for(int i1 =0;i1<count;i1++) {
//			System.out.printf("%s",c[i1].getCname());
//			System.out.println(c[i1].stateList);
//
//		}

	}

}
