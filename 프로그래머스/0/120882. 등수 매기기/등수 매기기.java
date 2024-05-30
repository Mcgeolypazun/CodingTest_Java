import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        double[] ave = new double[score.length];
        int[] answer = new int[score.length];
        for(int i=0;i<score.length;i++){
            double average = (double)(score[i][0]+score[i][1])/2;
            ave[i] = average;
        }
        
        for(int i=0;i<ave.length;i++){
            int cnt = 1;
            for(int j=0;j<ave.length;j++){
                if(ave[i] < ave[j]) cnt++;
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}