import java.util.*;
class Solution {
    public static int k = 0;
    
    public void binaryToInt(int bin,int b){
        int a = 0;
        if(bin == 0){
            return ;
        }
        else{
            a = bin % 10;
            k += a * Math.pow(2,b);
            b++;
            binaryToInt(bin/10,b);
        }
    }
    
   
    
    public String solution(String bin1, String bin2) {
    	Solution T = new Solution();
        StringBuilder answer = new StringBuilder();
        
        T.binaryToInt(Integer.parseInt(bin1),0);
        T.binaryToInt(Integer.parseInt(bin2),0);
        System.out.println(k);
        
        while(true){
            if(k <= 0) break;
            
            int reminder = k % 2;
            answer.insert(0,reminder);
            k = k/2;
        }
        
        if(answer.length() == 0){
            answer.append("0");
        }
        
        return answer.toString();
    }
}