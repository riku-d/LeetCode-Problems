class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st = new StringBuilder();
        int temp=0;
        for(Character c : s.toCharArray()){
            if(c=='('){
                if(temp>0){
                    st.append(c);
                }
                temp++;
            }else{
                temp--;
                if(temp>0){
                    st.append(c);
                }
            }
        }
        return st.toString();
    }
}