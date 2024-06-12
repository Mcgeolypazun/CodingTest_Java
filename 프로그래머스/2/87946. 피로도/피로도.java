class Solution {
    static int max = 0;
    void DFS(int k,int[][] dungeons,int lv,int idx,boolean[] visited){
        if(max < lv) max = lv;
        if(lv == dungeons.length) return ;
        for(int i=idx;i<dungeons.length;i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                DFS(k-dungeons[i][1],dungeons,lv+1,(idx+1),visited);
                visited[i] = false;
            }
        }
        for(int i=0;i<idx;i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                DFS(k-dungeons[i][1],dungeons,lv+1,(idx+1),visited);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        boolean[] visited = new boolean[dungeons.length];
        
        DFS(k,dungeons,0,0,visited);
        answer = max;
        
        return answer;
    }
}