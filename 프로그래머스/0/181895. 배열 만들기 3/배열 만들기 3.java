class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0];
        int b = intervals[0][1];
        int c = intervals[1][0];
        int d = intervals[1][1];
        int len = (b-a)+(d-c)+2;
        int ansIdx = 0;
        int[] answer = new int[len];
        
        
        for(int i=a;i<=b;i++){
            answer[ansIdx++] = arr[i];
        }
        for(int i=c;i<=d;i++){
            answer[ansIdx++] = arr[i];
        }
        
        return answer;
    }
}