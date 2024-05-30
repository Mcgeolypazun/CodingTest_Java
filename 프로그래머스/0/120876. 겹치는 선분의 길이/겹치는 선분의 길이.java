class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        
        for(int i=0;i<3;i++){
            if(lines[i][0] < min){
                min = lines[i][0];
            }
            if(lines[i][1] > max){
                max = lines[i][1];
            }
        }
        
        for(int i=min;i<=max;i++){
            int cnt = 0;
            if(lines[0][0] <= i && lines[0][1] > i) cnt++;
            if(lines[1][0] <= i && lines[1][1] > i) cnt++;
            if(lines[2][0] <= i && lines[2][1] > i) cnt++;
            
            if(cnt >= 2) answer++;
        }
        
        return answer;
    }
}