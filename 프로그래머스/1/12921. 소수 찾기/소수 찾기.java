import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2;i<=n;i++){
            int count = 0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    count++;
                    if(j != i/j){
                        count++;
                        //System.out.println("j != j/i => " + j + " != " + j/i );
                        // i = 16 j = 4
                    }
                }
                if(count >= 3){
                    break;
                }
            }
            if(count == 2){
                answer++;
            }
        }
        
        // for(int i=2;i<=n;i++){
        //     int count = 0;
        //     if(i % 2 != 0){
        //         count++;
        //     }
        //     if()
        // }
        
        return answer;
    }
}