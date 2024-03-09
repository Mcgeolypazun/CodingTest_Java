class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = n;
        
        while(true){
            if(idx == 0){
                break;
            }
            
            answer += idx % 10;
            idx = idx/10;
            
        }
        
        return answer;
    }
}