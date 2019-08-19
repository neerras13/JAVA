package comm.example;

public class Tester1 {
	public static void main(String[] args)
	{
	  /*
	  OpsArray op=new OpsArray();
	  System.out.println(op.findNum(-2));
	  System.out.println(op.sortArray());
	  op.sortArray();
      op.findNum(9999);
	    int arr[][] = new int[2][];
      System.out.println(arr.length -1);
      arr[0] = 2;
      System.out.println(arr.length -1);
      StackArray sa = new StackArray();
      sa.pop();
      sa.push(4);
      sa.push(5);
      sa.push(6);
      sa.push(7);
      System.out.println("\nLast element"+sa.pop());
      */
		
	  OuterClass oc = new OuterClass();
	  OuterClass.InnerClass ic = oc.new InnerClass();
	  oc.print();
	  ic.print();
      
}
}
