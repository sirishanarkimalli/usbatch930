package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathsClassDemo {

	public static void main(String[] args) throws IOException {

		//Factory method get
		Path src = Paths.get("D:\\Test2.txt");
		BufferedReader br = Files.newBufferedReader(src);

		Path trg = Paths.get("D:\\Test4.txt");
		BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);

		String line = "";
		while ((line = br.readLine()) != null) {
			if (line.length() > 0)
				bw.write(line + "\n");
		}
		br.close();
		bw.close();

	}

}
