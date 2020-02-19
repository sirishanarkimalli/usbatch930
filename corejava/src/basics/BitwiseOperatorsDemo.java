package basics;

public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
		byte a=4, b=2;   // 2pow4 2pow2  2 pow 1 2 pow 0 
						//  a    0    1		0		0
						//	1    0    0    0      0
						//	|	0	 0		0		0
		System.out.println("Bitwise And of "+a+" "+b+"="+ (a&b));//0
		
		System.out.println("Bitwise OR of "+a+" "+b+"="+(a|b));//6
		System.out.println("Bitwise XOR of "+a+" "+b+"="+(a^b));//0
		System.out.println("left shift of "+a+" "+b+"="+(a<<b));//16
		System.out.println("right shift of "+a+" "+b+"="+(a>>b));
	}

}
