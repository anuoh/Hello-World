package Test;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class UniqueWords {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        Set<String> uniqueWords = getUniqueWords(input);

	        System.out.println("Unique words in the string: " + uniqueWords);

	        scanner.close();
	    }

	    static Set<String> getUniqueWords(String str) {
	        String[] words = str.split("\\s+");
	        Set<String> uniqueWords = new HashSet<>();

	        for (String word : words) {
	            uniqueWords.add(word.toLowerCase()); // Case-insensitive uniqueness
	        }

	        return uniqueWords;
	    }
	}

