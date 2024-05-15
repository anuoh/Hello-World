package Test;
import java.util.Scanner;
public class TotalNoOfIntLowerUppr {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int repeatedDigitCount = countRepeatedDigits(inputString);
        int repeatedUppercaseCount = countRepeatedUppercaseChars(inputString);
        int repeatedLowercaseCount = countRepeatedLowercaseChars(inputString);

        System.out.println("Total number of repeated integers: " + repeatedDigitCount);
        System.out.println("Total number of repeated uppercase characters: " + repeatedUppercaseCount);
        System.out.println("Total number of repeated lowercase characters: " + repeatedLowercaseCount);

        scanner.close();
    }

    static int countRepeatedDigits(String str) {
        int repeatedDigitCount = 0;
        int[] digitFrequency = new int[10];

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                if (digitFrequency[digit] > 0) {
                    repeatedDigitCount++;
                }
                digitFrequency[digit]++;
            }
        }

        return repeatedDigitCount;
    }

    static int countRepeatedUppercaseChars(String str) {
        int repeatedUppercaseCount = 0;
        int[] uppercaseFrequency = new int[26];

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                int index = ch - 'A';
                if (uppercaseFrequency[index] > 0) {
                    repeatedUppercaseCount++;
                }
                uppercaseFrequency[index]++;
            }
        }

        return repeatedUppercaseCount;
    }

    static int countRepeatedLowercaseChars(String str) {
        int repeatedLowercaseCount = 0;
        int[] lowercaseFrequency = new int[26];

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                int index = ch - 'a';
                if (lowercaseFrequency[index] > 0) {
                    repeatedLowercaseCount++;
                }
                lowercaseFrequency[index]++;
            }
        }

        return repeatedLowercaseCount;
    }
}

