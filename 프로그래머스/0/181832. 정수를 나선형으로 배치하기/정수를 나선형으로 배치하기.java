class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        char[] c = new char[]{'d','s','a','w'};
        int w = 0;
        int h = 0;
        int idx = 0;
        int cur = 1;
        
        if(n == 1){
            return new int[][]{{1}};
        }
        
        while(true){
            
            
            if(c[idx] == 'd'){
                answer[h][w] = cur;
                cur++;
                w++;
            }
            else if(c[idx] == 's'){
                answer[h][w] = cur;
                cur++;
                h++;
            }
            else if(c[idx] == 'a'){
                answer[h][w] = cur;
                cur++;
                w--;
            }
            else if(c[idx] == 'w'){
                answer[h][w] = cur;
                cur++;
                h--;
            }
            
            if(h < 0){
                h++;
                w++;
                idx++;
            }
            else if(h == n){
                h--;
                w--;
                idx++;
            }
            else if(w < 0){
                w++;
                h--;
                idx++;
            }
            else if(w == n){
                w--;
                h++;
                idx++;
            }
            else if(answer[h][w] != 0){
                if(c[idx] == 'd'){
                    h++;
                    w--;
                    idx++;
                }
                else if(c[idx] == 'a'){
                    idx++;
                    w++;
                    h--;
                }
                else if(c[idx] == 'w'){
                    idx++;
                    h++;
                    w++;
                }
                else if(c[idx] == 's'){
                    idx++;
                    h--;
                    w--;
                }
            }
            if(idx == 4) idx = 0;
            
            if(answer[h][w] != 0) break;
        }
        
        
        return answer;
    }
}