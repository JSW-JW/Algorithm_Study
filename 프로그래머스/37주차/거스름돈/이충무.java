import java.util.*;
class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        
        int []dp= new int[n+1];
        
        
        Arrays.sort(money);
        int maxMoney= money[money.length-1];
        
        dp[0]=1;
        
        
        //%1000000007
        for(int i=0;i<money.length;i++){
            for(int j=money[i];j<=n;j++){
                    dp[j] += (dp[j-money[i]]);    
            }
            
            
        }

        answer = dp[n]%1000000007;
        
        
        return answer;
    }
}