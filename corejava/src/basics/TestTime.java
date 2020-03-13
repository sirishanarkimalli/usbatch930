package basics;

class Time {

	int hours, mins, secs;

	public Time(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
	}

	// Overridden method of object class
	@Override
	public String toString() {
		return hours + ":" + mins + ":" + secs;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Time) {
			//Downcasting
			Time t = (Time) obj;
			if ((this.hours == t.hours) & (this.mins == t.mins) & (this.secs == t.secs))
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return hours;
		
	}
}

public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(10, 20, 30);
		Time t2 = new Time(10, 20, 30);
		Time t3=t1;
		System.out.println(t1.equals(t2));

		System.out.println(t1.toString());//explicit call to toString()
		System.out.println(t2); //implicit call to toString()

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

	}

}
