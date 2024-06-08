class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        int idx = 0;
        for(long i=left;i<=right;i++){
            int row =(int)(i / n)+1;
            int col =(int)(i % n)+1;
            
            if(row > col){
                answer[idx++] = row;
            }
            else{
                answer[idx++] = col;
            }
        }
        
        
        return answer;
    }
}