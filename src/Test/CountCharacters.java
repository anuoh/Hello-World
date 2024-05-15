package Test;

public class CountCharacters {
	public static void countChar(String str ) {
       
        int count = 0;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
        	count++;
        }
        System.out.println(count);
    }

	public static void main(String[] args) {
	countChar("anupam");

	}
}