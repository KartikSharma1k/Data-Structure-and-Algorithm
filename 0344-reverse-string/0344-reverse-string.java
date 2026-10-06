class Solution {
    public void reverseString(char[] s) {
        reverse(s, s.length, 0);
    }

    public void reverse(char[] s, int n, int i){

        if((n-i-1) != i && i < n/2) {
            char ch = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = ch;

            reverse(s, n, i+1);
        }

    }

}