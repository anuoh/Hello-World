package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; class OccurenceofAllCHars {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charOccurrencesMap = getCharacterOccurrences(inputString);

        System.out.println("Number of occurrences of each character: ");
        displayCharacterOccurrences(charOccurrencesMap);

        scanner.close();
    }

    static Map<Character, Integer> getCharacterOccurrences(String str) {
        Map<Character, Integer> charOccurrencesMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charOccurrencesMap.put(ch, charOccurrencesMap.getOrDefault(ch, 0) + 1);
        }

        return charOccurrencesMap;
    }

    static void displayCharacterOccurrences(Map<Character, Integer> charOccurrencesMap) {
        for (Map.Entry<Character, Integer> entry : charOccurrencesMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
        
    }

