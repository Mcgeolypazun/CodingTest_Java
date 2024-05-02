class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        
        for(int q[]:queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];
            
            int min = Integer.MAX_VALUE;
            for(int i=s;i<=e;i++){
                if(k < arr[i] && min > arr[i]){
                    min = arr[i];
                }
            }
            if(min == Integer.MAX_VALUE) min = -1;
            answer[idx++] = min;
        }
        
        return answer;
    }
}