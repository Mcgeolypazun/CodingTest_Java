class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sheep = 12000;
        int sip = 2000;
        
        for(int i = 10;i <= n;i+=10){
            k -= 1;
        }
        
        answer = sheep * n + sip * k;
        
        
        return answer;
    }
}