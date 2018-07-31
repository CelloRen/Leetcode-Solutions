class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length()==0) return true;
       Stack<Character> bracket = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                bracket.push(ch);
            else if(ch==')'){
                if(bracket.size()==0||bracket.pop()!='(') return false;
            }
            else if(ch=='}'){
                if(bracket.size()==0||bracket.pop()!='{') return false;
            }
            else if(ch==']'){
                if(bracket.size()==0||bracket.pop()!='[') return false;
            }
        }
        if(bracket.size()==0)
           return true;
        else 
           return false; 
    }
}