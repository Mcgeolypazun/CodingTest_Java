import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = Arrays.stream(num_list).reduce(0,(len,n)->len+1); 
        
        
        
        return answer >= 11 ? Arrays.stream(num_list).reduce(0,(acc,n)->acc + n) : Arrays.stream(num_list).reduce(1,(acc,n)->acc*n);
    }
}