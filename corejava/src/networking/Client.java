package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main(String args[]) throws IOException {
		Socket s = new Socket("localhost", 2000);

		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		
	}
}
