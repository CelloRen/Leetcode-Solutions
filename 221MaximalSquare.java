class Solution {
    public int maximalSquare(char[][] a) {
          if(a.length == 0) return 0;
          int result = 0;
          int[][] dp = new int[a.length+1][a[0].length+1];         
          for (int i = 1 ; i <= a.length; i++) 
              for (int j = 1; j <= a[0].length; j++) {
                 if(a[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] , dp[i-1][j-1]), dp[i-1][j]) + 1;
                    result = Math.max(dp[i][j], result); // update result
              }
         }
    
    return result*result;
    }
}