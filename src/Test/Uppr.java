package Test;
import java.util.Scanner;
public class Uppr {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int digitCount = countDigits(inputString);
        int uppercaseCount = countUppercaseChars(inputString);
        int lowercaseCount = countLowercaseChars(inputString);

        System.out.println("Total number of integers: " + digitCount);
        System.out.println("Total number of uppercase characters: " + uppercaseCount);
        System.out.println("Total number of lowercase characters: " + lowercaseCount);

        scanner.close();
    }

    static int countDigits(String str) {
        int digitCount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    static int countUppercaseChars(String str) {
        int uppercaseCount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
        }
        return uppercaseCount;
    }

    static int countLowercaseChars(String str) {
        int lowercaseCount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        return lowercaseCount;
    }
}
