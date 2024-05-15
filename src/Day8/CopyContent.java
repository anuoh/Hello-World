package Day8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyContent {
	public static void main(String[] args) {
        
        String sourceFilePath = "src/main/resources/data.txt";
        String destinationFilePath = "src/main/resources/data.txt";
   

        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("File copy successful.");
        } catch (IOException e) {
            System.err.println("Error copying the file: " + e.getMessage());
        }
    }

    static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Write each line to the destination file
                writer.write(line);
                writer.newLine(); // Add a new line after each line for readability
            }
        }
    }
}
