import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] arr = new int[n*2];
        int answer = 0;
        int gap = 1;
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            arr[i] = elements[i];
            arr[i+n] = elements[i];
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tmp = 0;
                for(int k=j;k<j+gap;k++){
                    tmp += arr[k];
                }
                set.add(tmp);
            }
            gap++;
        }
        
        answer = set.size();
        return answer;
    }
}