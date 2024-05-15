package Day6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class UniqueElementList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);

        // Find unique elements using a Set
        Set<Integer> uniqueSet = new HashSet<>(list);

        // Print original list
        System.out.println("Original List: " + list);

        // Print unique elements
        System.out.println("Unique elements in the list: " + uniqueSet);
    }
	}


