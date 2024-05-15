package Test;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
        // Replace the array below with your own array of integers
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array using Selection Sort
        selectionSort(numbers);

        System.out.println("Sorted array (Ascending Order): " + Arrays.toString(numbers));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
