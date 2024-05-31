import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int maxLen = Math.max(a,b);
        int[][] answer = new int[maxLen][maxLen];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}