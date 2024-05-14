import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int arr[] = new int[sum+1];
        Set<Integer> set = new HashSet<>();
        
        for(int i=2;i<=sum;i++){
            if(arr[i] == 0){
                set.add(i);
            }
            for(int j=i;j<=sum;j+=i){
                arr[j] = 1;
            }
        }
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(set.contains(nums[i]+nums[j]+nums[k])){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}