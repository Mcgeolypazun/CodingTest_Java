class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0;i<emergency.length;i++){
            int a = emergency[i];
            int cnt = 0;
            for(int j=0;j<emergency.length;j++){
                if(a <= emergency[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}