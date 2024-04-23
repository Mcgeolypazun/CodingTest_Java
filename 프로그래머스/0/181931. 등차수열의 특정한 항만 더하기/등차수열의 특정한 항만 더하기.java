class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0;i<included.length;i++){
            if(i != 0){
                a += d;
            }
            if(included[i]){
               answer += a;
            }
            
        }
        
        
        return answer;
    }
}