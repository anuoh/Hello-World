package Day8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadAndWrite {
	 public static void main(String[] args) {
	        
	        String filePath = "src/main/resources/data.txt";

	        try {
	            reverseWordsInFile(filePath);
	            System.out.println("Word reversal successful.");
	        } catch (IOException e) {
	            System.err.println("Error processing the file: " + e.getMessage());
	        }
	    }

	    static void reverseWordsInFile(String filePath) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
	             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Split the line into words using StringTokenizer
	                StringTokenizer tokenizer = new StringTokenizer(line);
	                StringBuilder reversedLine = new StringBuilder();

	                // Reverse each word and append it to the StringBuilder
	                while (tokenizer.hasMoreTokens()) {
	                    String word = tokenizer.nextToken();
	                    String reversedWord = new StringBuilder(word).reverse().toString();
	                    reversedLine.append(reversedWord).append(" ");
	                }

	                // Write the reversed line back to the file
	                writer.write(reversedLine.toString().trim());
	                writer.newLine(); // Add a new line after each line for readability
	            }
	        }
	    }
	
}
