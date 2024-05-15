package Test;

public class RegularExpression {
	 public static void main(String[] args) {
	        String input = "ma34n9g&o";
	        
	        // Remove all integers and special characters
	        String result = input.replaceAll("[^a-zA-Z]", "");
	        
	        System.out.println(result); // Output: "mango"
	    }
	}

