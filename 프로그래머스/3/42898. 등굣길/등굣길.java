class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] mn = new int[m][n];
        mn[0][0] = 1;
        
        for(int p[]:puddles){
            int i = p[0] - 1;
            int j = p[1] - 1;
            
            mn[i][j] = -1;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mn[i][j] == -1){
                    mn[i][j] = 0;
                }
                else{
                    if(j > 0) mn[i][j] += mn[i][j-1] % 1_000_000_007;
                    if(i > 0) mn[i][j] += mn[i-1][j] % 1_000_000_007;
                }
            }
        }
        answer = mn[m-1][n-1] % 1_000_000_007;
        
        return answer % 1_000_000_007;
    }
}