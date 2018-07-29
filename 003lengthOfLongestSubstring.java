 public int lengthOfLongestSubstring(String s) {
        int len=s.length();
		Set<Character> set = new HashSet<>();//Set stores the characters without repeat
		int result=0,begin=0,end=0;
        //Scan the string to find the LongestSubstring that maximize end-begin
		while(begin<len && end<len){
			//try to extend the range [begin,end]
			if(!set.contains(s.charAt(end))){//If set dosen't own the char
				set.add(s.charAt(end++));//Add it
				result = Math.max(result, end-begin);//Compared with the previous result
			}
			else
				set.remove(s.charAt(begin++));//Else remove the element at begin
		}
		return result;
    }