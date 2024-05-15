package Test;
import java.util.Scanner;
public class StrToInt {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String strNumber = scanner.nextLine();

        try {
            int convertedNumber = convertStringToInt(strNumber);
            System.out.println("Converted number as integer: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer as a string.");
        }

        scanner.close();
    }

    static int convertStringToInt(String str) {
        return Integer.parseInt(str);
    }
}
