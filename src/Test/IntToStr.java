package Test;
import java.util.Scanner;
public class IntToStr {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int intValue = scanner.nextInt();

	        String strValue = convertIntToString(intValue);

	        System.out.println("Converted integer as string: " + strValue);

	        scanner.close();
	    }

	    static String convertIntToString(int value) {
	        return String.valueOf(value);
	    }
	}

