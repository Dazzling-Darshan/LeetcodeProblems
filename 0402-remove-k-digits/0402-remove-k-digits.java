class Solution {

    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for(char ch : num.toCharArray()) {

            while(!stack.isEmpty()
                    && k > 0
                    && stack.peek() > ch) {

                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        while(k > 0){
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        for(char c : stack)
            ans.append(c);

        while(ans.length() > 0 && ans.charAt(0) == '0')
            ans.deleteCharAt(0);

        if(ans.length()==0)
            return "0";

        return ans.toString();
    }
}