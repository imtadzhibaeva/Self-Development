package Week4;

class Solution {
    public static String findLongestSubstring(String input) {
        int n = input.length();
        int start = 0;
        int maxLength = 0;
        int[] lastIndex = new int[128]; // Assuming ASCII characters

        Arrays.fill(lastIndex, -1);

        for (int end = 0; end < n; end++) {
            char currentChar = input.charAt(end);
            start = Math.max(start, lastIndex[currentChar] + 1);
            int currentLength = end - start + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            lastIndex[currentChar] = end;
        }

        return input.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String stringA = "salesforce";
        System.out.println("stringA: " + stringA);
        String longestSubstring = findLongestSubstring(stringA);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
} 
