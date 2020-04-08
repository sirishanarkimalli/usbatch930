package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadLineNumbers {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("D:\\Test2.txt");
		BufferedReader br = new BufferedReader(fr);
		LineNumberReader lnr = new LineNumberReader(br);

		String line = lnr.readLine();
		while (line != null) {
			 if(line.length()!=0)
				System.out.println(lnr.getLineNumber() + " " + line);
			 line=lnr.readLine();
		}
		lnr.close();
		br.close();
		fr.close();
	}

}
