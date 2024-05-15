package Test;
import java.util.HashSet;
public class DuplicatInTwoArrays {
	public class FindDuplicatesInArrays {
	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 3, 2, 5, 6, 7, 8, 7};
	        int[] array2 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 13};

	        System.out.println("Duplicate elements in the arrays are: ");
	        findDuplicatesInArrays(array1, array2);
	    }

	    static void findDuplicatesInArrays(int[] arr1, int[] arr2) {
	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : arr1) {
	            if (!set.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        for (int num : arr2) {
	            if (!set.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        for (int duplicate : duplicates) {
	            System.out.println(duplicate);
	        }
	    }
	}
}
