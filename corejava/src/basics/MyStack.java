package basics;


interface Stack{
	public void push(int val);
	public int pop();
}

interface display{
	
}


public class MyStack implements Stack,display{
	int arr[]=new int[5];
	int top=0;
	public void push(int val) {
		arr[top++]=val;
			
	}
	public int pop() {
		int val=arr[--top];
		
		return val;
	}
	
	public void display() {
		for(int val:arr)
			System.out.print(val+" ");
	}

	public static void main(String[] args) {
			MyStack m= new MyStack();
			m.push(10);
			m.push(20);
			System.out.println(m.pop());
	}

}
