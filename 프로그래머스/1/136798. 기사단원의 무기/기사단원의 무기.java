import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            int count = 0;
            
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    count++;
                    //System.out.println("i%j == "+i+", count = "+count);
                    if(j != i/j){
                        count++;
                        //System.out.println("i != i/j = "+i+", count = "+count);
                    }
                }
            }
            //System.out.println("i = "+i+", count = "+count);
            if(count > limit){
                answer += power;
            }else{
                answer += count;
            }
            //System.out.println("answer = "+answer);
        }
        
        return answer;
    }
}