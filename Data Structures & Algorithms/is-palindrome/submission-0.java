class Solution {
    public boolean isPalindrome(String s) {
        String alphanum_str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < alphanum_str.length()/2; i++) {
            if (alphanum_str.charAt(i) != alphanum_str.charAt(alphanum_str.length()-1-i)) {
                return false;
            } 
        }
        return true;
    }
}
