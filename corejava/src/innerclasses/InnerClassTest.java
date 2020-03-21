package innerclasses;

class Outer{
	int a=20;
	
	class Inner{
		int b=30;
		
		public void paint() {
			System.out.println("a= "+a+" b="+b);
		}
	}
	
	public void display() {
		Inner in=new Inner();
		in.paint();
	}
}


public class InnerClassTest {

	public static void main(String[] args) {
		Outer obj= new Outer();
		obj.display();
	}

}
