class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse digits from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set it to 0 and continue to handle carry
            digits[i] = 0;
        }

        // If all digits were 9, create a new array with one extra digit
        int[] result = new int[n + 1]; // All elements initialized to 0
        result[0] = 1; // Set the most significant digit to 1
        return result;
    }
}
