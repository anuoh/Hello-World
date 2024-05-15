package Day8;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class ReadAndCount {
	

	public class WordCounter {

	    public static void main(String[] args) {
	        // Get the file path from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("src/main/resources/data.txt";
	        String filePath = scanner.nextLine();

	        // Call the method to count words
	        int wordCount = countWords(filePath);

	        // Display the result
	        System.out.println("Number of words in the file: " + wordCount);
	    }

	    private static int countWords(String filePath) {
	        int wordCount = 0;

	        try {
	            // Read all lines from the file
	            Path path = Paths.get(filePath);
	            String content = Files.readString(path);

	            // Split the content into words using space as a delimiter
	            String[] words = content.split("\\s+");

	            // Count the number of words
	            wordCount = words.length;
	        } catch (Exception e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        }

	        return wordCount;
	    }
	}
}
