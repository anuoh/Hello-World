package Test;
import java.util.Scanner;
public class RemoveChar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String stringWithoutChar = removeCharacter(originalString, charToRemove);

        System.out.println("Original String: " + originalString);
        System.out.println("String without '" + charToRemove + "': " + stringWithoutChar);

        scanner.close();
    }

    static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != charToRemove) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

