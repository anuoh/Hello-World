package Day1;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to reverse a digit or a string? Enter 'digit' or 'string': ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("digit")) {
            // Reverse digits
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int reversedNumber = reverseDigits(number);
            System.out.println("Reversed digits: " + reversedNumber);
        } else if (choice.equals("string")) {
            // Reverse string
            System.out.print("Enter a string: ");
            scanner.nextLine(); // Consume newline
            String inputString = scanner.nextLine();
            String reversedString = reverseString(inputString);
            System.out.println("Reversed string: " + reversedString);
        } else {
            System.out.println("Invalid choice. Please enter 'digit' or 'string'.");
        }

        scanner.close();
    }

    private static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    private static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder(str).reverse();
        return reversedString.toString();
    
}
}
