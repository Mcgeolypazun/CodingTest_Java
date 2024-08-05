class Solution {
    public int[] solution(long n) {
        int[] answer;
        int cnt = 0;
        long nSize = n;
        while(nSize != 0){
            nSize /= 10;
            cnt++;
        }
        answer = new int[cnt];
        int idx = 0;
        while(n != 0) {
            answer[idx++] =(int)(n % 10);
            n = n / 10;
        }
        
        return answer;
    }
}