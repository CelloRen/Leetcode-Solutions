class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] charTable=new int [26];
        for(int i=0;i<s.length();i++){
            charTable[s.charAt(i)-'a']++;
            charTable[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(charTable[i]!=0) return false;
        }
        return true;
    }
}