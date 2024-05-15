package Day7;
import java.util.HashMap;
import java.util.Map;
public class CommonWord {
	public static void main(String[] args) {
        String inputString = "java is a programming language java is widely used for web development";

        // Finding the most common word
        String mostCommonWord = findMostCommonWord(inputString);

        // Printing the result
        System.out.println("Most common word: " + mostCommonWord);
    }

    private static String findMostCommonWord(String input) {
        // Removing punctuation and converting to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Splitting the string into words
        String[] words = cleanInput.split("\\s+");

        // Counting word occurrences
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Finding the most common word
        String mostCommonWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommonWord;
    }
}


