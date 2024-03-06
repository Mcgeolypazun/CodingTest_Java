import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        //가장 큰수 + 각 배열의 두 값중 작은 값들 보다 크면서 최소인 수
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sizes.length;i++){
            for(int j=0;j<sizes[i].length;j++){
                if(max < sizes[i][j]){
                    max = sizes[i][j];
                }
            }
        }
        
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<sizes.length;i++){
            int small = Integer.min(sizes[i][0],sizes[i][1]);
            if(max2 < small){
                max2 = small;
            }
        }
        answer = max * max2;

        return answer;
    }
}