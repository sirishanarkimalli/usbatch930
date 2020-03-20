package hr;

abstract class Employee {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void companyName() {
		System.out.println("Unnati");
	}
	
	public abstract void print();
}

class SalariedEmployee extends Employee {
	
	int salary;
	
	public SalariedEmployee(int id, String name, int salary) {
		super(id,name);
		this.salary=salary;
	}
	
	@Override
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);		
	}
}

class ConsultantEmployee extends Employee {
	
	int hr;
	int rate;
	
	public ConsultantEmployee(int id, String name, int hr, int rate) {
		super(id,name);
		this.hr=hr;
		this.rate=rate;
	}
	
	@Override
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(hr);
		System.out.println(rate);
	}
}

public class TestEmployee {
	public static void main(String args[]) {
		  Employee e;
		  SalariedEmployee se = new SalariedEmployee(1,"George",50000);
		  ConsultantEmployee ce= new ConsultantEmployee(2, "Aron", 4, 500);
	}
}
