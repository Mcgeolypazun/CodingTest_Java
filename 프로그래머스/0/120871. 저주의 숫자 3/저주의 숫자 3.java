class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            
            if(i % 3 == 0) n++;
            else if(String.valueOf(i).contains("3")) n++;
        }
        answer = n;
        return answer;
    }
}