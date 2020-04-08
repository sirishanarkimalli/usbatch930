package iostreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileClassDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (RandomAccessFile raf = new RandomAccessFile("D:\\Test2.txt", "r");
				RandomAccessFile raf1 = new RandomAccessFile("D:\\TestNew.txt", "rw");
			)  {
			String line = raf.readLine();
			int count = 0;
			while (line != null) {
				if (line.length() == 0) 
					count++;
				else
					raf1.writeBytes(line + "\n");
				
				line = raf.readLine();
			}
			raf.seek(0);
			System.out.println("Num of blank lines= " + count);
			System.out.println(raf.length());
			System.out.println(raf1.length());
		}
		;// end of the try block
	}

}
