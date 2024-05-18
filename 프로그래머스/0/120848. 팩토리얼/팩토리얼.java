class Solution {
    public int solution(int n) {
        int f = 1;
        int cur = f;
        int sum = 1;
        
        while(true){
            sum *= cur--;
            if(cur == 1){
                if(sum > n){
                    return f-1;
                }
                else if(sum == n){
                    return f;
                }
                f++;
                cur = f;
                sum = 1;
            }
        }
        
    }
}