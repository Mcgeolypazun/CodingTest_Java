class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = -1;
        int left = 0;
        
        while(true){
            
            tmp = n / a;
            if(tmp == 0){
                break;
            }
            left = n % a;

            answer += tmp * b;
            n = tmp * b + left;
        }

        return answer;
    }
}