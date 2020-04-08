package iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteToCharacterStreams {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=  new BufferedReader(isr);
		String line = null;
		while( (line =br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		isr.close();
	}

}
