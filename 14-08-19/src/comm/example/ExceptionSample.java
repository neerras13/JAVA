package comm.example;

public class ExceptionSample {
	
	public static void main(String[] args)
	{
		int sum=0;
		for(String a:args) {
			try {
			sum+=Integer.parseInt(a);
			System.out.println(args[100]);                                   //shifts program control to catch block.... ignores statements below it
		    }
			catch(NumberFormatException e) {
				e.printStackTrace();                                         //shows call stack mechanism
				System.err.println(e.getMessage());                          //shows which argument shows error 
				System.err.println("Not integer"+e.getCause().toString());   //Custom error message
				System.err.println(e.toString());                            //original error message from NFE exception class
				//System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.err.println("array index out of bounds exception");
			}
			finally {
				System.out.println("FINALLY");
			}
		}
		System.out.println(sum);
		//System.out.println("Execution ongoing");     //exit(0) stops execution and doesn't print this line
	}

}
