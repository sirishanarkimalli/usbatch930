package basics;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		int i=0;
		do{
			i++;
			if(i%5==0) { 
				break;
			}
			System.out.println(i);
		}while(i<=50); 
	}

}
