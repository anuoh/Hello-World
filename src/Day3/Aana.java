package Day3;
import java.util.Scanner;
public class Aana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Remove given characters from the string");
        System.out.println("2. Remove all white spaces from a given string");
        System.out.println("3. Capitalize the first letter of each word in a given string");
        System.out.println("4. Find all substrings of a given string");
        System.out.println("5. Check if a given text is a rotation of another text");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter the original string: ");
                String str1 = scanner.nextLine();
                System.out.print("Enter characters to remove: ");
                String charsToRemove = scanner.nextLine();
                String result1 = removeCharacters(str1, charsToRemove);
                System.out.println("Result: " + result1);
                break;

            case 2:
                System.out.print("Enter the original string: ");
                String str2 = scanner.nextLine();
                String result2 = removeWhiteSpaces(str2);
                System.out.println("Result: " + result2);
                break;

            case 3:
                System.out.print("Enter the original string: ");
                String str3 = scanner.nextLine();
                String result3 = capitalizeFirstLetter(str3);
                System.out.println("Result: " + result3);
                break;

            case 4:
                System.out.print("Enter the original string: ");
                String str4 = scanner.nextLine();
                findAllSubstrings(str4);
                break;

            case 5:
                System.out.print("Enter the first text: ");
                String text1 = scanner.nextLine();
                System.out.print("Enter the second text: ");
                String text2 = scanner.nextLine();
                boolean isRotation = isRotation(text1, text2);
                System.out.println("Result: " + isRotation);
                break;

            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
        }

        scanner.close();
    }

    private static String removeCharacters(String original, String charactersToRemove) {
        String result = original.replaceAll("[" + charactersToRemove + "]", "");
        return "Original string after removal: " + result;
    }

    private static String removeWhiteSpaces(String original) {
        String result = original.replaceAll("\\s", "");
        return "Original string after removing white spaces: " + result;
    }

    private static String capitalizeFirstLetter(String original) {
        String[] words = original.split("\\s");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        return "Original string after capitalizing first letter of each word: " + result.toString().trim();
    }

    private static void findAllSubstrings(String original) {
        StringBuilder result = new StringBuilder("All substrings of the given string:\n");
        for (int i = 0; i < original.length(); i++) {
            for (int j = i + 1; j <= original.length(); j++) {
                result.append(original.substring(i, j)).append("\n");
            }
        }
        System.out.print(result);
    }

    private static boolean isRotation(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        String concatenated = text1 + text1;
        return concatenated.contains(text2);
    }
	}


