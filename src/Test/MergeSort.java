package Test;
import java.util.Scanner;
public class MergeSort {
	 public static void main(String[] args) {
	        // Replace the array below with your own array of integers
	        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

	        System.out.println("Original array: ");
	        printArray(numbers);

	        // Sorting the array using Merge Sort
	        mergeSort(numbers, 0, numbers.length - 1);

	        System.out.println("Sorted array: ");
	        printArray(numbers);
	    }

	    static void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Find the middle point
	            int mid = (low + high) / 2;

	            // Recursively sort the left and right halves
	            mergeSort(arr, low, mid);
	            mergeSort(arr, mid + 1, high);

	            // Merge the sorted halves
	            merge(arr, low, mid, high);
	        }
	    }

	    static void merge(int[] arr, int low, int mid, int high) {
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        // Create temporary arrays
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        // Copy data to temporary arrays
	        for (int i = 0; i < n1; ++i) {
	            leftArray[i] = arr[low + i];
	        }
	        for (int j = 0; j < n2; ++j) {
	            rightArray[j] = arr[mid + 1 + j];
	        }

	        // Merge the temporary arrays

	        // Initial indexes of the two sub-arrays
	        int i = 0, j = 0;

	        // Initial index of the merged sub-array
	        int k = low;
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of leftArray[], if any
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of rightArray[], if any
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }

	    static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	
}
