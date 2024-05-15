package Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class UniqueAndOccurence {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Enter the elements of the array
        System.out.println("Enter the elements of the array:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print unique numbers and occurrences
        System.out.println("\nUnique numbers: ");
        printUniqueNumbersWithOccurrences(numbers);

        scanner.close();
    }

    static void printUniqueNumbersWithOccurrences(int[] arr) {
        Map<Integer, Integer> numberOccurrences = new HashMap<>();

        // Count occurrences of each number
        for (int number : arr) {
            numberOccurrences.put(number, numberOccurrences.getOrDefault(number, 0) + 1);
        }

        // Print unique numbers and occurrences
        for (Map.Entry<Integer, Integer> entry : numberOccurrences.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Unique number: " + entry.getKey());
            } else {
                System.out.println("Number: " + entry.getKey() + ", Occurrences: " + entry.getValue());
            }
        }
    } }
