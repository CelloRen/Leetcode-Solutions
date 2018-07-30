class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res=new LinkedList<>();
        if(digits==null||digits.length()==0) return res;
        String[] mapping=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        while(res.peek().length()!=digits.length()){
            String remove = res.remove();
            String map    = mapping[digits.charAt(remove.length())-'0'];
            for(char c:map.toCharArray())
                res.addLast(remove+c);
        }
        return res;
    }
}