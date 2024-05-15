package Day2;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base=0, height=0;
				int area=0;
		
		System.out.println("enter base");
		base = sc.nextInt();
		 
		 System.out.println("enter height");
          height = sc.nextInt();
area= (base*height)/2;

System.out.println("Area:"   +area);


}}