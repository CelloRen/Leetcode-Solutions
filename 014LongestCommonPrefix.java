class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String s=strs[0];
        for(int i=0;i<strs.length-1;i++){
            s=common(s,strs[i+1]);
        }
        return s;
    }
    
    public String common(String s,String goal){
        int end=0;
        for(int i=0;i<s.length()&&i<goal.length();i++,end++){
            if(s.charAt(i)!=goal.charAt(i)) break;
        }
        return s.substring(0,end);
    }
}