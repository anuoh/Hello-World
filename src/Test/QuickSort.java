package Test;
//import java.util.Scanner;
public class QuickSort {
	public static void main(String[] args) {
        // Replace the array below with your own array of integers
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: ");
        printArray(numbers);

        // Sorting the array using Quick Sort
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array (Ascending Order): ");
        printArray(numbers);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot index such that elements smaller than pivot are on the left
            // and elements greater than pivot are on the right
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

