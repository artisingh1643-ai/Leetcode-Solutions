class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'&& !s.isEmpty()){
                st.pop();
            }
            else{
    st.push(ch);
        }
        }
        String res = "";
        for(char c : st){
            res +=c;
        }
        return res;
    }
}