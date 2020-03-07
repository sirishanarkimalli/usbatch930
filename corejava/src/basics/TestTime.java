package basics;

class Time{
	
	int hours, mins,secs;
	
	public Time(int hours, int mins, int secs) {
		this.hours=hours;
		this.mins=mins;
		this.secs=secs;
	}
	//Overriden method of object class
	public String toString() {
		return hours +":"+mins+":"+secs;
	}
	
	
//	public boolean equals() {
//		return false;
//	}
}

public class TestTime {

	public static void main(String[] args) {
		Time t1= new Time(10,20,30);
		Time t2= new Time(10,20,30);
		
		System.out.println(t1.toString());//explicit call to toString()
		System.out.println(t2); //implicit call to toString()
		
		System.out.println(t1.hashCode());
		System.out.println(t1.equals(t2));
		
		
		
		
		
	}

}
