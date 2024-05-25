import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int len = 0;
        int prelen = 0;
        while(!s.equals("1")){
            prelen = s.length();
            s = s.replace("0","");
            len = s.length();
            answer[1] += prelen - len;
            s = Integer.toBinaryString(len);
            cnt++;
        }
        answer[0] = cnt;
        return answer;
    }
}