package fileIOStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String args[]) throws IOException {
		File inf = new File("infile.txt");
		File outf = new File("outfile.txt");
		FileReader in = new FileReader(inf);
		FileWriter out = new FileWriter(outf);

		int c;
		char[] ca = new char[200];
		int i = 0;
		while ((c = in.read()) != -1) {
			char a = (char) c;
			System.out.println(a);
			ca[i] = a;
			out.write(c);
			i++;
		}
		System.out.println(ca);
		in.close();
		out.close();
	}
}
