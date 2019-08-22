package swingToFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOp{


	public FileOp() throws IOException {
	}
	
	public void writeToFile(String str) throws IOException {
		FileWriter out= new FileWriter(new File("output.txt"));
		
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		    out.write((int)arr[i]);
		}
		out.close();
	}
	
	public String readFromFile() throws IOException {
		FileReader in = new FileReader(new File("output.txt"));
		BufferedReader is = new BufferedReader(in);
		String str="";
		String s;
		while((s=is.readLine())!=null) {
			str=str+s+"\n";
		}
		is.close();
		return str;
	}

}
