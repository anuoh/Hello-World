package Day6;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveCommonOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2);

        // Value to be removed
        int valueToRemove = 2;

        // Remove all occurrences of the specified value
        list.removeIf(element -> element.equals(valueToRemove));

        // Print original list
        System.out.println("Original List: " + list);

        // Print list after removing the specified value
        System.out.println("List after removing " + valueToRemove + ": " + list);
    }
	}


