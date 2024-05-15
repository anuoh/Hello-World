package Test;

public class CharAt {

	public static void main(String[] args) {
		String str="anupambhardwaj";
		// Counting characters and finding indexes
		for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
           // int charCount = 0;
            
            String charCount;
			System.out.println("Character: " + currentChar + ", Index: " + i );
        }
	}

}
