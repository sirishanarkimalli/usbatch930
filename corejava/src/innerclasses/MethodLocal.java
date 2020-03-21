package innerclasses;

class TL{
		
	public void someMethod() {
		class LocalClass{
			public void paint() {
				System.out.println("In method local class");
			}
		}
		LocalClass obj= new LocalClass();
		obj.paint();
	}
}

public class MethodLocal {

	public static void main(String[] args) {
		TL obj= new TL();
		obj.someMethod();
	}
}
