package iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args)throws IOException {
//		File f= new File("D:\\Test1.txt");
		FileReader fr= new FileReader("D:\\Test1.txt");
		BufferedReader br= new BufferedReader(fr);
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
//		int ch=0;
//		while( (ch=fr.read())!=-1) {
//			System.out.print((char)ch);
//		}
		fr.close();
		}
}
