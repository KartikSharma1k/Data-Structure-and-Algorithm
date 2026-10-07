class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        return palindrom(cleaned.toLowerCase(), cleaned.length(), 0);
    }

    public boolean palindrom(String s, int n, int i){

        if((n-i-1) != i && i < n/2) {

            if(s.charAt(i) != s.charAt(n-i-1)) return false;

            if(i < n-1)
                return palindrom(s, n, i+1);
        }

        return true;

    }

}