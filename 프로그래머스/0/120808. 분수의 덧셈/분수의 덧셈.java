class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int tmp1 = denom1;
        int tmp2 = denom2;
        denom1 *= tmp2;
        denom2 *= tmp1;
        
        numer1 *= tmp2;
        numer2 *= tmp1;
        
        int a = numer1 + numer2;
        
        for(int i=numer1;i>=1;i--){
            if(a % i ==0 && denom1 % i == 0){
                a /= i;
                denom1 /= i;
            }
        }
        answer[0] = a;
        answer[1] = denom1;
        
        return answer;
    }
}