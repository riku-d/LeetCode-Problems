class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(char ch : s.toCharArray()) {
            temp.append(ch);

            if(ch == '(') {
                st.push(ch);
            } else {
                st.pop();
            }

            if(st.isEmpty()) {
                ans.append(temp.substring(1, temp.length() - 1));
                temp.setLength(0);
            }
        }

        return ans.toString();
    }
}