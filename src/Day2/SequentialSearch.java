package Day2;

public class SequentialSearch {
	public static void main(String[] args) {
        // Replace the array below with your own array of integers
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        int searchElement = 22;

        System.out.println("Original array:");
        printArray(arr);

        // Perform sequential search
        int index = sequentialSearch(arr, searchElement);

        if (index != -1) {
            System.out.println("\nElement " + searchElement + " found at index " + index);
        } else {
            System.out.println("\nElement " + searchElement + " not found in the array");
        }
    }

    static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}
}