package basics;
//Example of Compile Time Polymorphism
public class CalculateArea {
	
	public void area(double side) {
		System.out.println("Area of a Square="+ (side*side));
	}
	
	public void area(double length, double breadth) {
		System.out.println("Area of a rectangle="+ (length*breadth));
	}
	
	public void area(double length, double breadth, double width) {
		System.out.println("Area of a cube="+ (length*breadth*width));
	}

	public static void main(String[] args) {
		CalculateArea ca= new CalculateArea();
		ca.area(2.00,3.00);
		ca.area(6.00);
		ca.area(7.00,5.00,3.00);

	}

}
