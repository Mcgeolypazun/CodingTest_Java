class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String str = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'p') pCnt++;
            else if(c == 'y') yCnt++;
        }
        
        if(pCnt != yCnt) answer = false;

        return answer;
    }
}