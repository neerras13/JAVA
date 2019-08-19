package comm.example;

public class StackArray {
	int arr[]=new int[10];
	int index=0;
	
//private Stack stack; variable for stack methods - pop--push--peek
	
	public void push(int a) {
		System.out.println("");
		if(index <= 9)
		{
		arr[index] = a;
			index++;
		for(int a1:arr)
		{
			System.out.print(a1+" ");
		}
		}
		else
			System.out.println("Stack overflow!");
	}
	
	public int pop() {
		if(index == 0) {
			System.out.println("Stack underflow!");
			return 0;
		}
		else
			return arr[--index];

	}

}
