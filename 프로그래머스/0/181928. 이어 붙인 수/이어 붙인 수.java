import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int aa = Arrays.stream(num_list).filter(a->a%2==0).reduce(0,(a,b)->a*10+b);
        int bb = Arrays.stream(num_list).filter(a->a%2!=0).reduce(0,(a,b)->a*10+b);
        
        return aa+bb;
    }
}