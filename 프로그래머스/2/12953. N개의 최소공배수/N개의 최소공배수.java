import java.util.*;
class Solution {
    
    public int findLCM(int[] arr){
        int lcm = 1;
        for(int i=0;i<arr.length;i++){
            lcm = (lcm * arr[i])/GCD(lcm,arr[i]);
        }
        
        return lcm;
    }
    
    public int GCD(int a,int b){
        while(b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
    
    public int solution(int[] arr) {
        int answer = findLCM(arr);
        
        return answer;
    }
}