package Day1;

public class SwapwithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		System.out.println("Before swap: "  +a+  "  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
	
		
		System.out.println("After swap: "  +a+   "  "+b);
	}

}
