class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        helper(digits, 0, "", ans, map);

        return ans;
    }

    public void helper(String digits, int index, String str,
                       List<String> ans, String[] map) {

        if (index == digits.length()) {
            ans.add(str);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            helper(
                digits,
                index + 1,
                str + letters.charAt(i),
                ans,
                map
            );
        }
    }
}