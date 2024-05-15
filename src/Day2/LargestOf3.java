package Day2;

import java.util.Scanner;

public class LargestOf3  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("enter 1st no.");
		a = sc.nextInt();
		System.out.println("enter 2nd no.");
		b = sc.nextInt();
		System.out.println("enter 3rd no.");
		c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+ "a is largest");
		}
		else if(b>a && b>c) {
		System.out.println(b+ "b is largest");
		}
		else {
		System.out.println(c+ "c is largest");
		}
	
		}
}