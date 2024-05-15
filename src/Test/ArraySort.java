package Test;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
	 public static void main(String[] args) {
		 // Define an array of integers
	        int[] numbers = {5, 2, 8, 1, 9, 4};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
	}

