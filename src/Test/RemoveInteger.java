package Test;

public class RemoveInteger {
	 public static void main(String[] args) {
	String str = "man4g9o";
    
    // Remove integers using regular expression
    String result = str.replaceAll("[0-9]", "");
    System.out.println("String with integers removed using regular expression: " + result);
	    }
}
