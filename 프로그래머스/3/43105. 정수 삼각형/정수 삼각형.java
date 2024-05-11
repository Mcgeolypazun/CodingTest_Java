class Solution {
    int[][] arr;
    int DFS(int[][] triangle,int level,int horizon){
        if(arr[level][horizon] != 0){
            return arr[level][horizon];
        }
        else if(level == triangle.length-1){
            return arr[level][horizon] = triangle[level][horizon];
        }
        
        
        int a = DFS(triangle,level+1,horizon);
        int b = DFS(triangle,level+1,horizon+1);
        arr[level][horizon] = Math.max(a,b) + triangle[level][horizon];
        return arr[level][horizon];
    }
    
    public int solution(int[][] triangle) {
        arr = new int[triangle.length][triangle.length];
        int answer = DFS(triangle,0,0);
        return answer;
    }
}