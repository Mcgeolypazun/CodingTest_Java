import java.util.*;

class Solution {
    static boolean[][] visited;
    
    static int BFS(int[][] maps,int[] dx,int[] dy,int maxRow,int maxLen) {
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if (x == maxRow - 1 && y == maxLen - 1) {
                return distance;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                
                if (nx >= 0 && ny >= 0 && nx < maxRow && ny < maxLen && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, distance + 1});
                }
            }
        }
        
        return -1;
    }

    public int solution(int[][] maps) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int maxRow = maps.length;
        int maxLen = maps[0].length;
        visited = new boolean[maxRow][maxLen];
        
        return BFS(maps,dx,dy,maxRow,maxLen);
    }
    
}
