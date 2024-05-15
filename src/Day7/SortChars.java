package Day7;

public class SortChars {
	public static void main(String[] args) {
        String inputString = "learning";

        // Sorting the characters alphabetically
        String sortedString = sortStringAlphabetically(inputString);

        // Printing the result
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }

    private static String sortStringAlphabetically(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        java.util.Arrays.sort(charArray);

        // Convert the character array back to a string
        return new String(charArray);
    }
}


