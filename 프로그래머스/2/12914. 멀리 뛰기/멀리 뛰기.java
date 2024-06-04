import java.util.*;
class Solution {

    public long solution(int n) {
        if(n == 1) return 1;
        int one = 1;
        int two = 1;
        int answer = 0;
        for(int i=2;i<=n;i++){
            answer = (one + two) % 1234567;
            if(i % 2 != 0) one = answer;
            else two = answer;
        }

        return answer % 1234567;
    }
}