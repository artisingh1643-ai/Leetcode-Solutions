class Solution {
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public int maxVowels(String s, int k) {
       int count=0,left=0;
       for (int i=0; i<k; i++) if (isVowel(s.charAt(i))) count++;
       int max=count;
       for (int i=k; i<s.length(); i++){
         if (isVowel(s.charAt(i))) count++;
         if (isVowel(s.charAt(left++))) count--;
         max=Math.max(max,count);
       }
       return max;
    }
}