package basics;

 class Person {
     int id=1;
     String name="Ram";
     
     public void displayPerson() {
    	 	 System.out.println("In person class display method");
     }
}

 

public class Employee extends Person{
	String dept;
	String subjects;
	
	public static void main(String args[]) {
		//SuperClass
		Person p = new Person();
		System.out.println(p.id);
		System.out.println(p.name);
		p.displayPerson();
		
		//Subclass
		Employee e = new Employee();
		System.out.println(e.id);//1
		System.out.println(e.name);// Ram
		System.out.println(e.dept);//null
		System.out.println(e.subjects);//null
		
		e.displayPerson();
		
	}
	
	
	
}

class FreeLancer extends Employee{

}