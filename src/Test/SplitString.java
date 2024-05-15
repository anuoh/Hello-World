
package Test;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="123@anu";	
	String[] parts = s.split("@");

    // Printing the split parts
    //for (String part : parts) {
       // System.out.println(parts);
     //to print string as an array
        System.out.println(Arrays.toString(parts))   ;
}
}