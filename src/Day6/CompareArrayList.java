package Day6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CompareArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B","C","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B","C","D","F"));
	Collections.sort(l1);
	Collections.sort(l2);
	System.out.println(l1.equals(l2));
	}

}
