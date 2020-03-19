package basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {

	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d);
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-YY hh:mm:ss");
		System.out.println(sdf.format(d));
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println(df.format(d));
		
	}

}
