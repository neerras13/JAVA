package fileIOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileReaderWriter {

	public static void main(String[] args) throws IOException {
		
		 File inf = new File("infile.txt");
		 File outf = new File("outfile.txt");
		 FileReader in = new FileReader(inf);
		 FileWriter out = new FileWriter(outf);
		 
		 BufferedReader is = new BufferedReader(in);
		 PrintWriter os = new PrintWriter(out);
		 
		 String l;
		 while((l=is.readLine())!=null)
		 {
			 System.out.println(l);
			 os.println(l);
		 }
		 in.close();
		 out.close();
		 is.close();
		 os.close();
		 

	}

}
