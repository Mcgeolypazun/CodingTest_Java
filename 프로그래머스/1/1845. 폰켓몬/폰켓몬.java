import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> intSet = new HashSet<Integer>();
        int getKetmon = nums.length/2;
        
        for(int i=0;i<nums.length;i++){
            intSet.add(nums[i]);
        }
        if(getKetmon >= intSet.size() ){
            System.out.println(intSet.size());
            return intSet.size();
        }
        else{
            System.out.println(intSet.size());
            return getKetmon;
        }
        
        
    }
}