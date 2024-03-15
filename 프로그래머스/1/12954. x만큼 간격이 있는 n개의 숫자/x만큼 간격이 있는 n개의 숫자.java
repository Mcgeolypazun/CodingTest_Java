class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long count = 0;
        
        for(int i=0;i<n;i++){
            count += x;
            answer[i] = count;
        }
        
        return answer;
    }
}