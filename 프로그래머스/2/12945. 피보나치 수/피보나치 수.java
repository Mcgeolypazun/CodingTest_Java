import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int fb[] = new int[n+1];
        fb[0] = 0;
        fb[1] = 1;
        
        for(int i=2;i<=n;i++){
            fb[i] = fb[i-1] + fb[i-2];
            fb[i] = fb[i] % 1234567;
        }
        
        answer = fb[fb.length-1] % 1234567;
        
        return answer;
    }
}