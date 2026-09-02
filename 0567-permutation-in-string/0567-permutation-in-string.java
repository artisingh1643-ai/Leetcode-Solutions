class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        return false;
        int [] map1=new int[26];
        int []map2=new int[26];
        for(int i=0;i<n;i++){
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(map1,map2))
        return true;
        int left =0;
        for(int i=n;i<m;i++){
            map2[s2.charAt(left++)-'a']--;
            map2[s2.charAt(i)-'a']++;
            if(Arrays.equals(map1,map2))
            return true;
        }
        return false;
    }
}