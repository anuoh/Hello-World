package Test;
import java.util.Scanner;
public class ReverseWord {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedWords = reverseWords(input);

        System.out.println("Reverse of the words: " + reversedWords);

        scanner.close();
    }

    static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return reversedString.toString().trim();
    }

}
