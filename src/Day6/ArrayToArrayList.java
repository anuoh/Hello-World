package Day6;
import java.util.ArrayList;
public class ArrayToArrayList {

	public static void main(String[] args) {
				int[] anArray = {1, 2, 3, 4, 5};

        // Convert array to ArrayList
  ArrayList<Integer>  al = new  ArrayList<Integer> ();
  
  for(int temp: anArray)
  {
	  al.add(temp);
        System.out.println("ArrayList elements: " +al);
	}

}
}