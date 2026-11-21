class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else if(st.peek() != ch) st.push(ch);
            else st.pop();
        }
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}