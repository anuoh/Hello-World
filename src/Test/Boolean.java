package Test;

public class Boolean {
	public static void main(String[] args) {
        // Replace the values of a, b, c with your boolean variables
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Check if at least two out of three booleans are true
        if ((a && b) || (a && c) || (b && c)) {
            System.out.println("At least two out of three booleans are true.");
        } else {
            System.out.println("Less than two booleans are true.");
        }
    }
}
