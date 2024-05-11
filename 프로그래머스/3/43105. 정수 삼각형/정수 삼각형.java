import java.util.Arrays;

class Solution {
    public int solution(int[][] triangle) {
        int height = triangle.length;
        int[][] dp = new int[height][height];
        
        // dp 배열 초기화
        for (int i = 0; i < height; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return findMaxPath(triangle, 0, 0, dp);
    }
    
    private int findMaxPath(int[][] triangle, int row, int col, int[][] dp) {
        // 기저 조건: 삼각형의 아랫부분에 도달했을 때
        if (row == triangle.length - 1) {
            return triangle[row][col];
        }
        
        // 이미 계산된 값이 있다면 그 값을 반환
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        
        // 현재 위치에서 아래층으로 내려가는 경우 중 최댓값을 선택
        int leftMax = findMaxPath(triangle, row + 1, col, dp);
        int rightMax = findMaxPath(triangle, row + 1, col + 1, dp);
        
        // 현재 위치까지의 최댓값을 현재 셀에 저장
        dp[row][col] = Math.max(leftMax, rightMax) + triangle[row][col];
        
        return dp[row][col];
    }
}
