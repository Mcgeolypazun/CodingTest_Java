import java.util.*;

class Solution {
//     int BFS(int[][] maps) {
//         Queue<ArrayList<Integer>> q = new LinkedList<>();
//         int lv = 1;
//         int[] row = new int[]{-1, 1, 0, 0};
//         int[] col = new int[]{0, 0, 1, -1};
//         int destinRow = maps.length - 1;
//         int destinCol = maps[0].length - 1;
//         boolean[][] visited = new boolean[destinRow + 1][destinCol + 1];
        
//         ArrayList<Integer> listOut = new ArrayList<>(Arrays.asList(0, 0));
//         q.add(listOut);
        
//         while (!q.isEmpty()) {
//             ArrayList<Integer> listIn = q.poll();
//             for (int j = 0; j < row.length; j++) {
//                 int x = row[j] + listIn.get(0);
//                 int y = col[j] + listIn.get(1);
                
//                 if (x == destinRow && y == destinCol) {
//                     return lv + 1;
//                 }
                
//                 if (x >= 0 && y >= 0 && x <= destinRow && y <= destinCol && maps[x][y] == 1 && !visited[x][y]) {
//                     ArrayList<Integer> pathList = new ArrayList<>(Arrays.asList(x, y));
//                     q.add(pathList);
//                     visited[x][y] = true;
//                 }
//             }
//             lv++;
//         }
        
//         return -1;
//     }
    
//     public int solution(int[][] maps) {
//         return BFS(maps);
//     }
    
    int BFS(int[][] maps) {
        Queue<ArrayList<Integer>> q = new LinkedList<>();

        int[] row = new int[]{-1, 1, 0, 0};
        int[] col = new int[]{0, 0, -1, 1};
        int destinRow = maps.length;
        int destinCol = maps[0].length;
        boolean[][] visited = new boolean[destinRow][destinCol];

        ArrayList<Integer> listOut = new ArrayList<>(Arrays.asList(0, 0, 1));
        q.add(listOut);
        visited[0][0] = true;

        while (!q.isEmpty()) {
            ArrayList<Integer> listIn = q.poll();
            for (int j = 0; j < 4; j++) {
                int x = row[j] + listIn.get(0);
                int y = col[j] + listIn.get(1);
                int lv = listIn.get(2);

                if (x == destinRow-1 && y == destinCol-1) {
                    return lv+1;
                }

                if (x >= 0 && y >= 0 && x < destinRow && y < destinCol && maps[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    ArrayList<Integer> pathList = new ArrayList<>(Arrays.asList(x, y, lv+1));
                    q.add(pathList);

                }
            }
        }

        return -1;
    }

    public int solution(int[][] maps) {
        return BFS(maps);
    }
}
