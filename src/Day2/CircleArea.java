package Day2;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius, area;;
		
		System.out.println("enter radius");
		radius = sc.nextDouble();
		sc.close();
	area= Math.PI*radius*radius;
	System.out.println("Area is:" +area);
	
	}
}
