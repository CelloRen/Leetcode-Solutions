class Solution {
    public String convert(String s, int numRows) {      
	    char[] c=s.toCharArray();
        int len=c.length;
        StringBuffer[] sb=new StringBuffer[numRows];
        for(int i=0;i<sb.length;i++) sb[i]=new StringBuffer();
        int i=0;
        while(i<len){
            for(int index=0;        index<numRows&&i<len;index++,i++)             
                sb[index].append(c[i]);
            for(int index=numRows-2;index>=1     &&i<len;index--,i++)
                sb[index].append(c[i]);
        }
        
        for(int j=1;j<sb.length;j++)
            sb[0].append(sb[j]);
        return sb[0].toString();
   }    
}