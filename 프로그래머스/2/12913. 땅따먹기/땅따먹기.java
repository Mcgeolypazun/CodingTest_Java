import java.util.*;

// class Order implements Comparable<Order>{
//     public int idx;
//     public int val;
    
//     Order(int idx,int val){
//         this.idx = idx;
//         this.val = val;
//     }
    
//     @Override
//     public int compareTo(Order o){
//         return this.val - o.val;
//     }
// }

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        int size = land.length;

        int[][] dp = new int[size][4];

        for (int j = 0; j < 4; j++) {
            dp[0][j] = land[0][j];
        }

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = land[i][j] + Math.max(
                    Math.max(dp[i-1][(j+1)%4], dp[i-1][(j+2)%4]),
                    dp[i-1][(j+3)%4]
                );
            }
        }

        int max = 0;
        for (int j = 0; j < 4; j++) {
            max = Math.max(max, dp[size-1][j]);
        }
        answer = max;
        
        return answer;
    }

}