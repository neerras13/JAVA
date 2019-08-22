package fileIOStream;

import java.io.*;

public class FileIOStream {
 public static void main(String args[]) throws IOException
 {
	 File inf = new File("infile.txt");
	 File outf = new File("outfile.txt");
	 FileInputStream in = new FileInputStream(inf);
	 FileOutputStream out = new FileOutputStream(outf);
	 
	 int c;
	 while((c=in.read()) != -1)
	 {
		 out.write(c);
	 }
	 in.close();
	 out.close();
 }
}
