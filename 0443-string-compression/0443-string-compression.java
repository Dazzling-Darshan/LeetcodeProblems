class Solution {
    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            chars[write] = current;
            write++;

            if (count > 1) {
                String str = String.valueOf(count);

                for (int i = 0; i < str.length(); i++) {
                    chars[write] = str.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }
}