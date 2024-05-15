package Day2;

public class BubbleSort {
	public static void main(String[] args) {
        // Replace the array below with your own array of integers
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        // Sorting the array using bubble sort
        bubbleSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            // Last i elements are already sorted, so we don't need to check them
            for (int j = 0; j < n-i-1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
