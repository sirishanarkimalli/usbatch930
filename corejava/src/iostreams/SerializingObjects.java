package iostreams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import basics.SavingsAccount1;

public class SerializingObjects {

	public static void main(String[] args) throws IOException{
		SavingsAccount1 sa1= new SavingsAccount1(1, "George","george@gmail.com");
		SavingsAccount1 sa2= new SavingsAccount1(2, "Alen","alen@gmail.com");
		SavingsAccount1 sa3= new SavingsAccount1(3, "Smith","smith@gmail.com");
				
		ObjectOutputStream out= new ObjectOutputStream(System.out);
		
		out.writeObject(sa1);
		out.writeObject(sa2);
		out.writeObject(sa3);
	
		out.close();
		
		
	}

}
