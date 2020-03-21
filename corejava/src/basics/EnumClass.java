package basics;


enum OnlineShopping{
	amazon, flipcart, snapdeal, jabong
}

public class EnumClass {
	public static void main(String[] args) {
//		OnlineShopping store= OnlineShopping.jabong;
		OnlineShopping stores[]=OnlineShopping.values();
		for(OnlineShopping store: stores){
		switch(store) {
		case  amazon:
			System.out.println("50% Discount on Electronics");
			break;
		case flipcart:
			System.out.println("25% Discount on accessories");
			break;
		case snapdeal:
			System.out.println("10% Discount on HouseHoldItems");
			break;
		case jabong:
			System.out.println("15% Discount on Clothing");
			break;
		default: 
			System.out.println("No Store Selected");
		}
	}

	}

}
