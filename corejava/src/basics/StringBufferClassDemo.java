package basics;

public class StringBufferClassDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb = new StringBuffer("Hello Java! programming is easier to learn");
		System.out.println("Length= " + sb.length());
		System.out.println("Capacity= " + sb.capacity());
		System.out.println("Capacity= " + sb1.capacity());
		System.out.println(sb.append(" World"));
		System.out.println(sb);
		sb.deleteCharAt(10);
		sb.append("!");
		System.out.println(sb.reverse());
	}
}
