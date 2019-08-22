package encrypt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleEncryption {

	void encrypt(String source, String dest, int shiftSize) {
		BufferedReader reader;
		BufferedWriter writer;
		
		try {
			reader = new BufferedReader(new FileReader(source));
			writer = new BufferedWriter(new FileWriter(dest));
			int data;
			String line;
			while((line=reader.readLine()) != null)
			{
				for(int i=0;i<line.length();i++)
				{
					data = (int) line.charAt(i) + shiftSize;
					writer.write(data);
				}
				writer.write((int)'\n');
				line=reader.readLine();
			}
			reader.close();
			writer.close();
		}
		catch(IOException io) {
			System.out.println("Failed encrypting the file content..");
		}
		
	}
	
	public void viewFileContent(String filename) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filename));
			String line=br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}
		catch(IOException io) {
			System.out.println("cannot read from file");
		}
	}
}
