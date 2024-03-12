import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int b_length = board.length;
        int broad[][] = new int[b_length+2][b_length+2];
        int br_len = broad.length;
        
        for(int i=0;i<b_length;i++){
            for(int j=0;j<b_length;j++){
                
                broad[i+1][j+1] = board[i][j];
                System.out.print(broad[i][j]+" ");
            }
            System.out.println();
        }
        
        //출력
        System.out.print(" ");
        for(int i=0;i<br_len;i++){
            System.out.print(" "+i);
        }System.out.println();
        for(int i=0;i<br_len;i++){
            System.out.print(i+" ");
            for(int j=0;j<br_len;j++){
                
               
                System.out.print(broad[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<br_len;i++){
            for(int j=0;j<br_len;j++){
                
                if(broad[i][j] == 1){
                    
                    broad[i-1][j-1] = broad[i-1][j-1] == 1 ? 1 : 2;
                    broad[i][j-1]   = broad[i][j-1]   == 1 ? 1 : 2;
                    broad[i-1][j]   = broad[i-1][j]   == 1 ? 1 : 2;
                    broad[i-1][j+1] = broad[i-1][j+1] == 1 ? 1 : 2;
                    broad[i][j+1]   = broad[i][j+1]   == 1 ? 1 : 2;
                    broad[i+1][j+1] = broad[i+1][j+1] == 1 ? 1 : 2;
                    broad[i+1][j]   = broad[i+1][j]   == 1 ? 1 : 2;
                    broad[i+1][j-1] = broad[i+1][j-1] == 1 ? 1 : 2;
                }
            }
            
        }
        
        for(int i=1;i<br_len-1;i++){
            
            for(int j=1;j<br_len-1;j++){
                System.out.print(broad[i][j]);
                if(broad[i][j] == 0){
                    answer++;
                }
            }
            System.out.println();
            
        }
        //출력
        System.out.print(" ");
        for(int i=0;i<br_len;i++){
            System.out.print(" "+i);
        }System.out.println();
        for(int i=0;i<br_len;i++){
            System.out.print(i+" ");
            for(int j=0;j<br_len;j++){
                
               
                System.out.print(broad[i][j]+" ");
            }
            System.out.println();
        }
        
        return answer;
    }
}