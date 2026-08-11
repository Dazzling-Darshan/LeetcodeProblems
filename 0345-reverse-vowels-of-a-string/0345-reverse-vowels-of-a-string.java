class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (!isVowel(arr[start])) {
                start++;
            } 
            else if (!isVowel(arr[end])) {
                end--;
            } 
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}