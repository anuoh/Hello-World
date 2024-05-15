package Day1;
import java.util.Scanner;

public class LargetOf3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1,n2,n3,largest;
	
	System.out.println("enter 1st no.");
	n1 = sc.nextInt();
	System.out.println("enter 2nd no.");
	n2 = sc.nextInt();
	System.out.println("enter 3rd no.");
	n3 = sc.nextInt();
	sc.close();
	
	if(n1>n2 && n1>n3)
	largest=n1;
	else if(n2>n1 && n2>n3)
	largest=n2;
	else
		largest=n3;
	

	System.out.printf("Largest among %d %d and %d is %d" , n1,n2,n3,largest);
	
	
}
	
}
