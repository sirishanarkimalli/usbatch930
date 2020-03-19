package basics;

import java.util.Calendar;
import java.util.Date;

public class CalendarClassDemo {

	public static void main(String[] args) {
		//factory method getInstance() returns the object of Calender class.
		Calendar c = Calendar.getInstance();
		System.out.println("Calender type="+c.getCalendarType());
		System.out.println("AM="+c.get(Calendar.AM));
		System.out.println("PM="+c.get(Calendar.AM_PM));
		System.out.println("Date="+c.get(Calendar.DATE));
		System.out.println("Day of week in the month="+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Era="+c.get(Calendar.ERA));
		System.out.println("Day of month="+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week="+c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of Year="+c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.YEAR));
		

	}

}
