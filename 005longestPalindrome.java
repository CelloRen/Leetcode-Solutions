class Solution {
    
	int len = 0, maxLength = 0, init = 0;
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        len = s.length();
        if (len <= 1) return s;
        for (int i = 0; i < len; i++) {
            i = manacher(chars, i);
        }
        return s.substring(init, init + maxLength);
    }
    
    public int manacher(char[] chars, int k) {
        int left = k - 1, right = k;
        while (right < len - 1 && chars[right] == chars[right + 1]) right++;
        int nextCenter = right++;
        while (left >= 0 && right < len && chars[left] == chars[right]) {
            left--;
            right++;
        }
        if (right - left - 1 > maxLength) {
            maxLength = right - left - 1;
            init = left + 1;
        }
        return nextCenter;
    }    
    
    //
}