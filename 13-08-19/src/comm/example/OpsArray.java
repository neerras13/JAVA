package comm.example;
import java.util.Arrays;

public class OpsArray {
	
	int arr[] = {100,1,-20,30,0};

	public void findNum(int element) 
	{
		int k = Arrays.binarySearch(arr,element);
//		for(int i =0;i<arr.length;i++)
//		{
//			if(arr[i] == element)
//			{
//				return true;
//			}
//		}
		System.out.println("index"+k);
		//return false;
		
	}
	
	public void sortArray() 
	{	
		Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)  

        System.out.println(arr[i]);

	  
	}
	
	
}
	

