package Test;

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        int start = 0; // Start index of the longest palindrome
        int maxLength = 1; // Length of the longest palindrome

        // Check substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check substrings of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                // Check if the substring is a palindrome
                if (isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    isPalindrome[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }

        // Extract the longest palindrome from the input string
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest Palindrome: " + result);
    }

}
