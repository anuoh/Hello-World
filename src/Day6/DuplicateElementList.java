package Day6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class DuplicateElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);

        // Find duplicate elements using a Set
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (Integer element : list) {
            if (!uniqueElements.add(element)) {
                // If element is already present, it's a duplicate
                duplicateElements.add(element);
            }
        }

        // Print original list
        System.out.println("Original List: " + list);

        // Print duplicate elements
        System.out.println("Duplicate elements in the list: " + duplicateElements);
    }
	}


