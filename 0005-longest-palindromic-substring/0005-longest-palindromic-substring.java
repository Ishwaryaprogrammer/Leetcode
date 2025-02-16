class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        int n = s.length();
        boolean[][] dp = new boolean[n][n]; // DP table to store palindrome information
        String longest = "";

        // Initialize single character palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true; // Single characters are palindromes
            longest = s.substring(i, i + 1); // At least one character is a palindrome
        }

        // Check for two-character palindromes
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                longest = s.substring(i, i + 2); // Update longest for two characters
            }
        }

        // Check for palindromes longer than 2 characters
        for (int length = 3; length <= n; length++) { // Length of the substring
            for (int i = 0; i <= n - length; i++) { // Starting index
                int j = i + length - 1; // Ending index
                // Check if the current substring is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (length > longest.length()) {
                        longest = s.substring(i, j + 1); // Update longest
                    }
                }
            }
        }

        return longest; // Return the longest palindromic substring found
    }
}
