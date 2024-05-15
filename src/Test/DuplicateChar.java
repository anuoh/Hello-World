package Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charFrequencyMap = getCharacterFrequency(inputString);

        System.out.println("Duplicate characters in the string: ");
        displayDuplicateCharacters(charFrequencyMap);

        scanner.close();
    }

    static Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        return charFrequencyMap;
    }

    static void displayDuplicateCharacters(Map<Character, Integer> charFrequencyMap) {
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
            }
        }
    }
}

