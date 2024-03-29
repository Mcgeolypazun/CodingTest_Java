import java.util.*;
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[2] - common[1];
        //
        
        if(common[2] - common[1] == common[1] - common[0]){
            //등차수열
            
            answer = common[0] + a*(common.length);
            
            
        }else{
            //등비수열
            int b = common[2] / common[1];
            int c = common[0];
            for(int i=1;i<=common.length;i++){
                c *= b;
            }
            answer = c;
        }
        
        return answer;
    }
}