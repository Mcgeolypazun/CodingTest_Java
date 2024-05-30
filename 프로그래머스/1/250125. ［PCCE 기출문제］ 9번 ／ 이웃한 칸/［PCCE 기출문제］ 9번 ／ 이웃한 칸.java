class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[h][w].equals(board[i][j])){
                    if(Math.abs(i - h) == 1){
                        if(Math.abs(j - w) < 1){
                            answer++;
                        }
                    }
                    else if(Math.abs(j - w) == 1){
                        if(Math.abs(i - h) < 1){
                            answer++;
                        }
                    }
                
                }
            }
        }
        return answer;
    }
}