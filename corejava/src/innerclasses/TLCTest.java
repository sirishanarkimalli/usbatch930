package innerclasses;
class TLC {
	static public class SMC {
		public void paint() {
			System.out.println("In SMC");
		}
	}

	public void print() {
		System.out.println("In TLC");
	}
}

public class TLCTest {
	public static void main(String[] args) {
		TLC.SMC obj = new TLC.SMC();
		obj.paint();
		
		TLC outerObj=new TLC();
		outerObj.print();
	}

}
