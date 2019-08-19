package comm.example;

public class ArrayDemo {
	

	//private int arr[];        //primitive type
	private char str[];
	//private Integer array=10;  //Integer class
    //arr=array.intValue();
    
	public ArrayDemo(){
		
	}
	public char[] createArray(int length) {
		//arr= new int[length];
		str = new char[length];
		
		for(int i=0;i<length;i++) {
			str[i]=(char)('A'+i);        //adding sequence of alphabets to str array of char
		}
		return str;
	}
}
