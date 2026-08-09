class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i] - '0';
            int b = arr[i + 1] - '0';

            if (a % 2 == b % 2 && a > b) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                break;
            }
        }

        return new String(arr);
    }
}