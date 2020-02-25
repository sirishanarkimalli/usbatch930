package basics;

class Student {
	
	 private int rollnum;
	 private String name;
	 private long phoneNumber;
	
	
	 public void setData(int num,String nam, long phNum) {
		 	rollnum=num;
		 	name=nam;
		 	phoneNumber= phNum;
	 }
	 
	public void displayDetails() {
		System.out.println("Rollnum="+rollnum);
		System.out.println("Name="+name);
		System.out.println("PhoneNumber="+phoneNumber);
		System.out.println("_________________");
	}

}


public class TestStudent{
	public static void main(String args[]) {
		Student obj1= new Student();
		Student obj2= new Student();
		
		obj1.setData(01,"Rahul",9999999);
		
		obj2.setData(02, "sathish",888888);
		
		obj1.displayDetails();
		obj2.displayDetails();
		
	}
}






