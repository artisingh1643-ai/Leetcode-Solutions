class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length,sum=0,left=0,right=0;
        int[] ans = new int[n];
        if (k == 0) return ans;
        if (k > 0) {
            left = 1;
            right = k;
        }
        else {
            left = n+k;
            right = n-1;
        }
        for (int i=left; i<=right; i++) sum+=code[i];
        for (int i=0; i<n; i++){
            ans[i]=sum;
            sum-=code[left];
            left=(left+1)%n;
            right=(right+1)%n;
            sum+=code[right];
        }
        return ans;
    }
}